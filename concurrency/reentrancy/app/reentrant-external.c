#!/usr/bin/env crun
/* -Wall -O3 */
#include <sys/types.h>
#include <signal.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>

static sig_atomic_t external = 0;
static int interrupted = 0;

void handler(int);
int reentrant(int);

void handler(int num) {
    interrupted = 1;
    puts("interrupt: invoking reentrant()");
    int result = reentrant(2);
    printf("interrupt: result = %d\n", result);
}

int reentrant(int num) {
    pid_t pid = getpid();
    int local = ++external;

    printf("%d: incremented external to %d\n", num, external);
    printf("%d: saved external's value to a local variable\n", num);

   /* simulate an interrupt i.e. signal */
    if (!interrupted) {
        printf("%d: [interrupt] pausing execution\n\n", num);

        struct sigaction sa;
        memset(&sa, 0, sizeof(sa));
        sa.sa_handler = &handler;
        sigaction(SIGUSR1, &sa, NULL);
        kill(pid, SIGUSR1);

        printf("\n%d: [interrupt] resuming execution\n", num);
    }

    printf("%d: exiting while local variable = '%d' and external variable = '%d'\n", num, local, external);
    return local;
}

int main(void) {
    puts("main: invoking reentrant()");
    int result = reentrant(1);
    printf("main: result = %d\n", result);
    return 0;
}

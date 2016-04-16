#!/usr/bin/env crun
/* -Wall -O3 */
#include <sys/types.h>
#include <signal.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>

static int external = 0;
static int interrupted = 0;

void handler(int);
int non_reentrant(int);

void handler(int num) {
    interrupted = 1;
    puts("interrupt: invoking non_reentrant()");
    int result = non_reentrant(2);
    printf("interrupt: result = %d\n", result);
}

int non_reentrant(int num) {
    pid_t pid = getpid();

    external += 1;
    printf("%d: incremented external to %d\n", num, external);

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
    return external;
}

int main(void) {
    puts("main: invoking non_reentrant()");
    int result = non_reentrant(1);
    printf("main: result = %d\n", result);
    return 0;
}

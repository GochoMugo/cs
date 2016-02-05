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
void non_reentrant(int);

void handler(int num) {
    interrupted = 1;
    puts("invoking non_reentrant() in interrupt");
    non_reentrant(2);
}

void non_reentrant(int num) {
    pid_t pid = getpid();
    int local = ++external;

    printf("%d:[before interrupt] external = %d\n", num, local);

   /* simulate an interrupt i.e. signal */
    if (!interrupted) {
        struct sigaction sa;
        memset(&sa, 0, sizeof(sa));
        sa.sa_handler = &handler;
        sigaction(SIGUSR1, &sa, NULL);
        kill(pid, SIGUSR1);
    }

    printf("%d:[after interrupt] external = %d\n", num, local);
}

int main(void) {
    puts("invoking non_reentrant function in main()");
    non_reentrant(1);
    return 0;
}

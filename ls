#!/bin/sh

main() {
        if test -d .git; then
                gs
                /bin/ls -lh --color=auto "$@"
        else
                /bin/ls -lh --color=auto "$@"
        fi
}

main "$@"

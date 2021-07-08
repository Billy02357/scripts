#!/bin/sh

main() {
        /bin/ls -lh --color=auto "$@"
}

main "$@"

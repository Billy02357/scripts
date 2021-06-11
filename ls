#!/bin/sh

main() {
        /bin/ls --color=auto -l "$@"
}

main "$@"

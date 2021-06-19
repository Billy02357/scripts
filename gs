#!/bin/sh

main() {
        /bin/git status -sb "$@"
}

main "$@"

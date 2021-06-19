#!/bin/sh

main() {
        exec /bin/cp -iv "$@"
}

main "$@"

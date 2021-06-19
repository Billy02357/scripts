#!/bin/sh

main() {
        doas /bin/pacman "$@"
}

main "$@"

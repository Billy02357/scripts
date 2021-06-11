#!/bin/sh

main() {
        doas make "$@"
}

main "$@"

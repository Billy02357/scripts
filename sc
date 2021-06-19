#!/bin/sh

takeScreen() {
        if test -z "$1"; then
                maim -su > "screenshot_$(date +%Y_%m_%d_%M).png"
        else
                maim -su > "$1.png"
        fi
}

main() {
        takeScreen "$1" || exit 1
        exit 0
}

main "$@"

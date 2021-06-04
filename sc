#!/bin/sh

takeScreen() {
        if test -z "$1"; then
                maim -s > "screenshot_$(date +%Y_%m_%d_%M).png"
        else
                maim -s > "$1.png"
        fi
}

main() {
        takeScreen "$1" || exit 1
        exit 0
}

main "$@"

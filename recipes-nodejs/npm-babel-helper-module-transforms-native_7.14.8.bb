SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-transforms"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-module-imports-native \
           npm-babel-helper-replace-supers-native \
           npm-babel-helper-simple-access-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-helper-validator-identifier-native \
           npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.14.8.tgz"
SRC_URI[md5sum] = "a211142cf9ccf209d2de8fa57e397031"
SRC_URI[sha256sum] = "e76cedb5166bec0a333b6de176e43574461470b917a52031c0dfe6e854ee2d23"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native

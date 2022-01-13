SUMMARY = "NPM: execa"
DESCRIPTION = "Process execution for humans"
HOMEPAGE = "https://github.com/sindresorhus/execa#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "\
    nativesdk-npm-cross-spawn \
    nativesdk-npm-get-stream \
    nativesdk-npm-human-signals \
    nativesdk-npm-is-stream \
    nativesdk-npm-merge-stream \
    nativesdk-npm-npm-run-path \
    nativesdk-npm-onetime \
    nativesdk-npm-signal-exit \
    nativesdk-npm-strip-final-newline \
"

SRC_URI = "https://registry.npmjs.org/execa/-/execa-6.0.0.tgz"
SRC_URI[md5sum] = "7abd0ee00b0c86844bd30c370a349f5a"
SRC_URI[sha256sum] = "492a223e8e91e9feae15e8ed53e6cd9d28f78266b58b3623b7eb1763df50032a"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit nativesdk

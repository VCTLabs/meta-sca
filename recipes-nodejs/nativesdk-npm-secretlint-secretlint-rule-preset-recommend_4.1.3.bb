SUMMARY = "NPM: @secretlint/secretlint-rule-preset-recommend"
DESCRIPTION = "Recommended rule preset of secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-preset-recommend/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "\
    nativesdk-npm-secretlint-secretlint-rule-aws \
    nativesdk-npm-secretlint-secretlint-rule-basicauth \
    nativesdk-npm-secretlint-secretlint-rule-filter-comments \
    nativesdk-npm-secretlint-secretlint-rule-gcp \
    nativesdk-npm-secretlint-secretlint-rule-github \
    nativesdk-npm-secretlint-secretlint-rule-npm \
    nativesdk-npm-secretlint-secretlint-rule-privatekey \
    nativesdk-npm-secretlint-secretlint-rule-sendgrid \
    nativesdk-npm-secretlint-secretlint-rule-slack \
"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-preset-recommend/-/secretlint-rule-preset-recommend-4.1.3.tgz"
SRC_URI[md5sum] = "139b3521527a786f7415f4ed763db225"
SRC_URI[sha256sum] = "ab822d63e8deb5833dc3d0a00d7ff7d498b84e5c9e69c179f565c7862c24e284"

NPM_PKGNAME = "@secretlint/secretlint-rule-preset-recommend"

inherit npmhelper
inherit nativesdk

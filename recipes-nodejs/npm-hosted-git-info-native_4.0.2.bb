SUMMARY = "NPM: hosted-git-info"
DESCRIPTION = "Provides metadata and conversions from repository urls for GitHub, Bitbucket and GitLab"
HOMEPAGE = "https://github.com/npm/hosted-git-info"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a01f10cd299d5727263720d47cc2c908"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/hosted-git-info/-/hosted-git-info-4.0.2.tgz"
SRC_URI[md5sum] = "72ca81ed6ad66d2474ce51d06fb2f907"
SRC_URI[sha256sum] = "6097db42df00835669526fc9b28fdad2830eb579dfd3a6c2860619d8a34a3519"

NPM_PKGNAME = "hosted-git-info"

inherit npmhelper
inherit native

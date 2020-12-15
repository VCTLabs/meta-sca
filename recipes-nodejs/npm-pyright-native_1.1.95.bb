SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.95.tgz"
SRC_URI[md5sum] = "aa9ff63cf49540928aceb7c57e8bc30c"
SRC_URI[sha256sum] = "39c4a143e531582c9f40fe52cbdeb498afc6f35098a1cce78f51452eae28e668"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native

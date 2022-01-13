SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "nativesdk-python3"

SRC_URI = "git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=https;branch=master"
SRCREV = "78a91671d5e78c3f5d4a9501089bda0475cf9e64"
S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "kconfighard"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
FILES:${PN} += "${bindir}"

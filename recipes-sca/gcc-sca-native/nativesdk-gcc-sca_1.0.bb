SUMMARY = "SCA description for gcc"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"
inherit sca-description
inherit nativesdk
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "gcc"

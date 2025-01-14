SUMMARY = "SPDX parser and tools"
HOMEPAGE = "https://github.com/spdx/tools-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc7f21ccff0f672f2a7cd6f412ae627d"

DEPENDS += "\
             python3-click-native \
             python3-ply-native \
             python3-pyyaml-native \
             python3-rdflib-native \
             python3-six-native \
             python3-xmltodict-native \
            "

PYPI_PACKAGE = "spdx-tools"

SRC_URI[md5sum] = "1239fad0931b5117bec99251bca51b4a"
SRC_URI[sha256sum] = "975e6dbba88f105a8acb22abf53fe90f0e9d5635a2b9b1fe487781e969623b17"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-click \
    nativesdk-python3-ply \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rdflib \
    nativesdk-python3-six \
    nativesdk-python3-xmltodict \
"

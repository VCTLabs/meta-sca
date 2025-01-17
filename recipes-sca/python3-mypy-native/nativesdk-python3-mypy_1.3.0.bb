SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ba8ec528da02073b7e1f4124c0f836f"

DEPENDS += "\
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    python3-tomli-native \
"

SRC_URI[md5sum] = "27febd851a782a1599ed11d366ffcebb"
SRC_URI[sha256sum] = "e1f4d16e296f5135624b34e8fb741eb0eadedca90862405b1f1fde2040b9bd11"

PYPI_PACKAGE = "mypy"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "mypy"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-difflib \
    nativesdk-python3-distutils \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-netclient \
    nativesdk-python3-pickle \
    nativesdk-python3-pytest \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-threading \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-unittest \
"

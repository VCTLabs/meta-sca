SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "68b3517fdd6fbe54d9a8eb141340eabb"
SRC_URI[sha256sum] = "2d932ea08814f745863fd20172fe7de4794ad74567db78f2377343e24520a5b6"

inherit pypi
inherit setuptools3
inherit native

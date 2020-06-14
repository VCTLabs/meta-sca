SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b15979c39a2543892fca8cd86b4b52cb"

PYPI_PACKAGE = "wcwidth"

SRC_URI[md5sum] = "5e6cd8cd008a7ad2c2578ac49a9d87a1"
SRC_URI[sha256sum] = "8c6b5b6ee1360b842645f336d9e5d68c55817c26d3050f46b235ef2bc650e48f"

inherit pypi
inherit native
inherit setuptools3

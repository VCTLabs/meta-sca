SUMMARY = "An enterprise friendly way of detecting and preventing secrets in code. "
DESCRIPTION = "An enterprise friendly way of detecting and preventing secrets in code. "
HOMEPAGE = "https://github.com/Yelp/detect-secrets"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c3c8615794b2f159ecd80b4c32f2f8f"

SRC_URI = "git://github.com/Yelp/detect-secrets.git;protocol=https;tag=v${PV}"
S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-pyyaml-native ${PYTHON_PN}-requests-native"

inherit native
inherit sca-sanity
inherit setuptools3

SRC_URI += "file://detectsecrets.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/detectsecrets.sca.description ${D}${datadir}

    # Remove the requests from the requires.txt, as this isn't working
    # for whatever reasons, no matter is requests is available or not
    find ${D} -name "requires.txt" -exec sed -i "/requests/d" {} +
}

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://xmllint.sca.description"

inherit sca-sanity

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
}

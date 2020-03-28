SUMMARY = "SCA ruleset for sudokiller at images"
DESCRIPTION = "Rules to configure how sudokiller is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/sudokiller-image-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/sudokiller-image-fatal"
}

FILES_${PN} = "${datadir}"

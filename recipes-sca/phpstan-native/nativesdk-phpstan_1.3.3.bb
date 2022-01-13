SUMMARY = "PHP Static Analysis Tool - discover bugs in your code without running it!"
HOMEPAGE = "https://github.com/phpstan/phpstan"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd7d90c38753ff54df51817ac7d4e5ff"

SRC_URI = "git://github.com/phpstan/phpstan.git;branch=master;protocol=https"
SRCREV = "151a51f6149855785fbd883e79768c0abc96b75f"
PHPCOMPOSER_PKGS_NAME = "phpstan/phpstan:${PV}"

S = "${WORKDIR}/git"
inherit phpcomposer
inherit sca-description
inherit nativesdk
SCA_TOOL_DESCRIPTION = "phpstan"
do_compile:prepend() {
    rm -f ${S}/composer.json ${S}/composer.lock
}
FILES:${PN} = "${bindir}"

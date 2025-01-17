SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "fffbbabd7672a3b2f60768083aac5149"
SRC_URI[sha256sum] = "3de79b0ea03a8d6a93e9d9128fe845fb556222b14699a4f6f0d5ca057ae3333b"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit cpan
inherit nativesdk

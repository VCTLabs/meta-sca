SUMMARY = "Ansible is the simplest way to automate apps and IT infrastructure"
DESCRIPTION = "Ansible is a simple IT automation platform that makes your applications and systems easier to deploy"
HOMEPAGE = "https://github.com/ansible/ansible/"
SECTION = "devel/python"

DEPENDS += "\
    python3-ansible-core-native \
    python3-cryptography-native \
    python3-jinja2-native \
    python3-packaging-native \
    python3-pyyaml-native \
    python3-resolvelib-native \
"

DEFAULT_PREFERENCE = "-1"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f0e2cd40e05189ec81232da84bd6e1a"

PYPI_PACKAGE = "ansible"

SRC_URI[md5sum] = "0e3b4995799bec644a9a22829bb9076a"
SRC_URI[sha256sum] = "006504b4ba5f355073e0b3f10f317a5684c0ce7a35798b18fa18fbffaedab2a6"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
    # replace hardcoded python shebang
    find ${D} -type f -exec sed -i -e '1s,#\!.*python3,#! /usr/bin/env python3,' {} \;
    # remove blanks from filename
    mv "${D}${PYTHON_SITEPACKAGES_DIR}/ansible_collections/community/network/tests/integration/targets/ce_is_is_view/tests/netconf/test_ce_is_is_view_entity .yaml" \
       "${D}${PYTHON_SITEPACKAGES_DIR}/ansible_collections/community/network/tests/integration/targets/ce_is_is_view/tests/netconf/test_ce_is_is_view_entity.yaml"
}


## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_recipe"

python do_sca_deploy_xmllint_recipe() {
    sca_conv_deploy(d, "xmllint", "txt")
}

addtask do_sca_xmllint_core before do_install after do_compile
addtask do_sca_deploy_xmllint_recipe before do_package after do_sca_xmllint_core

DEPENDS += "sca-recipe-xmllint-rules-native"

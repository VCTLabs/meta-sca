## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-wotan-core

SCA_DEPLOY_TASK = "do_sca_deploy_wotan_recipe"

python do_sca_deploy_wotan_recipe() {
    sca_conv_deploy(d, "wotan", "json")
}

addtask do_sca_wotan_core before do_install after do_compile
addtask do_sca_deploy_wotan_recipe before do_package after do_sca_wotan_core

DEPENDS += "sca-recipe-wotan-rules-native"

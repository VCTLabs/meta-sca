## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-pyright-core
inherit sca-global

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_pyright_recipe"

python do_sca_deploy_pyright_recipe() {
   sca_conv_deploy(d, "pyright", "txt")
}

addtask do_sca_pyright_core before do_install after do_compile
addtask do_sca_deploy_pyright_recipe before do_package after do_sca_pyright_core

DEPENDS += "sca-recipe-pyright-rules-native"
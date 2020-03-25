## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-vulture-core
inherit sca-global

inherit python3-dir

SCA_DEPLOY_TASK = "do_sca_deploy_vulture_image"

python do_sca_deploy_vulture_image() {
    sca_conv_deploy(d, "vulture", "txt")
}

addtask do_sca_vulture_core before do_image_complete after do_image
addtask do_sca_deploy_vulture_image before do_image_complete after do_sca_vulture_core

DEPENDS += "sca-image-vulture-rules-native"
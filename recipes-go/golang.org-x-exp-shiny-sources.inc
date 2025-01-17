SRC_URI += "https://proxy.golang.org/golang.org/x/exp/shiny/@v/v0.0.0-20230522175609-2e198f4a06a1.zip;srcoutput=golang.org/x/exp/shiny;srcinput=golang.org/x/exp/shiny@v0.0.0-20230522175609-2e198f4a06a1;downloadfilename=golang-org-x-exp-shiny-0.0.0-20230522175609-2e198f4a06a1.zip;name=golang-org-x-exp-shiny"
SRC_URI[golang-org-x-exp-shiny.sha256sum] = "6ca69d10d16707bcbb8bb07e0f837983e698ce7d6c5ea0260e8aa59fa924a0fe"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/shiny/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/golang.org/x/exp/shiny/materialdesign/icons/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-shiny-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'dmitri.shuralyov.com-gpu-mtl-sources.inc', '', 'dmitri.shuralyov.com-gpu-mtl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jezek-xgb-sources.inc', '', 'github.com-jezek-xgb-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mobile-sources.inc', '', 'golang.org-x-mobile-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}

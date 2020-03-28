SUMMARY = "YAML support for the Go language"
HOMEPAGE = "https://github.com/go-yaml/yaml"

SRC_URI = "git://github.com/go-yaml/yaml;protocol=https;branch=v2;tag=v${PV}"

GO_IMPORT ?= "github.com/go-yaml/yaml"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS += "github.com-go-check-check-native"

inherit go
inherit native

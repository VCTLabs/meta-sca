SUMMARY = "go.mod: github.com/cpuguy83/go-md2man/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/cpuguy83/go-md2man/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-cpuguy83-go-md2man-v2-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-russross-blackfriday-v2"
GO_IMPORT = "github.com/cpuguy83/go-md2man/v2"
inherit gosrc
inherit nativesdk

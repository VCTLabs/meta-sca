SUMMARY = "go.mod: github.com/aymerick/douceur"
HOMEPAGE = "https://pkg.go.dev/github.com/aymerick/douceur"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-aymerick-douceur-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gorilla-css \
    nativesdk-github.com-puerkitobio-goquery \
    nativesdk-golang.org-x-net \
"
GO_IMPORT = "github.com/aymerick/douceur"
inherit gosrc
inherit nativesdk

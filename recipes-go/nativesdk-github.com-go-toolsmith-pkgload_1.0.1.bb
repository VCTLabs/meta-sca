SUMMARY = "go.mod: github.com/go-toolsmith/pkgload"
HOMEPAGE = "https://pkg.go.dev/github.com/go-toolsmith/pkgload"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-toolsmith-pkgload-sources.inc
EXTRA_DEPENDS += "nativesdk-golang.org-x-tools"
GO_IMPORT = "github.com/go-toolsmith/pkgload"
inherit gosrc
inherit nativesdk

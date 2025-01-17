SUMMARY = "go.mod: github.com/dustin/go-humanize"
HOMEPAGE = "https://pkg.go.dev/github.com/dustin/go-humanize"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-dustin-go-humanize-sources.inc

GO_IMPORT = "github.com/dustin/go-humanize"
inherit gosrc
inherit nativesdk

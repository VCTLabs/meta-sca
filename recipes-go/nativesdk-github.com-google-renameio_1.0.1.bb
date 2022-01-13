SUMMARY = "go.mod: github.com/google/renameio"
HOMEPAGE = "https://pkg.go.dev/github.com/google/renameio"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-renameio-sources.inc
GO_IMPORT = "github.com/google/renameio"
inherit gosrc
inherit nativesdk

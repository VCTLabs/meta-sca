SUMMARY = "go.mod: github.com/Microsoft/go-winio"
HOMEPAGE = "https://pkg.go.dev/github.com/Microsoft/go-winio"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-microsoft-go-winio-sources.inc

EXTRA_DEPENDS += "\
    github.com-sirupsen-logrus-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/Microsoft/go-winio"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"
# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native

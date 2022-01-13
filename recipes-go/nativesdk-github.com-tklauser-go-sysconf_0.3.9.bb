SUMMARY = "go.mod: github.com/tklauser/go-sysconf"
HOMEPAGE = "https://pkg.go.dev/github.com/tklauser/go-sysconf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-tklauser-go-sysconf-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-tklauser-numcpus \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/tklauser/go-sysconf"
inherit gosrc
inherit nativesdk

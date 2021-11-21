SUMMARY = "go.mod: github.com/jackc/puddle"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/puddle"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "-1"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-puddle-sources.inc

GO_IMPORT = "github.com/jackc/puddle"

inherit gosrc
inherit native

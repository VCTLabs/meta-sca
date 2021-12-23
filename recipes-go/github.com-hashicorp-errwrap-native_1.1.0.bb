SUMMARY = "go.mod: github.com/hashicorp/errwrap"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/errwrap"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-errwrap-sources.inc

GO_IMPORT = "github.com/hashicorp/errwrap"

inherit gosrc
inherit native

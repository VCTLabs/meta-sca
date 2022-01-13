SUMMARY = "go.mod: github.com/gobuffalo/fizz"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/fizz"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-fizz-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gobuffalo-plush-v4 \
    nativesdk-github.com-kballard-go-shellquote \
    nativesdk-github.com-masterminds-semver-v3 \
"
GO_IMPORT = "github.com/gobuffalo/fizz"
inherit gosrc
inherit nativesdk

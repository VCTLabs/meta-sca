SUMMARY = "go.mod: github.com/go-playground/validator/v10"
HOMEPAGE = "https://pkg.go.dev/github.com/go-playground/validator/v10"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-playground-validator-v10-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-go-playground-locales \
    nativesdk-github.com-go-playground-universal-translator \
    nativesdk-github.com-leodido-go-urn \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "github.com/go-playground/validator/v10"
inherit gosrc
inherit nativesdk

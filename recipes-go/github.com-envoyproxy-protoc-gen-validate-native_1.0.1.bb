SUMMARY = "go.mod: github.com/envoyproxy/protoc-gen-validate"
HOMEPAGE = "https://pkg.go.dev/github.com/envoyproxy/protoc-gen-validate"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-envoyproxy-protoc-gen-validate-sources.inc

EXTRA_DEPENDS += "\
    github.com-iancoleman-strcase-native \
    github.com-lyft-protoc-gen-star-v2-native \
    golang.org-x-lint-native \
    golang.org-x-net-native \
    golang.org-x-tools-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/envoyproxy/protoc-gen-validate"

inherit gosrc
inherit native

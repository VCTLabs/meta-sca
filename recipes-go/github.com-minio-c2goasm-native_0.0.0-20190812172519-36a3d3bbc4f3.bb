SUMMARY = "go.mod: github.com/minio/c2goasm"
HOMEPAGE = "https://pkg.go.dev/github.com/minio/c2goasm"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-minio-c2goasm-sources.inc

GO_IMPORT = "github.com/minio/c2goasm"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native

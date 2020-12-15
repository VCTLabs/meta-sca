SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-telemetry \
                  ruby-faraday \
                  ruby-hashie \
                  ruby-license-acceptance \
                  ruby-method-source \
                  ruby-mixlib-log \
                  ruby-multipart-post \
                  ruby-parallel \
                  ruby-parslet \
                  ruby-pry \
                  ruby-rspec \
                  ruby-rspec-its \
                  ruby-rubyzip \
                  ruby-semverse \
                  ruby-sslshake \
                  ruby-thor \
                  ruby-tomlrb \
                  ruby-train-core \
                  ruby-tty-prompt \
                  ruby-tty-table"

SRC_URI[md5sum] = "23b94b973538d6a3543953575c9c4646"
SRC_URI[sha256sum] = "ffa645ef232915b7cf31dcdd9acb3e5b8aad00ad9c023728350ba9ac090b3806"

GEM_NAME = "inspec-core"

inherit rubygems

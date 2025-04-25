SUMMARY = "Unit networking packages"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " curl"
RDEPENDS:${PN}:append = " openssh"
RDEPENDS:${PN}:append = " openssh-authorized-keys"
RDEPENDS:${PN}:append = " python3-speedtest-cli"
RDEPENDS:${PN}:append = " wireguard-tools"
RDEPENDS:${PN}:append = " systemd-wgkeygen"
RDEPENDS:${PN}:append = " ufw"
RDEPENDS:${PN}:append = " bind-utils"

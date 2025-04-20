SUMMARY = "Systemd service for generating wireguard keys for device"
SECTION = "core"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SYSTEMD_SERVICE:${PN} = "wgkeygen.service"

SRC_URI = "\
    file://wgkeygen.service \
"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -D -p -m0644 ${S}/wgkeygen.service ${D}${systemd_system_unitdir}/wgkeygen.service
}

inherit systemd

FILES:${PN} = "\
    ${systemd_system_unitdir} \
"

RDEPENDS:${PN} = "\
    wireguard-tools \
"

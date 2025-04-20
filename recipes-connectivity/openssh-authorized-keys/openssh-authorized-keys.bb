SUMMARY = "Add authorized keys for SSH"
DESCRIPTION = "Add authorized public keys for SSH public key authentication"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://authorized_keys"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${sysconfdir}/ssh
    install -m 0700 ${UNPACKDIR}/authorized_keys ${D}${sysconfdir}/ssh
}

FILES:${PN} = "${sysconfdir}/ssh/authorized_keys"

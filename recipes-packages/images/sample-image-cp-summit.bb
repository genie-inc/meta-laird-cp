DESCRIPTION = "Summit 60 Series (PCIE/UART) sample image"
LICENSE = "MIT"

inherit core-image

export IMAGE_BASENAME = "${PN}"

IMAGE_FEATURES += "\
	ssh-server-dropbear \
	splash \
	"

IMAGE_FEATURES_remove = "\
	tools-profile \
	tools-debug \
	tools-testapps \
	"

IMAGE_INSTALL += "\
	iproute2 \
	rng-tools \
	ca-certificates \
	tzdata \
	alsa-utils \
	htop \
	ethtool \
	iperf3 \
	tcpdump \
	iw \
	kernel-module-summit-backports-laird \
	summit60-firmware-pcie-uart \
	lrd-bt-uart-scripts \
	summit-supplicant \
	adaptive-ww \
	lrd-networkmanager-summit \
	lrd-networkmanager-summit-nmcli \
	"

SUMMARY = "Digilent base image"

IMAGE_FEATURES += "splash ssh-server-openssh debug-tweaks"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    htop \
    btop \
    "


#Example of customization
IMAGE_INSTALL:append:genesys = " vim"
IMAGE_INSTALL:append:genesys-3eg = " vim"
IMAGE_INSTALL:append:genesys-5ev = " vim"

IMAGE_FSTYPES:append = " wic"

WKS_FILE = "base.wks.in"

inherit core-image

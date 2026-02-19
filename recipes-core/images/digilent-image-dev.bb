SUMMARY = "NI Linux Embedded development image"

IMAGE_FEATURES += "splash ssh-server-openssh package-management debug-tweaks tools-sdk tools-debug"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    valgrind \
    devmem2 \
    tcpdump \
    "

#IMAGE_INSTALL:append:genesyszu-3eg = " test"
#IMAGE_INSTALL:append:genesyszu-5ev = " test"

inherit core-image

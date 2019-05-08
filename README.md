# Marvin libcore

This repository is a fork of the Android Open Source Project's `libcore`
repository (tag `android-7.1.1_r57`) with its version of OpenJDK modified to
support the changes to ART made in our MRT prototype in the `marvin-art`
repository. The changes are minimal and consist of adding more "shadow member
variables" to the `Object` class definition to match the bytes added to the
object header in ART.

See the file `README.md` in the `marvin-art` repo (which should be hosted on
the same site as this repo) for instructions on how to compile and run our MRT
prototype.

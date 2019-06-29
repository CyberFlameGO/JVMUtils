package net.greemdev.utils.tests

import net.greemdev.utils.File
import java.nio.charset.Charset

fun testFileRead() {
    File.read(java.io.File("lol.txt"), Charset.forName("UTF-8"))
}
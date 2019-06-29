package net.greemdev.utils

import org.apache.commons.io.FileUtils
import java.io.File
import java.nio.charset.Charset

object File {

    @JvmStatic fun read(file: File, charset: Charset): String = FileUtils.readFileToString(file, charset)

    @JvmStatic fun read(filePath: String): String = read(File(filePath), Charset.forName("UTF-8"))

}
package se.callistaenterprise.demo

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

fun writeToFile(fileName: String) {
    // "use lambda" replaces Java's "open with resource"
    BufferedWriter(FileWriter(fileName)).use { writer ->
        // No checked exceptions: the function doesn't have to declare that it throws IOException
        writer.write("New file \n")
        throw IOException()
    }
}

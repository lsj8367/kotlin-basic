package com.github.lsj8367.exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun readFile() { // throws를 하지 않는 이유는 Kotlin은 Checked/Unchecked Exception이 없이 전부 Unchecked 이기 때문
    val reader = File(".")
    val newFile = File(reader.absolutePath + "/a.txt")
    val fileReader = BufferedReader(FileReader(newFile))
    println(fileReader.readLine())
    fileReader.close()
}

fun main() {
    readFile()
}

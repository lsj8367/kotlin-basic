package com.github.lsj8367.exception

import java.io.BufferedReader
import java.io.FileReader

class FilePrinter {
    fun readFile(path: String) {
        // try-with-resource는 없고 use를 사용하여 구현한다.
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}

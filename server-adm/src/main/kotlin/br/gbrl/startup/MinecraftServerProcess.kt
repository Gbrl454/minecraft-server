package br.gbrl.startup

import jakarta.inject.Singleton
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.*

lateinit var process: Process
lateinit var writer: BufferedWriter

@Singleton
@OptIn(DelicateCoroutinesApi::class)
class MinecraftServerProcess {

    fun startUp() {
        process = ProcessBuilder(
            "java", "-Xmx2G", "-Xms2G", "-jar", "server.jar", "nogui"
        ).directory(File("../../../../../quarkus-server")).redirectErrorStream(true).start()

        writer = BufferedWriter(OutputStreamWriter(process.outputStream))

        GlobalScope.launch {
            BufferedReader(InputStreamReader(process.inputStream)) //
                .lines() //
                .forEach {

                    println("MCS >>> $it")
                }
        }
    }
}

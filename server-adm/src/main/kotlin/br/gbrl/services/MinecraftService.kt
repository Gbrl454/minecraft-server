package br.gbrl.services

import br.gbrl.startup.writer
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class MinecraftService {
    fun sendCommand(cmd: String) {
        writer.write(cmd)
        writer.flush()
    }
}

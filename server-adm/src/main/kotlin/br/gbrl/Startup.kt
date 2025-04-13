package br.gbrl

import br.gbrl.startup.MinecraftServerProcess
import io.quarkus.logging.Log
import io.quarkus.runtime.Startup
import jakarta.annotation.PostConstruct
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@Startup
@ApplicationScoped
class Startup {

    @Inject
    lateinit var minecraftServerProcess: MinecraftServerProcess

    @PostConstruct
    fun runOnStartup() {
        Log.info("Iniciando projeto...")
        minecraftServerProcess.startUp()
        Log.info("Projeto iniciado.")
    }
}

package br.gbrl.resources

import br.gbrl.services.MinecraftService
import jakarta.inject.Inject
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.QueryParam
import jakarta.ws.rs.core.Response

@Path("/mc")
class MinecraftResource(@Inject var mcService: MinecraftService) {

    @POST
    @Path("/cmd")
    fun sendCommand(@QueryParam("cmd") cmd: String): Response {
        mcService.sendCommand(cmd)
        return Response.ok().build()
    }
}

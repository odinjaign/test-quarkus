package top.jaign;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public CompletionStage<String> hello(@PathParam("name") String name) {
        return CompletableFuture.supplyAsync(() -> String.format("Hello, %s!", name));
    }
}

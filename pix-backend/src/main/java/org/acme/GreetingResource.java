package org.acme;

import java.util.Random;
import org.jboss.logging.Logger;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    Random random = new Random();

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws InterruptedException {
        int sleep = random.nextInt(100) + 200;
        logger.info("sleep: "+ sleep);
        Thread.sleep(sleep);
        return "Hello from Quarkus REST";
    }
}

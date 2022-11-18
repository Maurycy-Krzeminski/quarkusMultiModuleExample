package org.example;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@ApplicationScoped
public class AResource {
    @GET
    public String string(){
        return "test";
    }
}

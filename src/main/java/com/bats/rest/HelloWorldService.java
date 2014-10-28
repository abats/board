package com.bats.rest;

import com.bats.entities.Messages;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Path("/hello")
public class HelloWorldService {

    private static final String PERSISTENCE_UNIT_NAME = "messages";
    private static EntityManagerFactory factory;

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/arno")
    public Response arnoResponse() {
        String output = "Hoi Rekha!!";

        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/jsontest")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Messages> jsonTest() {

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        EntityManager em = factory.createEntityManager();

        // read the existing entries and write to console
        Query query = em.createQuery("select m from Messages m");

        List<Messages> messageList = query.getResultList();

        System.out.println("Hoi");
        System.out.println( messageList.get(0));

        return messageList;
    }

}

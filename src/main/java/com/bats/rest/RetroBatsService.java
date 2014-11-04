package com.bats.rest;

import com.bats.entities.Messages;
import com.bats.entities.Notes;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

import org.apache.log4j.Logger;

@Path("/hello")
public class RetroBatsService {

    private static final String PERSISTENCE_UNIT_NAME = "messages";
    private static EntityManagerFactory factory;
    static Logger logger = Logger.getLogger(RetroBatsService.class.getName());

    @GET
    @Path("/paramtest/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Messages> messagesResponse() {

        logger.info("/messages called");

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        EntityManager em = factory.createEntityManager();

        Query query = em.createQuery("select m from Messages m");

        List<Messages> messageList = query.getResultList();

        return messageList;
    }

    @GET
    @Path("/notes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Notes> notesResponse() {

        logger.info("/notes called");

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        EntityManager em = factory.createEntityManager();

        Query query = em.createQuery("select m from Notes m");

        List<Notes> notesList = query.getResultList();

        return notesList;

    }
}

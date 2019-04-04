package com.isis.adventureISIServer.capitalist;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pv-ni
 */
@Path("generic") 
public class Webservices {

    Services services;

    public Webservices() {
        services = new Services();
    }

    @GET   //Quel import utiliser ?
    @Path("world")
    //@Produces(MediaType.APPLICATION_XML)
    //On modifie l'anotation
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getXml(@Context HttpServletRequest request) throws JAXBException {
        String username = request.getHeader("X-user");
      //  return Response.ok(services.readWorldFromXml(username)).build();
      return Response.ok(services.readWorldFromXml()).build();
    }
 


}

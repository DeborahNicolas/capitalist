package com.isis.adventureISIServer.capitalist;

import com.isis.adventureISIServer.capitalist.Webservices;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pv-ni jii
 */
@Component
@ApplicationPath("/capitalist")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(Webservices.class);

        register(CORSResponseFilter.class);
    }
}

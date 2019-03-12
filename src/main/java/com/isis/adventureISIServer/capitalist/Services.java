package com.isis.adventureISIServer.capitalist;


import generated.World;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.InputStream;
//import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pv-ni
 */
public class Services {

    //lire le fichier XML conçu dans la section précédente et le retourner sous la forme d’un objet Java de type World
    public World readWorldFromXml() {
        
        //Pointeur sur le document world.xml
        InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");

        //On déclare la variable monde de type World pour l'utiliser dans le try catch
        World monde = null;

        //On utilise le tp JAXB : On récupère l’objet Java de type World correspondant à notre document XML
        try {
            JAXBContext cont = JAXBContext.newInstance(World.class);
            Unmarshaller u = cont.createUnmarshaller();
            monde = (World) u.unmarshal(new File("world.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //On retourne sous la forme d'un objet java de type World
        return monde;
    }

    //réaliser l’opération symétrique
    public void saveWordlToXml(World world) throws JAXBException {

       // OutputStream output = new FileOutputStream(file); 
       
       //Récupérer les objets java
       //Sérialiser dans le document world2.xml 
        JAXBContext cont = JAXBContext.newInstance(World.class);
        Marshaller m = cont.createMarshaller();
        m.marshal(world, new File("world2.xml"));

    }

}

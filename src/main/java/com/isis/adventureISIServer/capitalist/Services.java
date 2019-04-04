package com.isis.adventureISIServer.capitalist;


import generated.World;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import static org.apache.naming.ContextBindings.getClassLoader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pv-ni
 */
//public class Services {
    
    

    //lire le fichier XML conçu dans la section précédente et le retourner sous la forme d’un objet Java de type World
 //   public World readWorldFromXml(String username) {
             
        //Pointeur sur le document world.xml
      //  InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
      // On le modifie pour l'ajout des mondes par identifiant
    // InputStream mondeCapitalist= null;
      
      
        //On déclare la variable monde de type World pour l'utiliser dans le try catch
      //  World monde = null;
        
        
        
        //Si le joueur a déjà commencé une partie, il recupère ses données
    //    try{
    //        File mondeUsername = new File (username + "world.xml");
    //        mondeCapitalist = new FileInputStream(mondeUsername);
    //    } 
        //Sinon, création d'un nouveau monde
    //    catch (Exception e) {
     //       mondeCapitalist = getClass().getClassLoader().getResourceAsStream("world.xml");
      //  }

        //On utilise le tp JAXB : On récupère l’objet Java de type World correspondant à notre document XML
      //  try {
    //        JAXBContext cont = JAXBContext.newInstance(World.class);
    //        Unmarshaller u = cont.createUnmarshaller();
     //       monde = (World) u.unmarshal(mondeCapitalist); // On le modifie pour faire en sorte que ce soit pas world.xml qui soit appelé mais celui qui a déjà été créé par le joueur
     //   } catch (Exception e) {
     //       e.printStackTrace();
      //  }

        //On retourne sous la forme d'un objet java de type World
   //     return monde;
   // }

    //réaliser l’opération symétrique
    //public void saveWordlToXml(World world, String username) {
        
      //  OutputStream output = new FileOutputStream(file); 
       
       //Récupérer les objets java
       //Sérialiser dans le document world2.xml 
       //JAXBContext cont = JAXBContext.newInstance(World.class);
        //Marshaller m = cont.createMarshaller();
       // m.marshal(world, new File("world2.xml"));

       
     //  File mondeUsername = new File (username + "world.xml");
     //  JAXBContext cont;
        
       // try{
            //On sérialise le document comme c'était fait précedemment
         //   cont = JAXBContext.newInstance(World.class);
        //    Marshaller m = cont.createMarshaller();
        //    m.marshal(world, mondeUsername); // On change pour qu'il sérialise le monde déjà commencé
      //  }
      //  catch (Exception e) {
            //Si ça marche pas il faut que le joueur se connecte à son monde
        //    Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, e);
      //  }
       
   // }
    
 //   public World getWorld(String username) throws FileNotFoundException, JAXBException, IOException {
   //     World world;
    //    world = this.readWorldFromXml(username);
    //    if (world.getLastupdate() == 0){
      //      world.setLastupdate(System.currentTimeMillis());
      //      this.saveWordlToXml(world, username);
     //   }
    //    return world;
   // }

//}


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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagit.dao;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import practicagit.entidades.Producto;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class ProductoDAO {

    
    public void crearProducto(Producto producto){
    
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("PracticaGitPU");
        EntityManager em= emf.createEntityManager();
        
        try{
            Producto pr=new Producto();
            pr.setIDproducto(UUID.randomUUID().toString());
            pr.setCantidad(4);
            pr.setNombre("Fideos");
            pr.setPrecio(56.4);
//            Falta setear el proveedor pero no tengo ganas
            em.getTransaction().begin();
            em.persist(pr);
            em.getTransaction().commit();
        
        }catch (Exception e){
            e.getMessage();
        }
        
    }
}

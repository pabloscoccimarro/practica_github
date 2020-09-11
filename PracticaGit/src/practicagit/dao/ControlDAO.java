/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagit.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
public class ControlDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-libreriaPU");
    private final EntityManager em = emf.createEntityManager();
    
    
}

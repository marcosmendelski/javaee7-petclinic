/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.dao;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.woehlke.javaee7.petclinic.entities.Ocorrencia;
import org.woehlke.javaee7.petclinic.entities.Specialty;
import org.woehlke.javaee7.petclinic.entities.Vet;

/**
 *
 * @author 09200199
 */

public class OcorrenciaDaoImpl implements OcorrenciaDao {

     private static Logger log = Logger.getLogger(OcorrenciaDaoImpl.class.getName());
    @PersistenceContext(unitName="javaee7petclinic")
    private EntityManager entityManager;
    
    public List<Ocorrencia> getAll(){
        TypedQuery<Ocorrencia> o =  entityManager.createQuery("select o from Ocorrencia o order by o.descricao,o.tipoOc", Ocorrencia.class);
        List<Ocorrencia> list =  o.getResultList();
        return list;
    }
    public void addNew(Ocorrencia oc) {
        log.info("addNewVet: "+oc.toString());
        entityManager.persist(oc);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public void update(Ocorrencia oc) {
        entityManager.merge(oc);
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Specialty findById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    


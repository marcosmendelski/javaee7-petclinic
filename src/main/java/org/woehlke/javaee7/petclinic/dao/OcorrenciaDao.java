/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.dao;

import java.util.List;
import org.woehlke.javaee7.petclinic.entities.Ocorrencia;
import org.woehlke.javaee7.petclinic.entities.Specialty;

/**
 *
 * @author marcos
 */
public interface OcorrenciaDao {
    
     List<Ocorrencia> getAll();

    void delete(long id);

    void addNew(Ocorrencia oc);

    Specialty findById(long id);

    void update(Ocorrencia oc);
    
}

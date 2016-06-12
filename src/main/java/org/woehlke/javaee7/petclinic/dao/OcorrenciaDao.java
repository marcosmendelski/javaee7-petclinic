/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.dao;

import org.woehlke.javaee7.petclinic.entities.Ocorrencia;

/**
 *
 * @author 09200199
 */
public interface OcorrenciaDao {
    
    void addNew (Ocorrencia oc);
    
   Ocorrencia findById (long ocId);

    void update(Ocorrencia oc);
}

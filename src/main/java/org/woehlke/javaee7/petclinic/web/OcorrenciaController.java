/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woehlke.javaee7.petclinic.web;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.richfaces.component.SortOrder;
import org.woehlke.javaee7.petclinic.dao.OcorrenciaDao;

import org.woehlke.javaee7.petclinic.entities.Ocorrencia;

/**
 *
 * @author marcos
 */

@ManagedBean
@SessionScoped

public class OcorrenciaController implements Serializable {
 @EJB
    

    private Ocorrencia oc;
    private OcorrenciaDao ocDao;

    private SortOrder OcorrenciaSortOrder=SortOrder.ascending;

    @ManagedProperty(value = "#{language}")
    private LanguageBean languageBean;

    private int scrollerPage;

    public Ocorrencia getOcorrencia() {
        return oc;
    }

    public void setOcorrencia(Ocorrencia Ocorrencia) {
        this.oc = Ocorrencia;
    }

    public LanguageBean getLanguageBean() {
        return languageBean;
    }

    public void setLanguageBean(LanguageBean languageBean) {
        this.languageBean = languageBean;
    }

//    public List<Ocorrencia> getSpecialties(){
//        return OcorrenciaDao.getAll();
//    }

    public String getNewOcorrenciaForm(){
        oc = new Ocorrencia();
        return "addOcorrencia.jsf";
    }

    public String saveNewOcorrencia(){
        ocDao.addNew(oc);
        return "specialties.jsf";
    }

//    public String getEditForm(long id){
//        this.Ocorrencia = OcorrenciaDao.findById(id);
//        return "editOcorrencia.jsf";
//    }
//
//    public String saveEditedOcorrencia(){
//        OcorrenciaDao.update(this.Ocorrencia);
//        return "specialties.jsf";
//    }

//    public String delete(long id){
//        try {
//            OcorrenciaDao.delete(id);
//        } catch (EJBException e) {
//            FacesContext ctx = FacesContext.getCurrentInstance();
//            ctx.addMessage(null, new FacesMessage(languageBean.getMsgCantDeleteOcorrencia()));
//        }
//        return "specialties.jsf";
//    }

    public SortOrder getOcorrenciaSortOrder() {
        return OcorrenciaSortOrder;
    }

    public void setOcorrenciaSortOrder(SortOrder OcorrenciaSortOrder) {
        this.OcorrenciaSortOrder = OcorrenciaSortOrder;
    }

    public void switchSortOrder(){
        if(OcorrenciaSortOrder==SortOrder.ascending){
            OcorrenciaSortOrder=SortOrder.descending;
        } else {
            OcorrenciaSortOrder=SortOrder.ascending;
        }
    }

    public void setScrollerPage(int scrollerPage) {
        this.scrollerPage = scrollerPage;
    }

    public int getScrollerPage() {
        return scrollerPage;
    }    
}

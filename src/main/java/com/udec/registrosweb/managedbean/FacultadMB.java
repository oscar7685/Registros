/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.registrosweb.managedbean;

import com.udec.registrosweb.modelo.Facultad;
import com.udec.registrosweb.services.FacultadService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@ManagedBean
@Component
public class FacultadMB {

    /**
     * Creates a new instance of FacultadMB
     */
    @ManagedProperty(value = "#{facultadService}")
    @Autowired
    FacultadService facultadService;
    private List<Facultad> facultades;

    public FacultadMB() {
        facultades  = new ArrayList<Facultad>();
    }

    public List<Facultad> getFacultades() {
        facultades=facultadService.findAll();
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }
    
    
    
    public void onEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Facultad Editada", ((Facultad) event.getObject()).getNombre());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Facultad Cancelada", ((Facultad) event.getObject()).getNombre());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.registrosweb.managedbean;

import com.udec.registrosweb.modelo.Programa;
import com.udec.registrosweb.services.ProgramaService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ususario
 */
@ManagedBean
@Component
public class ProgramaMB {

    /**
     * Creates a new instance of ProgramaMB
     */
     public ProgramaMB() {
    }
    @ManagedProperty(value = "#{programaService}")
    @Autowired
    ProgramaService programaService;

    
    public List<Programa> listPrograma(){
    return programaService.findAll();
    }
    
}

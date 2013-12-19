/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.registrosweb.repository;

import com.udec.registrosweb.modelo.Programa;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Diana
 */
public interface ProgramaRepository  extends JpaRepository<Programa, Integer>{
    
}

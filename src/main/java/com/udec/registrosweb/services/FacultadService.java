package com.udec.registrosweb.services;

import com.udec.registrosweb.modelo.Facultad;
import java.util.List;


/**
 *
 * @author Ususario
 */
public interface FacultadService {

    /**
     * funcion que retorna una lista con todos las facultades
     * @return List<Facultad>
     */
    public List<Facultad> findAll();

}

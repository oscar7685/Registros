package com.udec.registrosweb.services;

import com.udec.registrosweb.modelo.Facultad;
import com.udec.registrosweb.repository.FacultadRepository;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Ususario
 */
@Service
public class FacultadServiceImpl implements FacultadService {
    @Resource
    FacultadRepository facultadRepository;
    
    
    @Override
    @Transactional
    /**
     *@inheritDoc
     */
    public List<Facultad> findAll() {
       return facultadRepository.findAll();
	
    }

   

   
   
   
}

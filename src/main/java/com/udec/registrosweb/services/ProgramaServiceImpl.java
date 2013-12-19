package com.udec.registrosweb.services;

import com.udec.registrosweb.modelo.Programa;
import com.udec.registrosweb.repository.ProgramaRepository;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Ususario
 */
@Service
public class ProgramaServiceImpl implements ProgramaService {
    @Resource
    ProgramaRepository programaRepository;
    
    @Override
    @Transactional
    public List<Programa> findAll() {
       return programaRepository.findAll();
	
    }

   

   
   
   
}

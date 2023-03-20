package com.generation.friendlysolutions.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.ReciclajeUsuario;
import com.generation.friendlysolutions.repository.ReciclajeUsuarioRepository;

@Service
@Transactional 
public class ReciclajeUsuarioService {
    
    private ReciclajeUsuarioRepository reciclajeUsuarioRepository;

    public ReciclajeUsuarioService(ReciclajeUsuarioRepository reciclajeUsuarioRepository){
        this.reciclajeUsuarioRepository = reciclajeUsuarioRepository;
    }

    public void saveReciclajeUsuario(ReciclajeUsuario reciclajeUsuario){
        this.reciclajeUsuarioRepository.save(reciclajeUsuario);
    }

    public void updateReciclajeUsuario(ReciclajeUsuario reciclajeUsuario){
        this.reciclajeUsuarioRepository.save(reciclajeUsuario);
    }

    public void deleteReciclajeUsuario(Integer id){
        reciclajeUsuarioRepository.deleteById(id);
    }

    public List<ReciclajeUsuario> findAll(){
        return reciclajeUsuarioRepository.findAll();
    }

}

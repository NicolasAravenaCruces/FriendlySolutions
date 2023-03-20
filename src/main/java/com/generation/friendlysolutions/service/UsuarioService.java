package com.generation.friendlysolutions.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.Usuario;
import com.generation.friendlysolutions.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void saveUsuario(Usuario usuario){
        this.usuarioRepository.save(usuario);
    }

    public void updateUsuario(Usuario usuario){
        this.usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Integer id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }





    
}

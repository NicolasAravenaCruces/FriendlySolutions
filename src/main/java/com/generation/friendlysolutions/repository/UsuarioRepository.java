package com.generation.friendlysolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.friendlysolutions.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
}

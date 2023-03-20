package com.generation.friendlysolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.friendlysolutions.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer> {
    
}

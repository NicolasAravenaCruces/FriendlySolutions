package com.generation.friendlysolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.friendlysolutions.model.Premio;

public interface PremioRepository extends JpaRepository <Premio,Integer> {
    
}

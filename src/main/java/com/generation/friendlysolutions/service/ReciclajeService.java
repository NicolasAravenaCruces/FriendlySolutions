package com.generation.friendlysolutions.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.Reciclaje;
import com.generation.friendlysolutions.repository.ReciclajeRepository;



@Service
@Transactional
public class ReciclajeService {
    private ReciclajeRepository reciclajeRepository;

    public ReciclajeService(ReciclajeRepository reciclajeRepository){
        this.reciclajeRepository = reciclajeRepository;
    }

    public void savereciclaje(Reciclaje reciclaje){
        this.reciclajeRepository.save(reciclaje);
    }

    public void updatereciclaje(Reciclaje reciclaje){
        this.reciclajeRepository.save(reciclaje);
    }

    public void deletereciclaje(Integer id){
        reciclajeRepository.deleteById(id);
    }

    public List<Reciclaje> findAll(){
        return reciclajeRepository.findAll();
    }
    
}

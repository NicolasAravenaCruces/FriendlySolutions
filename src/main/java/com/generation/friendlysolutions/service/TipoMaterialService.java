package com.generation.friendlysolutions.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.TipoMaterial;
import com.generation.friendlysolutions.repository.TipoMaterialRepository;

@Service
@Transactional
public class TipoMaterialService {

    private TipoMaterialRepository tipoMaterialRepository;

    public TipoMaterialService(TipoMaterialRepository tipoMaterialRepository){
        this.tipoMaterialRepository = tipoMaterialRepository;
    }

    public void saveTipoMaterial(TipoMaterial TipoMaterial){
        this.tipoMaterialRepository.save(TipoMaterial);
    }

    public void updateTipoMaterial(TipoMaterial TipoMaterial){
        this.tipoMaterialRepository.save(TipoMaterial);
    }

    public void deleteTipoMaterial(Integer id){
        tipoMaterialRepository.deleteById(id);
    }

    public List<TipoMaterial> findAll(){
        return tipoMaterialRepository.findAll();
    }
    
}

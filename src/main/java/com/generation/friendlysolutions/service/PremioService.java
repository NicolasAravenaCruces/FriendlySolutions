package com.generation.friendlysolutions.service;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.Premio;
import com.generation.friendlysolutions.repository.PremioRepository;

@Service
@Transactional
public class PremioService {

    private PremioRepository premioRepository;

    public PremioService(PremioRepository premioRepository){
        this.premioRepository = premioRepository;
    }

    public void savePremio(Premio premio){
        this.premioRepository.save(premio);
    }

    public void updatePremio(Premio premio){
        this.premioRepository.save(premio);
    }

    public void deletePremmio(Integer id){
    premioRepository.deleteById(id);
    }

    public List<Premio> findAll(){
        return premioRepository.findAll();
    }
    
}

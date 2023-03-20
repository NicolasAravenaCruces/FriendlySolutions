package com.generation.friendlysolutions.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.friendlysolutions.model.Empresa;
import com.generation.friendlysolutions.repository.EmpresaRepository;

@Service
@Transactional
public class EmpresaService {

    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public void saveEmpresa(Empresa empresa){
        this.empresaRepository.save(empresa);
    }

    public void updateEmpresa(Empresa empresa){
        this.empresaRepository.save(empresa);
    }

    public void deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }








    
}

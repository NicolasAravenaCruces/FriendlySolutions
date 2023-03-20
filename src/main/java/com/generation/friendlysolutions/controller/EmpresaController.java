package com.generation.friendlysolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.friendlysolutions.model.Empresa;
import com.generation.friendlysolutions.service.EmpresaService;

@Controller
@CrossOrigin("*")
@RestController
public class EmpresaController {

    private EmpresaService empresaService;

    public EmpresaController(@Autowired EmpresaService empresaService){
        this.empresaService=empresaService;
    }

    //post o ingresar datos

    @PostMapping("/empresa/Save")
    public void guardarEmpresa(@RequestBody Empresa empresa){
        empresaService.saveEmpresa(empresa);
    }
    //put o editar datos
    @PutMapping("/empresa/Update")
    public void editarEmpresa(@RequestBody Empresa empresa){
        empresaService.updateEmpresa(empresa);
    }

    // delete o eliminar 

    @DeleteMapping("/empresa/Delete/{id}")
    public void eliminarEmpresa(@PathVariable Integer id){
        empresaService.deleteEmpresa(id);
    }

    //get o obtener datos

    @GetMapping("/empresa/findAll")
    public List<Empresa> obtenerEmpresa(){
        return empresaService.findAll();
    }
 
}

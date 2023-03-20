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

import com.generation.friendlysolutions.model.Premio;
import com.generation.friendlysolutions.service.PremioService;

@Controller
@CrossOrigin("*")
@RestController
public class PremioController {
    
    private PremioService premioService;
    public PremioController(@Autowired PremioService premioService){
        this.premioService=premioService;
    }

    
    //post o ingresar datos
    @PostMapping("/premio/Save")
    public void guardarPremio(@RequestBody Premio premio){
        premioService.savePremio(premio);
    }

    //put o editar datos
    @PutMapping("/premio/Update")
    public void editarPremio(@RequestBody Premio premio){
        premioService.updatePremio(premio);
    }

    // delete o eliminar 
    @DeleteMapping("/premio/Delete/{id}")
    public void eliminarPremio(@PathVariable Integer id){
        premioService.deletePremmio(id);
    }

    //get o obtener datos

    @GetMapping("/premio/findAll")
    public List<Premio> obtenerPremio(){
     return premioService.findAll();
    }

}

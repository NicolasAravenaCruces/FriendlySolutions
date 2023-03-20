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

import com.generation.friendlysolutions.service.ReciclajeUsuarioService;
import com.generation.friendlysolutions.model.ReciclajeUsuario;

@Controller
@CrossOrigin("*")
@RestController
public class ReciclajeUsuarioController {
    private ReciclajeUsuarioService reciclajeUsuarioService;

    public ReciclajeUsuarioController(@Autowired ReciclajeUsuarioService reciclajeUsuarioService){
        this.reciclajeUsuarioService=reciclajeUsuarioService;
    }

     //post o ingresar datos

     @PostMapping("/reciclajeUsuario/Save")
     public void guardarEmpresa(@RequestBody ReciclajeUsuario reciclajeUsuario){
         reciclajeUsuarioService.saveReciclajeUsuario(reciclajeUsuario);
     }
     //put o editar datos
     @PutMapping("/reciclajeUsuario/Update")
     public void editarReciclajeUsuario(@RequestBody ReciclajeUsuario reciclajeUsuario){
         reciclajeUsuarioService.updateReciclajeUsuario(reciclajeUsuario);
     }
 
     // delete o eliminar 
 
     @DeleteMapping("/reciclajeUsuario/Delete/{id}")
     public void eliminarReciclajeUsuario(@PathVariable Integer id){
         reciclajeUsuarioService.deleteReciclajeUsuario(id);
     }
 
     //get o obtener datos
 
     @GetMapping("/reciclajeUsuario/findAll")
     public List<ReciclajeUsuario> obtenerReciclajeUsario(){
         return reciclajeUsuarioService.findAll();
     }
  
    
}

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

import com.generation.friendlysolutions.model.Reciclaje;
import com.generation.friendlysolutions.service.ReciclajeService;

@Controller
@CrossOrigin("*") //pq toma todos los datos de la tabla
@RestController

public class ReciclajeController {

    private ReciclajeService reciclajeService;

    public ReciclajeController(@Autowired ReciclajeService reciclajeService){
        this.reciclajeService=reciclajeService;
    }

    //post o ingresar datos

    @PostMapping("/reciclaje/Save")
    public void guardarreciclaje(@RequestBody Reciclaje reciclaje){
        reciclajeService.savereciclaje(reciclaje);
    }
    //put o editar datos
    @PutMapping("/reciclaje/Update")
    public void editarreciclaje(@RequestBody Reciclaje reciclaje){
        reciclajeService.updatereciclaje(reciclaje);
    }

    // delete o eliminar 

    @DeleteMapping("/reciclaje/Delete/{id}")
    public void eliminarreciclaje(@PathVariable Integer id){
        reciclajeService.deletereciclaje(id);
    }

    //get o obtener datos

    @GetMapping("/reciclaje/findAll")
    public List<Reciclaje> obtenerreciclaje(){
        return reciclajeService.findAll();
    }

    
}

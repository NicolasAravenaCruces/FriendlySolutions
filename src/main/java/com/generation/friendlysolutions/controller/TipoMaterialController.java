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

import com.generation.friendlysolutions.model.TipoMaterial;
import com.generation.friendlysolutions.service.TipoMaterialService;

@Controller
@CrossOrigin("*")
@RestController
public class TipoMaterialController {
    private TipoMaterialService tipoMaterialService;

    public TipoMaterialController(@Autowired TipoMaterialService tipoMaterialService){
        this.tipoMaterialService=tipoMaterialService;
    }

    //post o ingresar datos

    @PostMapping("/tipomaterial/Save")
    public void guardarTipoMaterial(@RequestBody TipoMaterial tipoMaterial){
        tipoMaterialService.saveTipoMaterial(tipoMaterial);
    }
    //put o editar datos
    @PutMapping("/tipomaterial/Update")
    public void editarTipoMaterial(@RequestBody TipoMaterial tipoMaterial){
        tipoMaterialService.updateTipoMaterial(tipoMaterial);
    }

    // delete o eliminar 

    @DeleteMapping("/tipomaterial/Delete/{id}")
    public void eliminarTipoMaterial(@PathVariable Integer id){
        tipoMaterialService.deleteTipoMaterial(id);
    }

    //get o obtener datos

    @GetMapping("/tipomaterial/findAll")
    public List<TipoMaterial> obtenerTipoMaterial(){
        return tipoMaterialService.findAll();
    }
}

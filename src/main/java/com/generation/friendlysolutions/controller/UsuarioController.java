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

import com.generation.friendlysolutions.model.Usuario;
import com.generation.friendlysolutions.service.UsuarioService;

@Controller
@CrossOrigin("*")
@RestController
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(@Autowired UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

    //post o ingresar datos

    @PostMapping("/usuario/Save")
    public void guardarUsuario(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
    }
    
    //put o editar datos
    @PutMapping("/usuario/Update")
    public void editarUsuario(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
    }

    //delete o eliminar datos

    @DeleteMapping("usuario/Delete/{id}")
    public void eliminarUsuario(@PathVariable Integer id){
        usuarioService.deleteUsuario(id);
    }

    //get o obtener datos

    @GetMapping("/usuario/findAll")
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.findAll();
    }
    
}

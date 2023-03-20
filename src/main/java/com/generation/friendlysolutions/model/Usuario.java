package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer usuario_id;
    private String nombre;
    private String apellido;
    private String correo;
    private String pass;
    private char genero;
    private String area;
    private String medalla;
    private Integer empresa_id;
    private Integer premio_id;

    public Usuario() {
    }

    public Usuario(Integer usuario_id, String nombre, String apellido, String correo, String pass, char genero,
            String area, String medalla, Integer empresa_id, Integer premio_id) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pass = pass;
        this.genero = genero;
        this.area = area;
        this.medalla = medalla;
        this.empresa_id = empresa_id;
        this.premio_id = premio_id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Integer getPremio_id() {
        return premio_id;
    }

    public void setPremio_id(Integer premio_id) {
        this.premio_id = premio_id;
    }

    

    

    



    







    
}

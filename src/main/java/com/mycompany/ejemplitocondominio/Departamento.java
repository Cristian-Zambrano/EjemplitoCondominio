/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplitocondominio;

/**
 *
 * @author usuario
 */
public class Departamento extends InmueblePrivado{
    private ParqueaderoPrivado parqueaderoPrivado;
    private double metrosCuadrados;
    //private Perfil propietario;

    public Departamento(double metrosCuadrados/*, Perfil propietario*/) {
        this.parqueaderoPrivado = new ParquederoPrivado();
        this.metrosCuadrados = metrosCuadrados;
        //this.propietario = propietario;
    }
    
    
    
}

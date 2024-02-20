package com.mycompany.ejemplitocondominio;

import java.util.ArrayList;

public class Condominio {
    
    private ArrayList<InmueblePrivado> propiedadesPrivadas;
    private ArrayList<InmuebleComun> propiedadesComunales;

    public Condominio() {
        this.propiedadesPrivadas = new ArrayList<InmueblePrivado>();
        this.propiedadesComunales = new ArrayList<InmuebleComun>();
    }
    
    public void agregarPropiedadPrivada(InmueblePrivado propiedadPrivada){
        propiedadesPrivadas.add(propiedadPrivada);
    }
    
    public void agregarPropiedadPublica(InmuebleComun propiedadComun){
        propiedadesComunales.add(propiedadComun);
    }
    
}

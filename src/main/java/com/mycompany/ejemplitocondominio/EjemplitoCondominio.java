/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplitocondominio;

/**
 *
 * @author usuario
 */
public class EjemplitoCondominio {

    public static void main(String[] args) {
        
        Perfil perfilAdminPrueba = new Perfil("Cristian Sangucho");
        ParqueaderoPrivado parqueaderoPrivado = new ParqueaderoPrivado(5);
        Departamento departamentoPrueba = new Departamento(parqueaderoPrivado, 43.2);
        perfilAdminPrueba.agregarResidente(new Residente("Jean Cotera", departamentoPrueba));
        
    }
}

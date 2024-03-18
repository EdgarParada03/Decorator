/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;

/**
 *
 * @author edgar
 */
public class Main {

    public static void main(String[] args) {
        Texto miTexto = new TextoPlano("Hola, Mundo!");
        miTexto = new Negrita(miTexto);
        miTexto = new Cursiva(miTexto);
        miTexto = new Subrayado(miTexto);

        System.out.println(miTexto.obtenerContenido());
    }
}

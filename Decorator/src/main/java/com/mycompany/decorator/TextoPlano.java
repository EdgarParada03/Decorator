/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author edgar
 */
public class TextoPlano implements Texto {
    private String contenido;

    public TextoPlano(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }
}

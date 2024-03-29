/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author edgar
 */
public class Negrita extends DecoradorDeTexto {
    public Negrita(Texto textoInterno) {
        super(textoInterno);
    }

    @Override
    public String obtenerContenido() {
        return "<b>" + textoInterno.obtenerContenido() + "</b>";
    }
}

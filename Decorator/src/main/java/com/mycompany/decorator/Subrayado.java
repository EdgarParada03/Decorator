/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author edgar
 */
public class Subrayado extends DecoradorDeTexto {
    public Subrayado(Texto textoInterno) {
        super(textoInterno);
    }

    @Override
    public String obtenerContenido() {
        return "<u>" + textoInterno.obtenerContenido() + "</u>";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {
    private double numLitrosMax;
    private double costoLitro;
    private double descuentoLitros;
    private double valorCancelar;
    
    public AutomovilDiesel(String p, String pl, double nlm, double cl){
        super(p, pl);
        numLitrosMax = nlm;
        costoLitro = cl;
    }

    public void establecerNumLitrosMax(double nlm) {
        numLitrosMax = nlm;
    }

    public void establecerCostoLitro(double cl) {
        costoLitro = cl;
    }

    public void establecerDescuentoLitros(double dl) {
        descuentoLitros = dl;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = (costoLitro * numLitrosMax) - (costoLitro * numLitrosMax * descuentoLitros);
    }

    public double obtenerNumLitrosMax() {
        return numLitrosMax;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public double obtenerDescuentoLitros() {
        return descuentoLitros;
    }

    @Override
    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = super.toString() + "\n" +
                        "Numero de litros maximos: " + numLitrosMax + "\n" +
                        "Costo por litro: " + costoLitro + "\n" +
                        "Descuento por litros: " + descuentoLitros + "\n" +
                        "Valor a cancelar: " + valorCancelar;
        return cadena;
    }
}

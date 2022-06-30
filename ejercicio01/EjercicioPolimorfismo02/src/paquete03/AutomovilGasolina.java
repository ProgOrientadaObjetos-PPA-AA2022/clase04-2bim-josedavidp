/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    private double numeroGalones;
    private double costoGalon;
    private double iva = 0.10;
    private double valorCancelar;

    public AutomovilGasolina(String p, String pl, double ng, double cg) {
        super(p, pl);
        numeroGalones = ng;
        costoGalon = cg;
    }

    public void establecerNumeroGalones(double ng) {
        numeroGalones = ng;
    }

    public void establecerCostoGalon(double cg) {
        costoGalon = cg;
    }

    @Override
    public void establecerValorCancelar(){
        valorCancelar = (costoGalon * numeroGalones) + (costoGalon * numeroGalones * iva);
    }

    public double obtenerNumeroGalones() {
        return numeroGalones;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public double obtenerValorCancelar(){
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = super.toString() + "\n" +
                        "Numero de galones: " + numeroGalones + "\n" +
                        "Costo por galon: " + costoGalon + "\n" +
                        "Iva aplicado: " + iva + "\n" +
                        "Valor total: " + valorCancelar;
        return cadena;
    }
}

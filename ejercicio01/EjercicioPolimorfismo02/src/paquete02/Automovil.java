/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Automovil {
    protected String propietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String p, String pl){
        propietario = p;
        placa = pl;
    }
    
    public void establecerPropietario(String p){
        propietario = p;
    }

    public void establecerPlaca(String pl){
        placa = pl;
    }

    public void establecerValorCancelar(){
    }

    public String obtenerPropietario(){
        return propietario;
    }

    public String obtenerPlaca(){
        return placa;
    }

    public double obtenerValorCancelar(){
        return valorCancelar;
    }

    @Override
    public String toString(){
        String cadena = "Propietario: " + propietario + "\n" +
                        "Placa: " + placa + "\n";
        return cadena;
    }
}

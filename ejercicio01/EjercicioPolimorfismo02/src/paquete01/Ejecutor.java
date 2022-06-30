/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        AutomovilDiesel auto = new AutomovilDiesel("Felipe", "P403-L", 20, 2);
        
        auto.establecerNumLitrosMax(20);
        auto.establecerCostoLitro(2);
        auto.establecerDescuentoLitros(0.1);
        auto.establecerValorCancelar();
        System.out.println(auto);
        System.out.println("\n");
        System.out.println("--------------------------------");

        AutomovilGasolina auto2 = new AutomovilGasolina("José", "LBA-321", 20, 3);
        
        auto2.obtenerIva();
        auto2.establecerValorCancelar();
        System.out.println(auto2);
    }
}

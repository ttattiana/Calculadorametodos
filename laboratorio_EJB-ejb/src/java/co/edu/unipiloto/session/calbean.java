/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class calbean implements calbeanLocal {

    @Override
    public Integer sum(int valor1, int valor2) {
        return valor1 + valor2;
    }
    public Integer restar(int valor1, int valor2) {
        return valor1 - valor2;
    }
    public Integer dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }
    public Integer multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
    public Integer modulo(int valor1, int valor2) {
        return valor1 % valor2;
    }
    public Integer elevar(int valor1, int valor2) {
        valor1 = (int) Math.pow(valor1, valor2);
        return valor1;
    }
   
}

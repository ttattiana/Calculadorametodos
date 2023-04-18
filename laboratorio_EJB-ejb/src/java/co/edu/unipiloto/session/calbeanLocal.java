/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface calbeanLocal {

    Integer sum(int valor1, int valor2);
    Integer restar(int valor1, int valor2);
    Integer dividir(int valor1, int valor2);
    Integer multiplicar(int valor1, int valor2);
    Integer modulo(int valor1, int valor2);
    Integer elevar(int valor1, int valor2);
    
}

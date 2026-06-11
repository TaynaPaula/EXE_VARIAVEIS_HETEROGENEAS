/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author Tayna
 */
public class Veiculos {
    int chassi;
    String modelo;
    String cor;
    int ano_fab;
    int kmpcorrida;
    double valor;
    public Veiculos(){
     this (0, "","",0,0,0.0);
    }
    Veiculos(int chassiv, String modelov, String corv, int ano_fabv, int kmpcorridav, double valorv){
    chassi= chassiv;
    modelo = modelov;
    cor = corv;
    ano_fab= ano_fabv;
    kmpcorrida = kmpcorridav;
    valor = valorv;
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitoestatistica;

/**
 *
 * @author Tayna
 */
abstract class  Estatistica {
    int codigoCidade;
    String nomeCidade;
    int qtdAcidentes;

    Estatistica() {
        this(0, "", 0);
    }
    Estatistica(int codigoCidadeestatistica,
    String nomeCidadeestatistica,
    int qtdAcidentesestatistica){
       codigoCidade = codigoCidadeestatistica;
       nomeCidade = nomeCidadeestatistica;
       qtdAcidentes = qtdAcidentesestatistica;
    }
}

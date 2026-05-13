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
    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    Estatistica() {
        this(0, "", 0);
    }
    Estatistica(int CodigoCidadeestatistica,
    String NomeCidadeestatistica,
    int QtdAcidentesestatistica){
       CodigoCidade = CodigoCidadeestatistica;
       NomeCidade = NomeCidadeestatistica;
       QtdAcidentes = QtdAcidentesestatistica;
    }
}

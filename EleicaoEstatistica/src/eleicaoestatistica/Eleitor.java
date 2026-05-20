/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicaoestatistica;

/**
 *
 * @author Tayna
 */
abstract class Eleitor {
    int neleitor;
    String nomeEleitor;
    int secao;
    
    Eleitor(){
      this(0, "", 0);
    }
    
 
    Eleitor (int neleitorE, String nomeEleitorE, int secaoE) {
        neleitor = neleitorE;
        nomeEleitor = nomeEleitorE;
        secao = secaoE;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicaoestatistica;

/**
 *
 * @author Tayna
 */
  abstract class Votacao {
        int secao;
        int codCandidato;
        int numEleitor;
     
     Votacao(){
        this(0,0,0); 
     }
     Votacao(int vSecao, int vCodCandidato, int vNumEleitor){
        secao = vSecao;
        codCandidato= vCodCandidato;
        numEleitor = vNumEleitor;
     
    }
  }
      
    


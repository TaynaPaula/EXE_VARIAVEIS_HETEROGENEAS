/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package votacaoestatistica;

/**
 *
 * @author Tayna
 */
 abstract class Votacao2021 {
  int numeroSecao;  
  int numeroCandidato;
  Votacao2021(){
      this(0,0);
  }
  Votacao2021(int vsecao,  
    int vcandidato){
    numeroSecao = vsecao;
    numeroCandidato = vcandidato;
  }
      
}

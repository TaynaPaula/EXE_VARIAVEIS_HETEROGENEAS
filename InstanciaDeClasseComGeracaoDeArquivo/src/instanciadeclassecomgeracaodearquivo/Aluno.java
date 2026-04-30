/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciadeclassecomgeracaodearquivo;

/**
 *
 * @author dti
 */
public class Aluno {
    	
  String pnome;	
  String unome;	
  int pontos;	
	
  // Método Construtor	
  Aluno()
   {	
     this("" ,"" , 0);	
   }	

  // Método Procedimento
  Aluno ( String pnomealuno,	
          String unomealuno,	
          int pontosaluno )	
   {	
     pnome   = pnomealuno;	
     unome  = unomealuno;	
     pontos  = pontosaluno;	
   }	
}

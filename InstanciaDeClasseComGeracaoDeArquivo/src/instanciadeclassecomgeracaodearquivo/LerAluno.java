/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciadeclassecomgeracaodearquivo;

import instanciadeclassecomgeracaodearquivo.Aluno;
import java.io.*;

/**
 *
 * @author dti
 */
public void LerAluno( Aluno[ ] aluno ) throws IOException  {
    int i;
    String fileName = "ArquivoAluno.txt";
    BufferedReader ler = new BufferedReader(new FileReader( fileName ));
    for (i = 0 ; i < 3 ; i++)   {
        aluno[i] = new Aluno(); 
     }
    for (i = 0 ; i < 3 ; i++)   {
        aluno[i].pnome = ler.readLine();  
        aluno[i].unome = ler.readLine();
        aluno[i].pontos = Integer.parseInt(ler.readLine());   
    }
    for (i = 0 ; i < 3; i++) {
        System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + 
        aluno[i].pontos);  
    }
    ler.close();
    
    
}

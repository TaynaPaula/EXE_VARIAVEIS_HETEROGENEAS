/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciadeclassecomgeracaodearquivo;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class ClasseMetodos {
       public Aluno[ ] GravaAluno (Aluno[ ] aluno  ) throws IOException {
         int i;  String fileName = "ArquivoAluno.txt";
         BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));
         for (i = 0 ; i < 3 ; i++) { aluno[i] = new Aluno();  }
         for (i = 0 ; i < 3 ; i++)  {
                aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
                gravar.write( aluno[i].pnome ); gravar.newLine();
                aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
                gravar.write( aluno[i].unome );   gravar.newLine();
                aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos: "));
                gravar.write(Integer.toString(aluno[i].pontos));   gravar.newLine(); 
        } 
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
        gravar.close();
        return aluno;
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciadeclassecomgeracaodearquivo;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class ClassePrincipal {
     public static void main (String arg [ ]) throws IOException {
            Aluno[ ] aluno = new Aluno[3];
            ClasseMetodos m = new ClasseMetodos(); 
            int opc=0      ;
            while (opc!=9){
                opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Gravar Aluno \n 2 - Ler Aluno  \n 9 - Finaliza"));
                switch (opc)     {
                    case 1 : aluno = m.GravaAluno(aluno);
                        break;
                    case 2 : m.LerAluno (aluno);
                        break;
                    case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO ");
                       break;
                    default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                }   
            }  
    }   

}

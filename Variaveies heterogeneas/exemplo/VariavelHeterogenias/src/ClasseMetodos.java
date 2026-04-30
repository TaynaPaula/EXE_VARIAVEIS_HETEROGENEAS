// CLASSE DE METODOS
import javax.swing.JOptionPane;
public class ClasseMetodos {
   // FUNÇÃO RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]    
  public Aluno[] FCadastra(Aluno[] aluno){
  int i;

  for (i = 0 ; i < 3 ; i++)
   {
    aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
    aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
    aluno[i].pontos =Integer.parseInt(JOptionPane.showInputDialog("Pontos do aluno:"));
   }
   
  return aluno; } 
   
// PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
  public void FConsulta(Aluno[] aluno){
     int i;

    for (i = 0 ; i < 3; i++) 
       {
         System.out.println(aluno[i].pnome + " " + aluno[i].unome 
                            + " pontos: " + aluno[i].pontos);
       }
   }             

 } 
    

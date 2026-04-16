// CLASSE PRINCIPAL COM INSTÂNCIA DA CLASSE METODOS
import javax.swing.*;
class ClasseMenu {   //  CLASSE PRINCIPAL
 public static void main ( String[] args )
 {
   // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
   Aluno[ ] aluno = new Aluno[3]; 
   
   // INSTÂNCIA DA CLASSE MÉTODOS
   ClasseMetodos m = new ClasseMetodos();
   
    int i;

  // EXECUÇÃO DO MÉTODO CONSTRUTOR
  for (i = 0 ; i < 3 ; i++){
       aluno[i] = new Aluno(); }
 
  int opc = 0 ;
  while (opc!=9){
     opc = Integer.parseInt(JOptionPane.showInputDialog
              ("1 -  Cadastra Alunos \n 2 - Consulta Registros \n 9 - Finaliza"));
     switch (opc) {
            case 1:  aluno = m.FCadastra(aluno); // CHAMADA FUNÇÃO
                     break;
            case 2: m.FConsulta(aluno); // CHAMADA PROCEDIMENTO
                    break;
            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
                     break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
         } // FECHA SWITCH
  }  // FECHA WHILE
 }   // FECHA METODO PRINCIPAL
}   // FECHA CLASSE PRINCIPAL


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transitoestatistica;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Tayna
 */
public class ClassePrincipal {

  
    public static void main (String[] args) throws IOException {
        Estatistica[] estatistica = new Estatistica[3];
        ClasseMetodos m = new ClasseMetodos();
        int i;
        for(i = 0; i<3; i++){
            estatistica[i] = new Estatistica() {};
        }
        int opc = 0;
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog
                ("1 -  Cadastra Estatisticas \n 2 - Consulta por quantidade de acidentes \n 3- Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidade \n 9 - Finaliza")
            );
            switch (opc) {
                case 1:
                    estatistica = m.FCADRASTRAESTATISTICA(estatistica);
                    break;
                case 2:
                    m.PQTDACIDENTES(estatistica);
                    break;
                case 3:
                    m.PMAIORMENOR(estatistica);
                    break;
                case 4: m.PACIMA(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;   
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Inválida"); 
            }
        }
    
    }
}

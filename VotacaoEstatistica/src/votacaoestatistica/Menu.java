/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacaoestatistica;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tayna
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Votacao2021[] votacao = new Votacao2021[2];
        ClasseMetodos m = new ClasseMetodos();
        int Opc = 0;
        for(int i = 0; i<2; i++){
            votacao[i] = new Votacao2021() {};
        }
        while (Opc!=9)
        {
            Opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar Seção/Número Eleitor  \n 2 - Classificar por secao \n 3- gravar Registros \\n 4 - Mostrar Indicadores \\n 9 - Finaliza "));
            switch(Opc){
                case 1:
                    votacao = m.FCADRASTRAVOTAÇÃO(votacao);
                    break; 
                case 2: 
                    votacao = m.FCLASSIFICASEÇÃO(votacao);
                    break;
                case 3: 
                    votacao = m.FGRAVAVOTAÇÃO(votacao);
                    break;
                case 4:
                    MenuIndicadores(votacao);
                     break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Finalizado");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Inválida"); 
            }
        }
        
    }
    
    public static void MenuIndicadores(Votacao2021[] votacao) {
        int Opc=0;
        while (Opc!=9)
        {
            Opc= Integer.parseInt(JOptionPane.showInputDialog("\nEstatísticas de Votação em 2021 \n 1 – Quantidade Eleitores por Seção \n 2 – Seção com Maior e Menor número de Eleitores \n 3 – Quantidade de votos por candidato \n 4 – 10 primeiros colocadas (nro cand. e qtd votos) \n9 – Finaliza consulta "));
            switch (Opc){
                case 1:
                    QtEleitoresSecao(votacao);
                    break;
                case 2:
                    SecaoMaiorMenor(votacao);
                    break;
                case 3:
                    QtVotosCandidato(votacao);
                    break;
                case 4:
                    MenuIndicadores(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida"); 
            }
        }
        
    }

    
}

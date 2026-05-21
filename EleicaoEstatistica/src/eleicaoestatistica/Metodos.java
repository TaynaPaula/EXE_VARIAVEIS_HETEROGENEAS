/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicaoestatistica;


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
        Metodos m = new Metodos();
        Eleitor[] eleitor = new Eleitor[10];
        Votacao[] votacao = new Votacao[5];
        Votacao[] apuracao = new Votacao[10];
         for(int i = 0; i<10; i++){
            eleitor[i] = new Eleitor();
        }
        
         for(int i = 0; i<10; i++){
            votacao[i] = new Votacao();
        }
         for (int i = 0; i < 10; i++) {
            apuracao[i] = new Votacao();
        }

         
        int Opc=0;
        while(Opc!=9){
            Opc=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal \n 1 - Cadastra Eleitor \n 1 - Cadastra Eleitor \n3 - Agrupa  Apuração \n 4 - Menu  Estatística \n 9 - Fim "));
            switch(Opc){
                case 1: 
                    eleitor = m.CadEleitor(eleitor);
                    break;
                case 2:
                    CadVotacao12(votacao, eleitor);
                    break;
                case 3:
                    eleitor = m.AgruparEleitor(eleitor);
                    break;
                case 4: menuEstatistica(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null," Finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null," Opcao Invalida");
            }
        }
    }
    
    private static void menuEstatistica(Votacao[] votacao) throws IOException{
        int OPc=0;
        Metodos m = new Metodos();
        while(OPc!=9){
            OPc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATISTICA \n 1 - Vencedor \n2 - Segundo colocado \n3 - Quantidade de votos em branco \n4 - Quantidade de votos nulos \n5 - Mostra eleitores \n6 - Mostra apuração \n9 - FIM "));
            switch(OPc){
                case 1: m.FVencedor(votacao);
                    break;
                case 2:
                    m.SegColocado(votacao);
                    break;
                case 3: m.QtVotosNulos(votacao);
                    break;
                case 4: m.QtVotosBrancos(votacao);
                    break;
                case 5: m.MostraEleitores(votacao);
                    break;
                case 6: m.MostraApuracao(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null," Finalizado");
                    break;
                default: 
                      JOptionPane.showMessageDialog(null," Opcao Invalida");
            }
        }
    }

    private static void CadVotacao12(Votacao[] votacao, Eleitor[] eleitor) throws IOException{
        int Opc=0;
        Metodos m = new Metodos();
        while(Opc !=9){
            Opc=Integer.parseInt(JOptionPane.showInputDialog("Cadastro Votação 1,2 \n 1- Cadastro Votação 1 \n 2 - Cadastro Votação 2\n 9 - FIM")); 
            switch(Opc){
                case 1:
                    votacao = m.FCadVotacao(votacao, eleitor,1);
                    break;
                case 3: 
                    votacao = m.FCadVotacao(votacao, eleitor,2);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null," Finalizado");
                    break;
                default: 
                      JOptionPane.showMessageDialog(null," Opcao Invalida");
            }
        }
    }
    
}

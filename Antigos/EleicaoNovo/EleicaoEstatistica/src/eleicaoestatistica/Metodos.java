/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eleicaoestatistica;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tayna
 */
public class Metodos {
    int[] secoesValidas = {1, 3, 4, 5, 9, 10};
    Eleitor[] eleitor = new Eleitor[10];
    Votacao[] votacao1 = new Votacao[5];
    

    public Eleitor[] CadEleitor(Eleitor[] eleitor) {
       for (int i = 0; i < eleitor.length; i++) {
            eleitor[i].neleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor " + (i + 1) + ":"));
            eleitor[i].nomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor " + (i + 1) + ":");
            int secao;
                while(true){
                    eleitor[i].secao = Integer.parseInt(JOptionPane.showInputDialog("Digite a seção do eleitor " + (i + 1) + ":"));
                    if (secao!=secoesValidas)break;
                    JOptionPane.showMessageDialog(null,"Secao invalida");
            }
        }
        JOptionPane.showMessageDialog(null, "Cadastro de eleitores concluído!");
        return eleitor;
    }

    public Votacao[] FCadVotacao(Votacao[] votacao,Eleitor[] eleitor) {
        for(int i=0; i<votacao.length; i++)
            
    }
    
}

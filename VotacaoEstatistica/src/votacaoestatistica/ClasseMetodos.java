/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package votacaoestatistica;

import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tayna
 */
public class ClasseMetodos {
    public Votacao2021[] FCADRASTRAVOTAÇÃO(Votacao2021[] votacao)throws IOException{
        Random gerador = new Random();
        for(int i = 0; i<6; i++) {
           votacao[i].numeroSecao = gerador.nextInt(11);    
           votacao[i].numeroCandidato = gerador.nextInt(301);
        }
        JOptionPane.showMessageDialog(null, "Dados Carregados!");
        return votacao;
    }
    
    public Votacao2021[] FGRAVAVOTAÇÃO(Votacao2021[] votacao)throws IOException{
        int i; 
        String fileName = "ArquivoVotacao.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter ( fileName ));
        for(i = 0; i<6; i++) {
            gravar.write(Integer.toString(votacao[i].numeroSecao));   gravar.newLine();
            gravar.write(Integer.toString(votacao[i].numeroCandidato));   gravar.newLine();
        }
        gravar.close();
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
        return votacao;
    }
    
    public Votacao2021[] FCLASSIFICASEÇÃO(Votacao2021[] votacao){
        Votacao2021 aux;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 200; j++) {
                if (votacao[i].numeroSecao > votacao[j].numeroSecao) {
                    aux = votacao[i];
                    votacao[i] = votacao[j];
                    votacao[j] = aux;
                }
        }
    }
    JOptionPane.showMessageDialog(null, "Dados Classificados!");
    return votacao;
    }

    void QtEleitoresSecao(Votacao2021[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void SecaoMaiorMenor(Votacao2021[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void QtVotosCandidato(Votacao2021[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

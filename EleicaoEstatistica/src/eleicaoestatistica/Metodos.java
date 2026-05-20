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
public class Metodos {
    String arquivoEleitor = "CadastroEleitor.txt";
    String arquivoVotacao1 = "Votacao1.txt";
    String arquivoVotacao2 = "Votacao2.txt";

    int[] secoesValidas = {1, 3, 4, 5, 9, 10};
    Eleitor[] eleitor = new Eleitor[10];
    Votacao[] votacao = new Votacao[5];
    

    public Eleitor[] CadEleitor(Eleitor[] eleitor) throws IOException {
        String fileName = "CadastroEleitor.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter ( fileName ));
        for (int i = 0; i < eleitor.length; i++) {
            eleitor[i].neleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor " + (i + 1) + ":"));
             gravar.write(Integer.toString(eleitor[i].neleitor));   gravar.newLine();
            eleitor[i].nomeEleitor = JOptionPane.showInputDialog("Digite o nome do eleitor " + (i + 1) + ":");
             gravar.write(eleitor[i].nomeEleitor); gravar.newLine();
            while(true){
                int secaoDigitada = Integer.parseInt(JOptionPane.showInputDialog("Digite a seção do eleitor " + (i + 1) + ":"));
                boolean encontrou = false;
                for(int s: secoesValidas ){
                    if (secaoDigitada == s){
                        encontrou =true;                   
                         break;
                    }     
                } 
                if(encontrou) {
                    eleitor[i].secao = secaoDigitada;
                    gravar.write(Integer.toString(eleitor[i].secao));
                    gravar.newLine();
                    break; 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seção inválida! Colete uma nova seção.");
                }
            }
        }
        gravar.close();
        JOptionPane.showMessageDialog(null, "Cadastro de eleitores concluído!");
        return eleitor;
    }

    public Votacao[] FCadVotacao(Votacao[] votacao,Eleitor[] eleitor) throws IOException{
        String fileName = "Votacao.txt";
        int tipoVotacao;
        
        BufferedWriter gravar = new BufferedWriter(new FileWriter ( fileName ));
        for(int i=0; i<votacao.length; i++){
            votacao[i].codCandidato=Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Candidato "));
            gravar.write(Integer.toString(votacao[i].codCandidato)); gravar.newLine();
            votacao[i].secao= Integer.parseInt(JOptionPane.showInputDialog("Digite o Código de secao"));
            gravar.write(Integer.toString(votacao[i].secao)); gravar.newLine();
            while(true){
               int eleitorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do eleitor : ")); 
               boolean encontrou=false;
               for(Eleitor e: eleitor){
                    if (eleitorDigitado == e.neleitor) {
                        encontrou = true;
                        break;
                    }
               }
                if(encontrou){
                    votacao[i].numEleitor = eleitorDigitado;
                    gravar.write(Integer.toString(votacao[i].numEleitor));
                    gravar.newLine();
                    break;
               }else{
                    JOptionPane.showMessageDialog(null, "Número do Eleitor inválido! Colete um Número do Eleitor "
                            + "..");
                }
            }
        }gravar.close();
        JOptionPane.showMessageDialog(null, "Cadastro de eleitores concluído!");
        return votacao;
    } 
    
}

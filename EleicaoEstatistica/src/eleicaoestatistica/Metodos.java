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

    public Votacao[] FCadVotacao(Votacao[] votacao,Eleitor[] eleitor, int tipo) throws IOException{
        String fileName = (tipo==1)?"Votacao1.txt": "Votacao2.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        
        int[] secoesGrupo = (tipo == 1) ? new int[]{1, 3, 4} : new int[]{5, 9, 10};
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
    
    public Votacao[] ordenarPorCandidato(Votacao[] votacao) {
        Votacao aux;
        for (int i = 0; i < votacao.length - 1; i++) {
            for (int j = i + 1; j < votacao.length; j++) {
                if (votacao[i].codCandidato > votacao[j].codCandidato) {
                    aux = votacao[i];
                    votacao[i] = votacao[j];
                    votacao[j] = aux;
                }
            }
        }
        return votacao;
    }
    
    // Método recursivo para contar votos brancos (Candidato código 3)
    public void QtVotosBrancos(Votacao[] v) {
        // Condição de parada (Caso Base): se chegou ao fim do vetor, para
        int somaBrancos = 0; // Variável simples para acumular o total

        // Varre o buffer de memória comparando o código do candidato
        for (int i = 0; i < votacao.length; i++) {
            if (votacao[i].codCandidato == 3) { // 3 corresponde a Voto em Branco
                somaBrancos++; // Soma +1 ao totalizador
            }
        }// Mostra o resultado final diretamente para o usuário
        JOptionPane.showMessageDialog(null, "Quantidade de votos em branco: " + somaBrancos);
        
    }
    void QtVotosNulos(Votacao[] votacao) {
        int somaNulos=0;
        for(int i=0; i<votacao.length; i++){
            if(votacao[i].codCandidato ==4){
             somaNulos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de votos nulos: " + somaNulos);
    }

    void FVencedor(Votacao[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void SegColocado(Votacao[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    void MostraEleitores(Votacao[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void MostraApuracao(Votacao[] votacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Eleitor[] AgruparEleitor(Eleitor[] eleitor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

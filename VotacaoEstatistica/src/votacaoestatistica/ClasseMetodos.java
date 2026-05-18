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
        for(int i = 0; i<200; i++) {
           votacao[i].numeroSecao = gerador.nextInt(11);    
           votacao[i].numeroCandidato = gerador.nextInt(301);
        }
        JOptionPane.showMessageDialog(null, "Dados Carregados!");
        return votacao;
    }
    
    public Votacao2021[] FCLASSIFICASEÇÃO(Votacao2021[] votacao){
        Votacao2021 aux;
        for (int i = 0; i < 199; i++) {
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
    
    public  Votacao2021[] FGRAVAVOTAÇÃO(Votacao2021[] votacao)throws IOException{
        String fileName = "ArquivoVotacao.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter ( fileName ));
        for(int i = 0; i<200; i++) {
            gravar.write(Integer.toString(votacao[i].numeroSecao));   gravar.newLine();
            gravar.write(Integer.toString(votacao[i].numeroCandidato));   gravar.newLine();
        }
        gravar.close();
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
        return votacao;
    }
    
    
    void QtEleitoresSecao(Votacao2021[] votacao)throws IOException {
        //Quantidade de eleitores por Seção
        int[] eleitoresSecao = new int[11];
        for(int i=0; i<200; i++){
            eleitoresSecao[votacao[i].numeroSecao]++;
        } System.out.println("Qunatidaded de eleitores por secao");
        for(int i=0; i<eleitoresSecao.length; i++){
        System.out.println("Secao" + i + "Quantidade de eleitores por Seção "+ eleitoresSecao[i]);}
      
    }

    void SecaoMaiorMenor(Votacao2021[] votacao)throws IOException {
        //Número da Seção com maior e menor números de eleitores (procedimento);
        int[] eleitoresPorsecao = new int[11];
        for(int i=0; i<votacao.length; i++){
          eleitoresPorsecao[votacao[i].numeroSecao]++;  
        }
        int maior =1; 
        int menor =0;
        for(int i=0;i<eleitoresPorsecao.length; i++){
            if(eleitoresPorsecao[i]>eleitoresPorsecao[maior]) maior=i;
            if(eleitoresPorsecao[i]<eleitoresPorsecao[menor]){
                menor =i;
            }
        }
       JOptionPane.showMessageDialog(null, "Seção com maior número de eleitores: \n Seção "+ maior + " Quantidade de eleitores: "+eleitoresPorsecao[maior] + "\nSeção com menor número de eleitores: \n Seção " + menor+ " Quantidade de eleitores: " + eleitoresPorsecao[menor] );
    }

     void QtVotosCandidato(Votacao2021[] votacao) {
       //Quantidade de votos por candidato (procedimento);
       int[] contagem = new int[301];
       for(int i=0; i<200; i++){
           contagem[votacao[i].numeroCandidato]++;
       }
       for (int i = 0; i <= 300; i++) {
            if (contagem[i] > 0) {
                System.out.println("Candidato " + i + ": " + contagem[i] + " votos.");
            }
       }
    }

    void MaisVotados(Votacao2021[] votacao) {
        //Exibir os 10 candidatos mais votados e suas quantidades
        int[] contagem = new int[301];
        for(int i = 0; i < 200; i++){
         contagem[votacao[i].numeroCandidato]++;
        }

        // 2. Para não perder o número do candidato ao ordenar, 
        // exibimos os 10 maiores valores encontrados manualmente ou via ordenação
        System.out.println("\n--- 10 CANDIDATOS MAIS VOTADOS ---");
        for (int top = 0; top < 10; top++) {
            int maiorVoto = -1;
            int candMaisVotado = -1;

            for (int i = 0; i < contagem.length; i++) {
                if (contagem[i] > maiorVoto) {
                    maiorVoto = contagem[i];
                    candMaisVotado = i;
                }
            }

            if (maiorVoto > 0) {
                System.out.println((top + 1) + "º Lugar: Candidato " + candMaisVotado + " com " + maiorVoto + " votos.");
                contagem[candMaisVotado] = -1; // "Zera" para achar o próximo maior no próximo laço
            }
        }
    }
}

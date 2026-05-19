/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitoestatistica;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tayna
 */
class ClasseMetodos {
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica) throws IOException{
        int i; String fileName = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));
        for(i=0;i<10;i++){
        estatistica[i].codigoCidade=Integer.parseInt(JOptionPane.showInputDialog("Entre o codigo da cidade"));
        gravar.write(Integer.toString(estatistica[i].codigoCidade)); gravar.newLine();
        estatistica[i].nomeCidade=JOptionPane.showInputDialog("Informe o nome da cidade ");
        gravar.write(estatistica[i].nomeCidade); gravar.newLine();
        estatistica[i].qtdAcidentes=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes "));
        gravar.write(Integer.toString(estatistica[i].qtdAcidentes)); gravar.newLine();
        }System.out.println("GRAVAÇÃO FEITA COM SUCESSO \n Estastisticas salvadas com sucesso ");
        System.out.println("-------------");
        gravar.close(); return estatistica;
    }
    
    public void PQTDACIDENTES(Estatistica[] estatistica){
      for (int i = 0 ; i < 10; i++) 
        {
            if(estatistica[i].qtdAcidentes>100&&estatistica[i].qtdAcidentes<500){
            System.out.println("\ncodigo:  "+estatistica[i].codigoCidade + "\n pontos: "
                + estatistica[i].nomeCidade +"\nAcidentes: "+ estatistica[i].qtdAcidentes);
          }
        } System.out.println("-------------");
    }

    public void PMAIORMENOR(Estatistica[] estatistica){
      int maior = 0;
      int menor = 0;
      for (int i = 0; i < estatistica.length; i++) {

        if (estatistica[i].qtdAcidentes > estatistica[maior].qtdAcidentes) {
          maior = i;
        }
        if (estatistica[i].qtdAcidentes < estatistica[menor].qtdAcidentes) {
          menor = i;
        }
      }
     System.out.println("\nCódigo: " + estatistica[maior].codigoCidade + "Nome: " + estatistica[maior].nomeCidade + "Quantidade: " + estatistica[maior].qtdAcidentes);
     System.out.println("\nCódigo: " + estatistica[menor].codigoCidade + "Nome: " + estatistica[menor].nomeCidade + "Quantidade: " + estatistica[menor].qtdAcidentes);
     System.out.println("-------------");
    }

    public void PACIMA (Estatistica[] estatistica) {
     double soma = 0;

     for (int i = 0; i < estatistica.length; i++) {
        soma += estatistica[i].qtdAcidentes;
     }
     double media = soma / estatistica.length;
     for (int i = 0; i < estatistica.length; i++) {
        if (estatistica[i].qtdAcidentes > media) {
          System.out.println("\n codigo:  " + estatistica[i].codigoCidade + "\n pontos: "
              + estatistica[i].nomeCidade + "\n Acidentes: " + estatistica[i].qtdAcidentes);
          
        }
      }
     System.out.println("\n Média do vetor = " + media);
     System.out.println("-------------");

    } 
    public void LerEstatistica(Estatistica[] estatistica) throws IOException {
        int i;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader( fileName ));
        for (i = 0 ; i < 10 ; i++)   {
             estatistica[i] = new Estatistica() {};
        }
        for(i=0; i<10;i++){
           estatistica[i].codigoCidade = Integer.parseInt(ler.readLine()); 
           estatistica[i].nomeCidade = ler.readLine();
           estatistica[i].qtdAcidentes = Integer.parseInt(ler.readLine()); 
        }
        ler.close();
    }
    

}

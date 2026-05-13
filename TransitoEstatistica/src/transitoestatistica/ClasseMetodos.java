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
        for(i=0; i<3; i++){ estatistica[i] = new Estatistica() {}; }
        for(i=0;i<3;i++){
        estatistica[i].CodigoCidade=Integer.parseInt(JOptionPane.showInputDialog("Entre o codigo da cidade"));
        gravar.write(Integer.toString(estatistica[i].CodigoCidade)); gravar.newLine();
        estatistica[i].NomeCidade=JOptionPane.showInputDialog("Informe o nom eda cidade");
        gravar.write(estatistica[i].NomeCidade); gravar.newLine();
        estatistica[i].QtdAcidentes=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes"));
        gravar.write(Integer.toString(estatistica[i].QtdAcidentes)); gravar.newLine();
        }System.out.println("GRAVAÇÃO FEITA COM SUCESSO \n Estastisticas salvadas com sucesso");
        gravar.close(); return estatistica;
    }
    
    public void PQTDACIDENTES(Estatistica[] estatistica){
      for (int i = 0 ; i < 3; i++) 
        {
            if(estatistica[i].QtdAcidentes>100&&estatistica[i].QtdAcidentes<500){
            System.out.println("\ncodigo:  "+estatistica[i].CodigoCidade + "\n pontos: "
                + estatistica[i].NomeCidade +"\nAcidentes:"+ estatistica[i].QtdAcidentes);
          }
        }
    }

    public void PMAIORMENOR(Estatistica[] estatistica){
      int maior = 0;
      int menor = 0;
      for (int i = 0; i < estatistica.length; i++) {

        if (estatistica[i].QtdAcidentes > estatistica[maior].QtdAcidentes) {
          maior = i;
        }
        if (estatistica[i].QtdAcidentes < estatistica[menor].QtdAcidentes) {
          menor = i;
        }
      }
     System.out.println("\nCódigo: " + estatistica[maior].CodigoCidade + "Nome: " + estatistica[maior].NomeCidade + "Quantidade: " + estatistica[maior].QtdAcidentes);
     System.out.println("\nCódigo: " + estatistica[menor].CodigoCidade + "Nome: " + estatistica[menor].NomeCidade + "Quantidade: " + estatistica[menor].QtdAcidentes);
    }

    public void PACIMA (Estatistica[] estatistica) {
     double soma = 0;

     for (int i = 0; i < estatistica.length; i++) {
        soma += estatistica[i].QtdAcidentes;
     }
     double media = soma / estatistica.length;
     for (int i = 0; i < estatistica.length; i++) {
        if (estatistica[i].QtdAcidentes > media) {
          System.out.println("\ncodigo:  " + estatistica[i].CodigoCidade + "\n pontos: "
              + estatistica[i].NomeCidade + "\nAcidentes:" + estatistica[i].QtdAcidentes);
        }
      }
     System.out.println("\nMédia do vetor = " + media);

    } 
    public void LerEstatistica(Estatistica[] estatistica) throws IOException {
        int i;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader( fileName ));
        for (i = 0 ; i < 3 ; i++)   {
             estatistica[i] = new Estatistica() {};
        }
        for(i=0; i<3;i++){
           estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine()); 
           estatistica[i].NomeCidade = ler.readLine();
           estatistica[i].QtdAcidentes = Integer.parseInt(ler.readLine()); 
        }
        ler.close();
    }
    

}

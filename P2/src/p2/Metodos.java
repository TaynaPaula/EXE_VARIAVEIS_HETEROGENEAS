/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Tayna
 */
public class Metodos {
    /**
     * @param args the command line arguments
     */
    public void leitura(Veiculos[] veiculo) throws IOException {
        String fileName = "Veiculos.txt";
        BufferedReader ler =new BufferedReader(new FileReader( fileName ));
        for(int i=0; i<veiculo.length; i++){
            veiculo[i].chassi = Integer.parseInt(ler.readLine());
            veiculo[i].modelo = ler.readLine();
            veiculo[i].cor = ler.readLine();
            veiculo[i].ano_fab = Integer.parseInt(ler.readLine());
            veiculo[i].kmpcorrida = Integer.parseInt(ler.readLine());
            veiculo[i].valor = Double.parseDouble(ler.readLine());
        }
        ler.close();
        JOptionPane.showMessageDialog(null, "Leitura do arquivo realizada com sucesso!");
    }
    
   
    public void buscaAno(Veiculos[] veiculo) {
        Veiculos aux;
        for (int i = 0; i < veiculo.length-1; i++) {
            for (int j = i + 1; j < veiculo.length; j++) {
                
                if (veiculo[i].ano_fab > veiculo[j].ano_fab) {
                    aux = veiculo[i];
                    veiculo[i] = veiculo[j];
                    veiculo[j] = aux;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "CONSULTAS DOS 100+ Antigos REALIZADA");
        for (int i = 0; i < 100; i++) {
            JOptionPane.showMessageDialog(null, "Ano do veiculo " + veiculo[i].ano_fab + " | Modelo: " + veiculo[i].modelo + " | Cor: " + veiculo[i].cor);
        }
    }

    public Veiculos buscaChassi(Veiculos[] veiculo, int chassiBusca, int i) {
         if(i>=veiculo.length){
             return null;
         }if(veiculo[i].chassi == chassiBusca){
            return veiculo[i];
         } return buscaChassi(veiculo, chassiBusca, i+1);
    }
    
    public void grava(Veiculos[] veiculo) throws IOException{
        String fileName = "Veiculos.txt";
        BufferedWriter gravar = new  BufferedWriter( new FileWriter(fileName));
        for (int i = 0; i < veiculo.length; i++) { 
        veiculo[i] = new Veiculos();  
        }
        for(int i=0; i<2;i++){
           veiculo[i].chassi=Integer.parseInt(JOptionPane.showInputDialog("Entre com o chassi"+ (i+1)+": "));
           gravar.write(Integer.toString(veiculo[i].chassi)); gravar.newLine();
           
           veiculo[i].cor = JOptionPane.showInputDialog("Entre com a cor");
           gravar.write(veiculo[i].cor);gravar.newLine();
           
           veiculo[i].valor=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor"));
           gravar.write(Double.toString(veiculo[i].valor));gravar.newLine();
        }gravar.close();
    }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Tayna
 */
public class Menu {
    public static void main(String[] args)throws IOException{
        Veiculos [] veiculo = new Veiculos[10000];
        Metodos m = new Metodos();
        for(int i=0; i<veiculo.length; i++){
            veiculo[i] = new Veiculos();
        }
        int opc=0;
        while(opc!=9){
            opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1- Leitura veiculos \n 2 - Busca 100 veiculos por ano \n 3- Busca veiculo por chassi \n 9 - Fim"));
            switch(opc){
              case 1:
                m.leitura( veiculo);
                break;
              case 2:
                m.buscaAno( veiculo);
                break;
              case 3:
                int chassiBusca=Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do chassi"));
                Veiculos encontrado = m.buscaChassi(veiculo, chassiBusca,0);
                if(encontrado!= null){
                  JOptionPane.showMessageDialog(null, "Veiculo encontrado: ");
                }else{
                   JOptionPane.showMessageDialog(null, "veiculo  nao encontrado");
                }
                break;
              case 9:
                JOptionPane.showMessageDialog(null,"Saindo do sistemaa");
                break;
              default:
                JOptionPane.showMessageDialog(null,"Opocao invalioda");
            } 
       } 
   }
   
}

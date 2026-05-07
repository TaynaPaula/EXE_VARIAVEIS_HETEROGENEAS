import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica){
        int i;
        for(i=0;i<3;i++){
        estatistica[i].CodigoCidade=Integer.parseInt(JOptionPane.showInputDialog("Entre o codigo da cidade"));
        estatistica[i].NomeCidade=JOptionPane.showInputDialog("Informe o nom eda cidade");
        estatistica[i].QtdAcidentes=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes"));
        }return estatistica;
    }
    
    public void PQTDACIDENTES(Estatistica[] estatistica){
     

      for (int i = 0 ; i < 3; i++) 
        {
          System.out.println(estatistica[i].CodigoCidade + "codigo:  " + estatistica[i].NomeCidade + " pontos: " + estatistica[i].QtdAcidentes);
        }
    }

    public void PMAIORMENOR(Estatistica[] estatistica){
      int maior = estatistica[0].QtdAcidentes;
      int menor = estatistica[0].QtdAcidentes;
      
      for (int i = 0; i < estatistica.length; i++) {

        if (estatistica[i].QtdAcidentes > maior) {
          maior = estatistica[i].QtdAcidentes;
        }
        if (estatistica[i].QtdAcidentes < menor) {
          menor = estatistica[i].QtdAcidentes;
        }
      }
     System.out.println("\nMaior é:  " + maior + "\nMenor é:  " + menor);

    }

    public void PACIMA (Estatistica[] estatistica) {
     double soma = 0;

     for (int i = 0; i < estatistica.length; i++) {
        soma += estatistica[i].QtdAcidentes;
     }

     double media = soma / estatistica.length;
     System.out.println("\nMédia do vetor = " + media);

    }            
               
                    
                   
}

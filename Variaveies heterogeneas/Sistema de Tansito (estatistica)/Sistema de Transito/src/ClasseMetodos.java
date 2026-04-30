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
     int i;

    for (i = 0 ; i < 3; i++) 
       {
         System.out.println(estatistica[i].CodigoCidade + "DDD:  " + estatistica[i].NomeCidade 
                            + " pontos: " + estatistica[i].QtdAcidentes);
       }
   }

   public void PMAIORMENOR(Estatistica[] estatistica){

   }

   public void PACIMA (Estatistica[] estatistica) {

   }            
               
                    
                   
}

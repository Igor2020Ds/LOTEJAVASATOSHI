// PROCEDIMENTO SEM PARÂMETRO
import javax.swing.JOptionPane;
public class PROCEDIMENTO_SEMPARAMETRO {
    
    public static void main(String args[]){
  
        calculaHoras();
    
    }
    
    public static void calculaHoras(){
       double salarioLiquido=0, vHFinal=0, hTFinal=0;
       
        vHFinal=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora"));
        hTFinal=Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas"));
       
       
       salarioLiquido= vHFinal*hTFinal;
       
 
       JOptionPane.showMessageDialog(null, "O valor do salário líqido é : " + salarioLiquido);
        
    }
    
}

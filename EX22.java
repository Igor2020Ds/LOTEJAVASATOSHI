
//	22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

import javax.swing.JOptionPane;
public class EX22 {
    public static void main(String args[]){

        int numero1,numero2;
        // O try abre a condição de análise do catch
        try{

        numero1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Informe o seguendo número"));

        }
        //catch faz a verificação se é valor int conforme formatado ou não
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Informe valor numérico");
            return;
        }
        // verificando a ordem de grandeza n1>n2
        if(numero1>numero2){
            JOptionPane.showMessageDialog(null, numero1 + " e "+ numero2);  
        }
       
        // n2>n1

        else if
            (numero2>numero1){
            JOptionPane.showMessageDialog(null, numero2 + " e " + numero1);  
        }
        // responde igualdade
        else{
            JOptionPane.showMessageDialog(null, "Os valores são iguais: " + numero1);
        }
        
        

    }
    
}

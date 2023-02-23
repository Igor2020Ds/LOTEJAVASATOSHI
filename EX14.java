/*14.	Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo. */

import javax.swing.JOptionPane;
public class EX14{
    public static void main(String args []){

        double  a1=0,a2=0,ang=0;

        a1=Double.parseDouble(JOptionPane.showInputDialog("INforme o valor do primeiro ângulo"));
        a2=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo ângulo"));
        if(a1+a2<180){
            ang=180-(a1+a2);
            

        }
       
    
        else{
            JOptionPane.showMessageDialog(null,"Não é triângulo: " );
        }
         JOptionPane.showMessageDialog(null,  "O valor do terceiro ângulo é : " + ang);
    }

}

/* 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.*/

import javax.swing.JOptionPane;
public class EX10 {

    public static void main(String args[]){

        double a,b,calculo;

        a=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));

        calculo=Math.abs(a-b);
        JOptionPane.showMessageDialog(null,"A diferença é: " + calculo);

        if(a>b){
         calculo=   (a-b);
         JOptionPane.showMessageDialog(null, "O valor da diferença é ( a > b):  " + calculo);
        }
        else{
            calculo = (b-a);
            JOptionPane.showMessageDialog(null, "O valor da diferença é ( b > a):  " + calculo);
            
        }

       
    }
    
}

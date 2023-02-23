//19.	Receba 2 valores reais. Calcule e mostre o maior deles.

import javax.swing.JOptionPane;


public class EX19 {
    public static void main (String args[]){
        double n1=0,n2=0,operador=0,soma=0;

        n1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

        if(n1>n2){
            operador=n1;
        }
        else{
            operador=n2;
        }
        soma=(n1+n2);
        JOptionPane.showMessageDialog(null, " o maior valor é : " + operador + " E a soma entre " +
        n1 + " e " + n2 + " é :  " + soma);


    }
    
    
}

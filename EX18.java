
/*18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor. */

import javax.swing.JOptionPane;
public class EX18{
    public static void main(String agrs[]){
        double n1=0,n2=0,operador;

        n1=Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

        if(n1>n2){
            operador=(n1-n2);
        }
        else{
            operador=(n2-n1);
        }
        JOptionPane.showMessageDialog(null,"O valor da diferença do maior para o menor é : " +operador);
    }
}
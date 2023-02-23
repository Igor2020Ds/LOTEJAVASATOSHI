/*15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa. */

import javax.swing.JOptionPane;
public class EX15{
    public static void main(String args[]){
        double a,b,h,operador;

        a=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de um lado"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo lado"));
        operador=(a*a)+(b*b);
       
        h= Math.sqrt(operador);

        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é : "+ h);


    }

}

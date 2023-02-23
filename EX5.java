/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 *
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;

public class EX5{
    public static void main(String args[]){
        double a,b,c,delta,x1,x2;
        a=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de a"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de b"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de c"));
        
        delta= Math.pow(-b,2) - 4* a * c;
        x1= (-b + Math.sqrt(delta)/(2*a));
        x2= (-b - Math.sqrt(delta)/(2*a));
        
        
        JOptionPane.showMessageDialog(null, "O valor de x1 é: " + x1 );
        JOptionPane.showMessageDialog(null, "O valor de x2 é: " + x2 );
        
    }
}
/*20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se 
caso exista, calcule e mostre*/

import javax.swing.JOptionPane;
public class EX20{
    public static void main(String args[]){
        double a=0,b=0,c=0,delta=0,x1=0,x2=0;

        a=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de a"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de b"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de c"));

        delta= b*b -(4*a*c);
        

        if(delta<0){
        JOptionPane.showMessageDialog(null,"Não possui raiz real");
                                                                                            }
        else if(delta==0){
            double x= (-b)/2*a;
        JOptionPane.showMessageDialog(null,"A equação possui apenas uma raiz real" + x);
            
        }           
        else{

            x1=((-b+ Math.sqrt(delta))/(2*a));
            x2=((-b- Math.sqrt(delta))/(2*a));
            JOptionPane.showMessageDialog(null,"x1= " +  x1 + "x2 = " + x2);
            
        }                                                                         

    }
}
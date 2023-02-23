/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 *
 * @author Igor Augusto Medeia
 */

import javax.swing.JOptionPane;

public class EX3{
    public static void main (String args[]){
     double b,h,area;
     b=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base"));
     h=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura"));
     area= (b*h)/2;
     JOptionPane.showMessageDialog(null, "O valor da área do Triângulo é: " + area);
    
    }
    
}
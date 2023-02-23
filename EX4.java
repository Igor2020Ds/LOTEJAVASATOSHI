/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 *
 * @author Igor Augusto Medeia
 */


import javax.swing.JOptionPane;

public class EX4{
    public static void main (String args[]){
        double c=0,f=0;
        c=Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus celsius"));
        f= (9*c+160)/5;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é "+ f);
    }
}

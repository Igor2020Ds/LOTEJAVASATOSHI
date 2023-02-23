/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;

public class EX7{
    public static void main(String args[]){
    
        
        double c,l,h,v;
        c=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do comprimento do Paralelepípedo"));
        l=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da largura do Paralelepípedo"));
        h=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do Paralelepípedo"));
        v=((2*h*l) + (2*h*c)+ (2*l*c));
        JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é : " +v);
    }
}
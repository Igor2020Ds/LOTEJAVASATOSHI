/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** 1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * @author Igor Augusto Medeia
*/

import javax.swing.JOptionPane;

public class EX1{
    public static void main(String args[]){
        double lado,area;
        lado=Double.parseDouble(JOptionPane.showInputDialog("Informeo valor do lado"));
        area= Math.pow(lado,2);
        JOptionPane.showMessageDialog(null, "O valor da área é: " + area);
    }
}

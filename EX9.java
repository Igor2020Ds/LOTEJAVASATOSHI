/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados."(a + b)2 = (a + b) . (a + b)"


 *“O primeiro termo elevado ao quadrado mais o dobro do primeiro termo multiplicado pelo segundo termo mais o segundo termo elevado ao quadrado.”
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;
public class EX9{

    public static void main(String args[]){
        double a,b,soma;

        a=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro número"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro número"));

        soma= Math.pow(a+b,2);
        JOptionPane.showMessageDialog(null, "O valor da soma é" + soma);


        }
    }

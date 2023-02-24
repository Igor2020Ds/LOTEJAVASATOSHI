/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *    32.	Receba um número inteiro. Calcule e mostre o seu fatorial.

 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;

public class EX32 {
    public static void main(String[] args) {
        int numero, fat = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        for (int i = 1; i <= numero; i++) {
            fat = fat * i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fat);
    }
}


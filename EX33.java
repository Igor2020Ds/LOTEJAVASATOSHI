/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
public class EX33 {
    public static void main(String args[]){
        int numeroInicial=1,numeroFixo=1, n=10;
        
        while(numeroInicial<n){
            numeroInicial=numeroFixo/numeroInicial+1;
            
            JOptionPane.showMessageDialog(null, + numeroInicial);
        
    }
       
    }
}

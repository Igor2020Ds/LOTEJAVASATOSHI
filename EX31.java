/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *31.	Calcule e mostre o quadrado dos números entre 10 e 150
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
  public class EX31 {
    public static void main(String args[]){
        
        double numeroI=10, numeroF=150,square;
        int i = 10;
        
        while(i <= 150) {
            square = i*i;
           
            JOptionPane.showMessageDialog(null,"O quadrado de " + i + " é " + square) ;
            
            i++;
        }
    }
}
        
       
   
    

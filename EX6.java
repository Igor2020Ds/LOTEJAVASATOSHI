/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 *
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;

public class EX6{
    public static void main (String agrs[]){
    double x=0,y=0,z = 0;
    x=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para x"));
    y=Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para y"));
    
    JOptionPane.showMessageDialog(null,"O valor original de x é" +x);
    JOptionPane.showMessageDialog(null,"O valor original de y é: " + y);
    
    x=z;
    z=y;
    x=y;
    
   
    JOptionPane.showMessageDialog(null,"O novo valor de x é: " + x);
    JOptionPane.showMessageDialog(null, "O novo valor de y é: " + y);
    }
    }

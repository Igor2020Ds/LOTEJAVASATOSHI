/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *31.	Calcule e mostre o quadrado dos números entre 10 e 150.
 * @author FATEC ZONA LESTE
 */


//25.	Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
//sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.

import javax.swing.JOptionPane;


public class EX30{
    public static void main(String args[]){
        double horaInicial, horaFinal, minutoInicial,minutoFinal,hH,mM;
       
        horaInicial=Double.parseDouble(JOptionPane.showInputDialog("Informe a hora iniial"));
        horaFinal=Double.parseDouble(JOptionPane.showInputDialog("Informe a hora final"));
        minutoInicial=Double.parseDouble(JOptionPane.showInputDialog("Informe o minuto inicial"));
        minutoFinal=Double.parseDouble(JOptionPane.showInputDialog("Informe o minuto final"));
        
        
        if(horaFinal> horaInicial && minutoFinal>minutoInicial){
            
           hH = (horaFinal-horaInicial);
           mM=(minutoFinal-minutoInicial);
        }
        
        else if(horaFinal<horaInicial && minutoFinal<minutoInicial){
            
            hH=(24+horaInicial+(horaFinal));
            mM=(60-minutoInicial+(minutoFinal));
            
        }

        else if(horaFinal>horaInicial && minutoFinal<minutoInicial){
            hH = (horaFinal-horaInicial);
            mM=(60+minutoInicial+(minutoFinal));
            
        }
        
        else{
            hH=(24+horaInicial+(horaFinal));
            mM=(minutoFinal-minutoInicial);
        }
        
        if(mM>60){
            hH=+1;
            mM=mM-60;
        }
        
        else{
            
        }
        
        JOptionPane.showMessageDialog(null,"Ao fim do jogo computou-se " + hH + " e " + mM);
        }
    }

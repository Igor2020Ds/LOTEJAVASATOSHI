
//21.	21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
//a.	Se a média for >= 6,0 exibir “APROVADO”;
//b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
//c.	Se a média for < 3,0 exibir “RETIDO”.

import javax.swing.JOptionPane;
public class EX21{
    public static void main(String args[]){
        double primeiraNota=0,segundaNota=0,terceiraNota=0,quartaNota=0,mediaNotas=0;

        primeiraNota=Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
        segundaNota=Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
        terceiraNota=Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
        quartaNota=Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
        // faz a divisão simples 
        mediaNotas=(primeiraNota+segundaNota+terceiraNota+quartaNota)/4;

        //Nota para ser aprovado
        if(mediaNotas>=6){
            JOptionPane.showMessageDialog(null,"APROVADO com : " +mediaNotas);

        }
        // Nota para atingir exame
        else if(mediaNotas >=3 && mediaNotas < 6){
            JOptionPane.showMessageDialog(null,"EXAME, nota foi :  " + mediaNotas);
        }
        // Nota para atingir retido
        else{
            JOptionPane.showMessageDialog(null,"RETIDO nota atingiu: " + mediaNotas);
        }


    }





}

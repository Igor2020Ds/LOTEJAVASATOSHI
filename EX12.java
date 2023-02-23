
/* 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.*/

import javax.swing.JOptionPane;
public class EX12{


    public static void main(String arg[]){
        double dtNasc,aA, idadeA, futura;

        dtNasc=Double.parseDouble(JOptionPane.showInputDialog("Informe a data de nascimento : "));
        aA=Double.parseDouble(JOptionPane.showInputDialog("Informe em qual ano estamos"));
        idadeA= aA-dtNasc;
        futura=idadeA+ 17;

        JOptionPane.showMessageDialog(null,"A idade atual é : " + idadeA);
        JOptionPane.showMessageDialog(null, "A idade daqui 17 anos será : " + futura);




    }
}
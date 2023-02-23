/*13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia. */


import javax.swing.JOptionPane;

public class EX13{

    public static void main(String args[]){
        double quantidade, consumo, dias;

        quantidade=Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimentos em kg"));
        quantidade=quantidade*1000;
        consumo=50;
        dias=quantidade/consumo;
        JOptionPane.showMessageDialog(null,"Consumindo 50g por dia, durará : " + dias);



    }
}
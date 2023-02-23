//24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

import javax.swing.JOptionPane;

public class EX24 {
    public static void main(String[] args) {

        double numero1;

        try {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe um valor numérico");
            return;
        }

        if (numero1 % 2 == 0 && numero1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "É divisível por 2 e 3");
        } else {
            JOptionPane.showMessageDialog(null, "Não é divisível por 2 e 3");
        }
    }
}
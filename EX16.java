
/*16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber. */

import javax.swing.JOptionPane;

public class EX16{
    public static void main(String args[]){
        double ht, vh, desconto, dependentes, salarioB, salarioL,operador;
        ht=Double.parseDouble (JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas"));
        vh=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada"));
        dependentes=Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de dependetes"));
        operador=dependentes*100;
        salarioB = (ht*vh);
        

        if (salarioB >= 1212.01 && salarioB <=2427.35){
           desconto= (0.09);
        }
        
        else if(salarioB >= 2427.36  && salarioB <=3641.03){
            desconto= (0.12);
         }

         else if(salarioB >= 3641.04 ){
            desconto= (0.14);
         }
         else{
            desconto=(0);
         }
        salarioL=(salarioB-(salarioB*desconto)+operador);


        JOptionPane.showMessageDialog(null,"O valor do salário bruto é : " + salarioB +" A quantidade de dependentes é : " + dependentes +" O valor do saláro" +
    " liquido é : " + salarioL +" O valor do desconto é : " + desconto);

    }
}
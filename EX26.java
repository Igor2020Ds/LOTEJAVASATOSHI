//26.	Receba 2 números inteiros. Verifique e mostre se o 
//maior número é múltiplo do menor.


import javax.swing.JOptionPane;

public class EX26 {
    public static void main(String args[]){

        int numeroPrimeiro,numeroSegundo;


        numeroPrimeiro=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        numeroSegundo=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segundo número"));

        if(numeroPrimeiro>numeroSegundo && numeroPrimeiro % numeroSegundo==0){
            JOptionPane.showMessageDialog(null,"O maior número é múltiplo do menor");       
        }

        else if(numeroSegundo>numeroPrimeiro && numeroSegundo % numeroPrimeiro==0){
            JOptionPane.showMessageDialog(null,"O maior número é múltiplo do menor");  
        }     
        else{
            JOptionPane.showMessageDialog(null,"errp");        }
    }
}



//PROCEDIMENTO COM PARAMETRO


import javax.swing.JOptionPane;
public class LT01_MOD {
    static Double horasTrabalhadas,valorHora, desconto, dependentes,salarioBruto,salarioLiquido;
    
    public static void main(String args[]){
        
        valorHora=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora"));
        horasTrabalhadas=Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas"));
        
            calculaHoras(valorHora,horasTrabalhadas);
            
            
           
        
    }
    
    public static void calculaHoras( double vHFinal, double hTFinal){
        
       salarioLiquido= vHFinal*hTFinal;
       
       JOptionPane.showMessageDialog(null, "O valor do salário líqido é : " + salarioLiquido);
        
    }
    
}


/*17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 Receber o tempo de percurso e a velocidade média. */


import javax.swing.JOptionPane;
public class EX17{
    public static void main(String args[]){
        double eficiencia,tempo,consumo, velocidadeM,distancia;
        eficiencia=12;
        velocidadeM=Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média da distância percorrida"));
        tempo=Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de viagem"));
        distancia=(velocidadeM*tempo);
        consumo=(distancia/eficiencia);
        
        JOptionPane.showMessageDialog(null, "O consumo de gasolina foi : " + consumo );




    }
}


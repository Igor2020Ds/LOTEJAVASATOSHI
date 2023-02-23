//27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a 
//velocidade média em km/h.
import javax.swing.JOptionPane;

public class EX27 {
    public static void main(String args[]){
        double quantidadeVoltas, extensao, distanciaTotal, tempoDuracao, velocidadeMedia;

        quantidadeVoltas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de voltas: "));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito (em metros): "));
        tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de duração (em minutos): "));

        distanciaTotal = quantidadeVoltas * extensao;
        double distanciaTotalKm;
        distanciaTotalKm = distanciaTotal / 1000;

        // convertendo o tempo para horas
        tempoDuracao = tempoDuracao * 1.0 / 60.0;
        double tempoDuracaoH;
        tempoDuracaoH = tempoDuracao;

        velocidadeMedia = distanciaTotalKm / tempoDuracaoH;

        JOptionPane.showMessageDialog(null, "A velocidade média foi: " + String.format("%.2f", velocidadeMedia) + " km/h");
    }
}
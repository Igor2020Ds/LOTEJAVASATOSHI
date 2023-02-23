import javax.swing.JOptionPane;


public class EX11{

    public static void main (String args[]){
        double raio, C;
            raio=Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunferência em cm"));
            C= 2*Math.PI*raio;

            JOptionPane.showMessageDialog(null, "O comprimento da circunferência é : " + C);
        

}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * @author Igor Augusto Medeia
 */
import javax.swing.JOptionPane;

public class EX8 {
	public static void main(String args[]) {
		double deposito, rendimento, saldo;
		int quantidadeDeMeses;
		saldo = 0;
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito"));
		quantidadeDeMeses = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de meses que irá render"));
		rendimento = 0.013;
		saldo +=  deposito;
		for (int i=0; i<quantidadeDeMeses; i++){
			saldo += (saldo*rendimento);
		}
		JOptionPane.showMessageDialog(null, "Após "+  quantidadeDeMeses +" mes o valor depositado será " + saldo + ".",
				rendimento + "a.m", JOptionPane.INFORMATION_MESSAGE);
	}
}
package Cadastro;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class mainCadastro {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		CadastroPF pf1 = new CadastroPF();
		CadastroPJ pj1 = new CadastroPJ();

		int test1 = 0;

		test1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Pessoa Física \n2 - Pessoa Jurídica"));


		while (test1 < 1 || test1 > 2) {
			test1 = Integer.parseInt(JOptionPane.showInputDialog("1 - Pessoa Física \n2 - Pessoa Jurídica"));
			
		}

		if (test1 == 1) {
			System.out.println("Pessoa Fisica");
			String varNome = JOptionPane.showInputDialog("Digite seu nome: ");
			pf1.setNome(varNome);

			int varTel = Integer.parseInt(JOptionPane.showInputDialog("Digite um telefone: "));
			pf1.setTelefone(varTel);

			String varMail = JOptionPane.showInputDialog("Digite um e-mail: ");
			pf1.setEmail(varMail);

			String varReg = JOptionPane.showInputDialog("Digite sua região: ");
			pf1.setRegiao(varReg);

			double varRen = Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda: "));

			pf1.setRenda(varRen);

			
			JOptionPane.showConfirmDialog(null,"---- CONFIRME SEUS DADOS -----" + " \nNome: " + pf1.getNome() +
					"\nTelefone: " + pf1.getTelefone()+
					"\nEmail: " + pf1.getEmail() +
					"\nRegião: " + pf1.getRegiao()+
					"\nRenda: " + pf1.getRenda());
			
			pf1.ValorIrpf();
		}

		if (test1 == 2) {
			System.out.println("Pessoa Juridica");
			String varNome = JOptionPane.showInputDialog("Digite seu nome fantasia: ");
			pj1.setNome(varNome);

			int varTel = Integer.parseInt(JOptionPane.showInputDialog("Digite um telefone: "));
			pj1.setTelefone(varTel);

			String varMail = JOptionPane.showInputDialog("Digite um e-mail: ");
			pj1.setEmail(varMail);

			String varReg = JOptionPane.showInputDialog("Digite sua região: ");
			pj1.setRegiao(varReg);

			double varRen = Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda: "));
			pj1.setRenda(varRen);
			
			
			JOptionPane.showConfirmDialog(null,"---- CONFIRME SEUS DADOS -----" + " \nNome: " + pj1.getNome() +
					"\nTelefone: " + pj1.getTelefone()+
					"\nEmail: " + pj1.getEmail() +
					"\nRegião: " + pj1.getRegiao()+
					"\nRenda: " + pj1.getRenda());
			pj1.ValorIrpfPJ();
		}
		
		
		

		System.out.println("FIM");
	}
}
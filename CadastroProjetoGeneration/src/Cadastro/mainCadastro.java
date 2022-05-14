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

			pf1.ValorIrpf();
		}

		if (test1 == 2) {
			System.out.println("Pessoa Juridica");
			JOptionPane.showInputDialog("Digite seu nome fantasia: ");
			String varNome = ler.next();
			pj1.setNome(varNome);

			JOptionPane.showInputDialog("Digite um telefone: ");
			int varTel = ler.nextInt();
			pj1.setTelefone(varTel);

			JOptionPane.showInputDialog("Digite um e-mail: ");
			String varMail = ler.next();
			pj1.setEmail(varMail);

			JOptionPane.showInputDialog("Digite sua região: ");
			String varReg = ler.next();
			pj1.setRegiao(varReg);

			JOptionPane.showInputDialog("Digite sua renda: ");
			double varRen = ler.nextDouble();
			pj1.setRenda(varRen);
		}

		System.out.println("FIM");
	}
}
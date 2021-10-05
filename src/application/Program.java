package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CPF;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		CPF cpf = new CPF();
		Scanner sc = new Scanner(System.in);

		while (sc != null) {
			System.out.println("Digite seu cpf: 000.000.000-00");
			String n = sc.nextLine();

			n = n.replace(".", "").replace("-", "").replace(",", "");

			try {
				cpf = new CPF(n);
				System.out.println(cpf.toString());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println("Valores inválidos, digite novamente");
			} catch (IllegalStateException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
		sc.close();
	}

}

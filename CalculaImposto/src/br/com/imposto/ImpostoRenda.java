package br.com.imposto;
import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		System.out.println("Digite seu salario bruto: ");
		Scanner ler = new Scanner(System.in);
		double salario = ler.nextDouble();
		
		if (salario < 1900) {
			System.out.println("nao ha deducao fiscal");
		} else if (salario >= 1900.00 && salario < 2800.00){
			System.out.println("A deducao fiscal eh de 7.5%");
			System.out.println("Voce deve deduzir o valor de " + salario * 0.075 +  " reais");
		} else if (salario >= 2800.00 && salario < 3750) {
			System.out.println("A deducao fiscal eh de 22.5%");
			System.out.println("Voce deve deduzir o valor de " + salario * 0.225 + " reais");
		} else {
			System.out.println("A deducao fiscal eh de 27.5%");
			System.out.println("Voce deve deduzir o valor de " + salario * 0.275 + " reais");
		}

	}

}

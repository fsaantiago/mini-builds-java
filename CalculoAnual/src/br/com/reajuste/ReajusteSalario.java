package br.com.reajuste;
import java.util.Scanner;

public class ReajusteSalario {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		//variaveis
		double aumento = 1.5, salario = 1000, ano = 2015;
		
		do {
			salario = salario * (salario * aumento / 100);
			aumento = aumento * 2;
			ano++;
		} while (ano <= 2018);{
			System.out.println(salario);
			
		}
	}
}

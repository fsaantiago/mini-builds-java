package br.com.circle;
import java.util.Scanner;

public class CalcCircle {
	public static void main(String[] args) {
		
		//Scanner serve pra separar a entrada dos textos em blocos separados 
		Scanner ler = new Scanner(System.in);
	    
		// onde informar o raio para calcular a área do circulo
		System.out.print("Informe o raio do circulo: ");
		
	    //método para guardar o valor do raio informado
		double radius = ler.nextDouble();
		
		//calcuilo da área: Math.PI usado para armazenar um valor estático * valor do rádio informado pelo usuário
	    double area = Math.PI * radius * radius;
	    
	    //impressão do valor total referente ao cálculo da área.
	    System.out.println("A área do circulo é: " + area);
	  }
}

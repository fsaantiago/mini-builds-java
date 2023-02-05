package br.com.calc;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		char tipo;
	    double num1, num2, result;

	    // criação de Scanner para leitura das informacoes do usuario
	    Scanner input = new Scanner(System.in);

	    // tipo de calculo
	    System.out.println("Selecione o tipo de cálculo que deseja fazer: +, -, *, ou / ");
	    tipo = input.next().charAt(0);

	    // inserção de numeros para calculo
	    System.out.println("Insira o primeiro número ");
	    num1 = input.nextDouble();

	    System.out.println("Insira o segundo número ");
	    num2 = input.nextDouble();

	    switch (tipo) {

	      // soma
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // ubtracao
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // multiplicacao
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // divisao
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Tipo de cálculo inválido! ");
	        break;
	    }
	    input.close();	  
	}
}

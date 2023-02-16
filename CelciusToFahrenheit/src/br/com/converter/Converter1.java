package br.com.converter;
import java.util.Scanner;

public class Converter1 {

	public static void main(String[] args) {
        double celsius, fahrenheit;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o valor em graus fahrenheit que deseja converter para celsius: ");
        fahrenheit = ler.nextDouble();
        
        // formula for conversion
        celsius = ((fahrenheit - 32)*5) / 9;
        System.out.println(
            "o valor de fahrenheit eh:"
            + fahrenheit);

	}

}

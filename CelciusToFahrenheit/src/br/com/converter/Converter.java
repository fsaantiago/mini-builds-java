package br.com.converter;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		 
        double celsius, fahrenheit;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o valor em graus celsius que deseja converter para fahrenheit: ");
        celsius = ler.nextDouble();
        
        // formula for conversion
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(
            "o valor de fahrenheit eh:"
            + fahrenheit);

	}

}

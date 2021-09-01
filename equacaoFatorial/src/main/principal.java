package main;

import java.util.Scanner;

public class principal {
	
	public static void main (String [] args) {
		
		int numero;
        System.out.println("Informe o numero para calcular o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        long fatorial = 1;
        int i = 1;
        
        while (i<=numero){
            fatorial = fatorial * i;
            i++;
            
        }
        
        System.out.println(" o fatorial de: " + numero + " é: " + fatorial);
	}

}	

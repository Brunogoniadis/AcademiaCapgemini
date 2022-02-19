package capgemini;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int asterisco=0; 											//Nesse campo ser� armazenado o tamanho da escada
		
		System.out.println("Descreva quantos andares a escada vai ter: ");
		asterisco = teclado.nextInt(); 						//Scanner do teclado sendo atribu�do na vari�vel asterisco
		System.out.println(" ");
		
		for(int i = 1; i <= asterisco; i++) {
			for(int j = 1; j <= asterisco - i; j++) {
				System.out.print(' '); 							//Espa�o em branco sendo atribu�do por toda a linha
			}
			for(int j = 1; j <= i; j++) {
				System.out.print('*');								//Asterisco sendo atribu�do nos �ltimos espa�os
			}
			System.out.println("");								//Salto de linha
		}
		teclado.close();                                              //Fechamento do Scanner (teclado)
	}
}




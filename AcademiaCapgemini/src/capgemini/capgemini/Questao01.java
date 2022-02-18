package capgemini;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int asterisco=0; 											//Nesse campo será armazenado o tamanho da escada
		
		System.out.println("Descreva quantos andares a escada vai ter: ");
		asterisco = teclado.nextInt(); 						//Scanner do teclado sendo atribuído na variável asterisco
		System.out.println(" ");
		
		for(int i = 1; i <= asterisco; i++) {
			for(int j = 1; j <= asterisco - i; j++) {
				System.out.print(' '); 							//Espaço em branco sendo atribuído por toda a linha
			}
			for(int j = 1; j <= i; j++) {
				System.out.print('*');								//Asterisco sendo atribuído nos últimos espaços
			}
			System.out.println("");								//Salto de linha
		}
		teclado.close();                                              //Fechamento do Scanner (teclado)
	}
}




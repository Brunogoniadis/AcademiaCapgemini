package capgemini;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe a senha");
	String senha= teclado.nextLine();								//Inicialização do teclado
	

	int tam = 6-senha.length();											//Verificação do tamanho da senha, necessario ser maior que 6 para ser valida
	
	if(tam<0) {
		tam=0;																		//Caso verificaão seja -0( Valida), quantidade dos caracteres faltantes para ser valida sera 0
	}
	
	System.out.println(tam);												//Impressao da quantidade de caracteres faltantes para senha ser segura.
	
	teclado.close();
	}

}

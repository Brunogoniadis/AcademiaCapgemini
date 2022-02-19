package capgemini;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {


	public static void main(String[] args) {
	    
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Defina a palavra para verificar se existem anagramas pares: ");
	    String palavra = teclado.nextLine();
	    		
	    ArrayList<String> anagramas = new ArrayList<String>();
	    for(int i = 0; i <palavra.length(); i++) {
	    		
	        for(int j = 1; j < palavra.length(); j++) { //la�o de repeti��o que faz a compara��o dos caracteres do string
	            if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
	                if(palavra.charAt(i) == palavra.charAt(i+1)) {
	                String x = palavra.substring(i, i + 1);
	                anagramas.add(x);
	                } else {
	                String y = palavra.substring(i, j);
	                String z = palavra.substring(i + 1, j + 1);
	                String h = palavra.substring(i, i + 1);
	                anagramas.add(h);
	                anagramas.add(y);
	                anagramas.add(z);
	                }
	            }
	        }
	    }
	    for(int cont = 0 ; cont< anagramas.size() ; cont++) {
	    	for(int cont2 =1 ; cont2<anagramas.size(); cont2++) {
	    		if((anagramas.get(cont).length()>1) &&(anagramas.get(cont).equals(anagramas.get(cont2)))) { //Remove os anagramas iguais
	    			anagramas.remove(cont);
	    		}
	    		
	    	}
	    }
	    
	    System.out.println("  ");
	    System.out.println(anagramas.size());            //Revela o tamanho do anagrama
	    System.out.println(" ");
	    
	    teclado.close();
	    
	    //Inicio dos testes unitarios
	    System.out.println("Teste unitario para ifailuhkqq:");
		if((palavra.equals("ifailuhkqq"))&&(anagramas.size()==3)) { 
			System.out.println("Valor esta correto");
		}else {
			System.out.println("Valor esta incorreto");
		}
		System.out.println(" ");
		System.out.println("Teste unitario para ovo:");
		if((palavra.equals("ovo"))&&(anagramas.size()==2)) {
			System.out.println("Valor esta correto");
		}else {
			System.out.println("Valor esta incorreto");
		}
	}
	

}

import java.util.Locale;

public class ProcessamentoCasting {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		//O objetivo do exercicio � fazer o numero sair com ponto flutuante
		//Entrada de dados 
		int a , b ;  
		double resultado;
		a = 5;
		b = 2;
		
		//Processamento de dados
		//neste caso a variavel A e B esta como o tipo INT e eu transformei ela para o tipo Double 
		resultado = (double) a / b;
		
		
		//saida de dados do algoritmo
		System.out.println(resultado);
			
	}

}

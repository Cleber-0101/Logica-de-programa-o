import java.util.Locale;

public class SaidaDeDados {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		//Algoritmo simples 
		//entrada de dados 
		String nome; 
		int idade;
		String Logradouro;
		char sexo;
		double altura;
		String cidadeAondeMora;
		
		//processamento de dados
		nome = "Cleber";
		idade = 24;
		Logradouro = "Rua rio campanha 255";
		altura = 1.85;
		cidadeAondeMora = "S�o Paulo, Br "; 
		
		//saida de dados 
		System.out.println("Meu nome � " + nome + " tenho, " + idade + " de idade e " + "moro na " + Logradouro 
				+ " tenho a altura de: " + altura + " moro na cidade de: " + cidadeAondeMora);
		
	}
}

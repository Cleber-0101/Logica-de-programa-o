import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("Ola mundo");
	     Locale.setDefault(Locale.US);
	     //sempre que eu for usar o ponto no lugar virgula usar o Locale,setDeafult(Locale.Us)
			
	     
	     //variaves e tipos de dados
		int idade;
		double salario ,altura;
		char genero;
		String nome;
		
		idade = 25;
		salario = 5800.5;
		altura = 1.72;
		genero = 'M';
		nome = "Cleber Batista Da Silva" ;
		
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + salario);
		System.out.println("ALTURA = " + altura);
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);
		
		
	}

}

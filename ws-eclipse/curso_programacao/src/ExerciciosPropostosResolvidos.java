import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPropostosResolvidos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leitorDeSenha = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno");
		double nota = leitorDeSenha.nextDouble();
		
		if(nota > 60.00) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		
		leitorDeSenha.close();
		
	}

}

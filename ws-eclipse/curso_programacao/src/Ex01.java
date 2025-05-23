import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		//calculos		
		double a = leitura.nextDouble();
		double b = leitura.nextDouble();
		double c = leitura.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		if(a == 0 || delta < 0.0) {
			System.out.println("Impossivel de calcular");
		}else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b + Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
				
		leitura.close();
	}

}

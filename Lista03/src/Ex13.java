import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número a ser fatorado: ");
		
		int num = Integer.parseInt(entrada.nextLine());
		int k;
		int resultado =1;
		
		for(k = 1; k <=num; k++) {
			resultado = resultado*k;
		}
		
		System.out.println("Resultado: " + resultado);
		
		entrada.close();

	}

}

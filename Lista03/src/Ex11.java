import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contPar = 0;
		int contInpar = 0;
		int num;
		
		for(int k = 1;k<=10;k++) {
			System.out.print("Informe o " + k + "� n�mero: ");
			num = entrada.nextInt();
			if(num % 2 == 0)
				contPar++;
			else
				contInpar++;
		}
		
		System.out.println("Foram informados " + contPar + " n�meros pares e " + contInpar + " n�meros �mpares.");
		
		entrada.close();

	}

}

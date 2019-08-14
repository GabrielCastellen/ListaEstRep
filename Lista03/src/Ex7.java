import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			int troca = num1;
			num1 = num2;
			num2 = troca;
		}
		
		System.out.print(num1);
		for(int i = num1+1;i <= num2; i++) {
			System.out.print(", " + i);
		}
		
		entrada.close();

	}

}

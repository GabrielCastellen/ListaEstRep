import java.util.Scanner;

public class Ex8 {

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
		
		int soma = 0;
		for(int i = num1;i <= num2; i++) {
			soma += i;
		}
		
		System.out.println("Soma: " + soma);
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número da tabuada desejada(1 a 10): ");
		
		int num = entrada.nextInt();
		
		while(num < 1 || num > 10) {
			System.out.print("O número deve estar entre 1 e 10, informe novamente: ");
			num = entrada.nextInt();
		}
		
		for(int i = 1; i<=10;i++) {
			System.out.println(num + " x " + i + " = " + (i*num));
		}
		
		
		entrada.close();

	}

}

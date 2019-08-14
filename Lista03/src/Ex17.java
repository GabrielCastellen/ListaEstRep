import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		while(num<1) {
			System.out.print("Inválido, informe um número inteiro positivo: ");
			num = entrada.nextInt();
		}
		
		boolean primo = true;
		if(num < 4) {
			primo = true;
		}
		else {
			for(int k = 2;k<num;k++) {
				if(num % k == 0)
					primo = false;
			}
		}
		
		if(primo)
			System.out.println("O número é primo.");
		else
			System.out.println("O número não é primo.");
		
		entrada.close();

	}

}

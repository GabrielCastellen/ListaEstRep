import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe até qual numero deseja verificar a quantidade de primos: ");
		int l, k;
		boolean e_primo = false;
		int ateNum = Integer.parseInt(entrada.nextLine());
		int contPrimos = ateNum;
		int contDiv = 0;
		
		if (ateNum <= 1) {
			System.out.println("Nenhum número primo");
		}
		else {
			for(l = 1; l <= ateNum;l++) {
				if(l>=2) {
					if(l == 2)
						contPrimos--;
					else {
						e_primo = false;
						for(k = 2; k< l;k++) {
							contDiv++;
							if(!e_primo) {
								if(l%k == 0) {
									contPrimos--;
									e_primo = true;
								}
							}
						}
					}
				}
			}
			System.out.println("Quantidade de primos: " + contPrimos);
			System.out.println("Foram realizadas " + contDiv + " divisões.");
		}
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = -1;
		
		int cont0a25 = 0;
		int cont26a50 = 0;
		int cont51a75 = 0;
		int cont76a100 = 0;
		
		boolean sair = false;
		while(!sair) {
			System.out.print("Informe um número(digite negativo para sair): ");
			numero = entrada.nextInt();
			if(numero < 0)
				sair = true;
			if(numero >=0 && numero <=25) {
				cont0a25++;
			}else {
				if(numero >=26 && numero <=50) {
					cont26a50++;
				}else {
					if(numero >=51 && numero <=75) {
						cont51a75++;
					}else {
						if(numero >=76 && numero <=100)
							cont76a100++;
					}
				}
			}
		}
		
		System.out.println(cont0a25 + " números estão no intervalo [0-25]");
		System.out.println(cont26a50 + " números estão no intervalo [26-50]");
		System.out.println(cont51a75 + " números estão no intervalo [51-75]");
		System.out.println(cont76a100 + " números estão no intervalo [76-100]");
		
		entrada.close();

	}

}

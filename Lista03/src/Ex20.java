import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas a se fazer a média: ");
		int QNotas = Integer.parseInt(entrada.nextLine());
		int k;
		float soma = 0;
		if(QNotas > 0) {
			for(k=1; k<=QNotas; k++) {
				System.out.print("Informe a " + k + "ª nota: ");
				soma = soma + entrada.nextFloat();
			}
			System.out.println("A média aritmética é " + soma/QNotas);
		}
		else {
			System.out.println("É necessário ter pelo menos uma nota!");
		}
		
		entrada.close();

	}

}

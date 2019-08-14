import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Montar a tabuada de: ");
		int num_tabuada = Integer.parseInt(entrada.nextLine());
		System.out.print("Começar por: ");
		int inicio = Integer.parseInt(entrada.nextLine());
		System.out.print("Terminar em: ");
		int fim = Integer.parseInt(entrada.nextLine());
		
		int k;
		
		if(inicio > fim) {
			for(k = inicio; k>= fim; k--) {
				System.out.println(num_tabuada + " * " + k + " = " + k*num_tabuada);
			}
		}
		else {
			for(k = inicio; k<= fim; k++) {
				System.out.println(num_tabuada + " * " + k + " = " + k*num_tabuada);
			}
		}
		
		entrada.close();

	}

}

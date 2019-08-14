import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma nota entre 0 e 10: ");
		int nota = entrada.nextInt();
		
		while(nota <0 || nota >10) {
			System.out.println("Valor Inválido!!!");
			System.out.print("Informe uma nota entre 0 e 10: ");
			nota = entrada.nextInt();
		}
		
		System.out.println("Nota válida!");
		
		entrada.close();

	}

}

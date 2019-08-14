import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a posição na sequência Fibonacci a ser encontrada: ");
		int num = Integer.parseInt(entrada.nextLine());
		
		int numeroFib = 1;
		int Ultimo =1;
		int Penultimo = 1;
		int contador = 2;
		
		if(num > 2) {
			while(contador < num) {
				numeroFib = Ultimo + Penultimo;
				Penultimo = Ultimo;
				Ultimo = numeroFib;
				contador++;
			}
		}
		
		System.out.println("O número na " + num +"ª posição é " + numeroFib);
		
		entrada.close();
	}

}

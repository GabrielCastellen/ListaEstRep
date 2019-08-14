import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float compra;
		float total;
		int contador;
		
		while(true) {
			
			compra =0;
			total =0;
			contador = 1;
			
			System.out.println("Lojas Tabajara");
			do {
				System.out.print("Produto " + contador + ": R$ ");
				compra = entrada.nextFloat();
				contador++;
				total = total + compra;
			}while(compra != 0);
			System.out.println("Total: R$ " + total);
			System.out.print("Dinheiro: R$ ");
			float dinheiro = entrada.nextFloat();
			while(dinheiro < total) {
				System.out.println("Quantia insuficiente.");
				System.out.print("Dinheiro: ");
				dinheiro = entrada.nextFloat();
			}
			System.out.println("Troco: R$ " + (dinheiro - total));
			System.out.println();
			
		}
		

	}

}

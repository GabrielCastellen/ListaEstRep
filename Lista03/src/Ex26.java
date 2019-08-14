import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float preco;
		
		do{
			System.out.print("Preço do pão: ");
			preco = entrada.nextFloat();
		}while(preco < 0);
		
		int k;
		float valor = (float)preco;
		
		System.out.println("Panificadora pão de ontem - Tabela de preços");
		
		for(k = 1; k<=50; k++) {
			System.out.println(k + " - R$ " + valor);
			valor = valor + (float)preco;
		}
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float preco;
		
		do{
			System.out.print("Pre�o do p�o: ");
			preco = entrada.nextFloat();
		}while(preco < 0);
		
		int k;
		float valor = (float)preco;
		
		System.out.println("Panificadora p�o de ontem - Tabela de pre�os");
		
		for(k = 1; k<=50; k++) {
			System.out.println(k + " - R$ " + valor);
			valor = valor + (float)preco;
		}
		
		entrada.close();

	}

}

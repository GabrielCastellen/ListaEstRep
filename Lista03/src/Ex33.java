import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor da dívida: ");
		float divida = entrada.nextFloat();
		
		float porcJuros =0;
		int parcelas = 1;
		
		System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
		for(int k =1;k<=5;k++) {
			if(k != 1) {
				porcJuros = k*5;
				parcelas = (k-1)*3;
			}
			System.out.print("R$ " + (divida + divida*(porcJuros/100)));
			System.out.print("          " + divida*(porcJuros/100));
			System.out.print("                   " + parcelas);
			System.out.println("                     " + (divida + divida*(porcJuros/100))/parcelas);
		}
		
		entrada.close();

	}

}

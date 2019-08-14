import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int k;
		float precoCD;
		float somaPreco = 0;
		
		System.out.print("Informe a quantidade de CDs: ");
		int quantCD = Integer.parseInt(entrada.nextLine());
		
		while(quantCD < 1) {
			System.out.println("Voc� deve informar pelo menos um valor: ");
			quantCD = entrada.nextInt();
		}
		for(k = 1 ; k<= quantCD; k++) {
			System.out.print("Informe o pre�o do " + k + "� CD: ");
			precoCD = entrada.nextFloat();
			while(precoCD < 0) {
				System.out.println("Valor inv�lido: ");
				precoCD = entrada.nextFloat();
			}
			somaPreco = somaPreco + precoCD;
		}
		
		System.out.println("Valor investido: R$:" + somaPreco);
		System.out.println("Valor m�dio por CD: R$:" +(somaPreco/quantCD));
		
		entrada.close();

	}

}

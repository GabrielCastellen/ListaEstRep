import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do conjunto de números: ");
		int tamanho = Integer.parseInt(entrada.nextLine());
		int k, maior, menor, num;
		int soma = 0;
		menor = 0;
		if (tamanho < 1)
			System.out.println("Número Inválido");
		else {
			if(tamanho == 1)
				System.out.println("Há apenas um número");
			else {
				System.out.print("Informe o 1° número: ");
				maior = Integer.parseInt(entrada.nextLine());
				soma = maior;
				System.out.print("Informe o 2° número: ");
				num = Integer.parseInt(entrada.nextLine());
				soma = soma + num;
				if(num>maior) {
					menor = maior;
					maior = num;
				}
				else {
					menor = num;
				}
				for(k = 3; k<=tamanho; k++) {
					System.out.print("Informe o " + k + "° número: ");
					num = Integer.parseInt(entrada.nextLine());
					soma = soma + num;
					if(num>=maior) {
						maior = num;
					}
					else {
						if(num<menor)
							menor = num;
					}
				}
				System.out.println("Menor valor: " + menor);
				System.out.println("Maior valor: " + maior);
				System.out.println("A soma dos valores é: " + soma);
			}
			
		}
		
		entrada.close();

	}

}

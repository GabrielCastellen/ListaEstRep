import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String codigo;
		int veiculos;
		int acidentes;
		
		String maiorIndiceCidade = " ";
		int maiorIndice = 0;
		String menorIndiceCidade = " ";
		int menorIndice = 0;
		
		int qVeiculos = 0;
		
		int somaAcidentesCidadesPeq = 0;
		int contCidadesPeq = 0;
		
		for(int k=1;k<=5;k++) {
			System.out.print("Informe o código da " + k + "ª cidade: ");
			codigo = entrada.nextLine();
			System.out.print("Informe o número de veículos de passeio (em 1999): ");
			veiculos = entrada.nextInt();
			System.out.print("Informe o número de acidentes de trânsito com vítimas (em 1999): ");
			acidentes = entrada.nextInt();
			qVeiculos += veiculos;
			entrada.nextLine();
			
			if(veiculos < 2000) {
				contCidadesPeq++;
				somaAcidentesCidadesPeq += acidentes;
			}
			
			if(k == 1) {
				maiorIndiceCidade = codigo;
				maiorIndice = acidentes;
				menorIndiceCidade = codigo;
				menorIndice = acidentes;
			}else {
				if(acidentes > maiorIndice) {
					maiorIndiceCidade = codigo;
					maiorIndice = acidentes;
				}else {
					if(acidentes < menorIndice) {
						menorIndiceCidade = codigo;
						menorIndice = acidentes;
					}
				}
			}
		}
		
		int mediaVeiculos = qVeiculos /5;
		int mediaAcidentesCidadesPeq = somaAcidentesCidadesPeq / contCidadesPeq;
		
		System.out.println("Maior índice de acidentes: " + maiorIndice + " da cidade de código " + maiorIndiceCidade);
		System.out.println("Menor índice de acidentes: " + menorIndice + " da cidade de código " + menorIndiceCidade);
		System.out.println("Média de veículos nas cinco cidades juntas: " + mediaVeiculos);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentesCidadesPeq);
	}

}

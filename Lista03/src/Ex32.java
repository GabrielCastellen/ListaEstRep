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
			System.out.print("Informe o c�digo da " + k + "� cidade: ");
			codigo = entrada.nextLine();
			System.out.print("Informe o n�mero de ve�culos de passeio (em 1999): ");
			veiculos = entrada.nextInt();
			System.out.print("Informe o n�mero de acidentes de tr�nsito com v�timas (em 1999): ");
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
		
		System.out.println("Maior �ndice de acidentes: " + maiorIndice + " da cidade de c�digo " + maiorIndiceCidade);
		System.out.println("Menor �ndice de acidentes: " + menorIndice + " da cidade de c�digo " + menorIndiceCidade);
		System.out.println("M�dia de ve�culos nas cinco cidades juntas: " + mediaVeiculos);
		System.out.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos de passeio: " + mediaAcidentesCidadesPeq);
	}

}

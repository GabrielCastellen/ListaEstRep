import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int populacaoA = entrada.nextInt();
		int populacaoB = entrada.nextInt();
		float taxaA = entrada.nextFloat();
		float taxaB = entrada.nextFloat();
		
		int contAnos = 0;
		
		if(populacaoA == populacaoB) {
			System.out.println("Populacoes Iguais");
		}
		else {
			if(populacaoA > populacaoB && taxaA<taxaB) {
				
				while(populacaoA > populacaoB) {
					populacaoA = Math.round(  populacaoA + populacaoA*(taxaA/100));
					populacaoB = Math.round(  populacaoB + populacaoB*(taxaB/100));
					contAnos++;
				}
				System.out.println(contAnos);
			}
			else {
				if(populacaoA < populacaoB && taxaA>taxaB) {
					while(populacaoA < populacaoB) {
						populacaoA = Math.round(  populacaoA + populacaoA*(taxaA/100));
						populacaoB = Math.round(  populacaoB + populacaoB*(taxaB/100));
						contAnos++;
					}
					System.out.println(contAnos);
				}
				else {
					System.out.println("PQP");
				}
			}
		}
		
		
		
		entrada.close();

	}

}

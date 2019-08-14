import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de eleitores: ");
		int num_el = Integer.parseInt(entrada.nextLine());
		while(num_el < 1) {
			System.out.print("É necessário ter pelo menos 1 eleitor: ");
			num_el = Integer.parseInt(entrada.nextLine());
		}
		int voto;
		int cont_Fulano = 0;
		int cont_Ciclano = 0;
		int cont_Beltrano = 0;
		int k;
		for(k = 1; k<=num_el; k++) {
			System.out.println("Você é o eleitor número " + k);
			System.out.println("Os candidatos e seus respectivos códigos são: 24-Fulano, 13-Ciclano, 18-Beltrano");
			System.out.println("Você também pode votar 0 para votar em branco");
			System.out.print("Informe o seu voto: ");
			voto = Integer.parseInt(entrada.nextLine());
			while(voto!= 24 && voto != 13 && voto !=18 && voto !=0) {
				System.out.print("Voto Inválido, digite novamente: ");
				voto = Integer.parseInt(entrada.nextLine());
			}
			if(voto == 24) {
				cont_Fulano++;
				System.out.println("Voto registrado!");
			}
			else {
				if(voto == 13) {
					cont_Ciclano++;
					System.out.println("Voto registrado!");
				}
				else {
					if(voto == 18) {
						cont_Beltrano++;
						System.out.println("Voto registrado!");
					}
					else
						System.out.println("Voto em branco registrado!");
				}
			}
			System.out.println();
		}
		System.out.println("Resultados:");
		System.out.println("Fulano: " + cont_Fulano);
		System.out.println("Ciclano: " + cont_Ciclano);
		System.out.println("Beltrano: " + cont_Beltrano);
		
		entrada.close();

	}

}

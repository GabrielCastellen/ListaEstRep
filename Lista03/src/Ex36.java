import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int voto = 1;
		
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		int nulo = 0;
		int branco = 0;
		
		int totalVotos = 0;
		

		while(voto > 0 && voto <=6) {
			System.out.println("1 - Fulano");
			System.out.println("2 - Ciclano");
			System.out.println("3 - Beltrano");
			System.out.println("4 - Alcione");
			System.out.println("5- Voto Nulo");
			System.out.println("6- Voto em branco");
			System.out.print("Informe seu voto: ");
			voto = entrada.nextInt();
			if(voto > 0 && voto <=6)
				totalVotos++;
			
			if(voto == 1)
				candidato1++;
			else {
				if(voto == 2)
					candidato2++;
				else {
					if(voto == 3)
						candidato3++;
					else {
						if(voto == 4)
							candidato4++;
						else {
							if(voto == 5)
								nulo++;
							else {
								if(voto == 6)
									branco++;
							}
						}
					}
				}
			}
		}
		
		System.out.println("-------Total-------");
		System.out.println("Fulano: " + candidato1);
		System.out.println("Ciclano: " + candidato2);
		System.out.println("Beltrano: " + candidato3);
		System.out.println("Alcione: " + candidato4);
		System.out.println("Votos nulos: " + nulo);
		System.out.println("Em branco: " + branco);
		System.out.println(totalVotos);
		System.out.println("Percentagem nulos: " + (((float)nulo/totalVotos)*100 ) + "%");
		System.out.println("Percentagem Brancos: " + (((float)branco/totalVotos)*100 ) + "%");
		
		entrada.close();

	}

}

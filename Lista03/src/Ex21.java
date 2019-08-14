import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int QuantP = Integer.parseInt(entrada.nextLine());
		
		int k;
		int soma = 0;
		
		if(QuantP > 0) {
			for(k=1; k<=QuantP; k++) {
				System.out.print("Informe a " + k + "ª idade: ");
				soma = soma + entrada.nextInt();
			}
			float media = soma/QuantP;
			if(media <= 25)
				System.out.println("Turma Jovem");
			else {
				if(media > 25 && media <= 60)
					System.out.println("Turma Adulta");
				else
					System.out.println("Turma Idosa");
			}
		}
		else {
			System.out.println("É necessário ter pelo menos uma pessoa!");
		}
		
		entrada.close();

	}

}

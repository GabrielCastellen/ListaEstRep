import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float temperatura;
		float somaTemp =0;
		int contTemp = 1;
		boolean continuar = true;
		
		System.out.print("Informe a " + contTemp + "ª temperatura: ");
		temperatura = entrada.nextFloat();
		System.out.print("Continuar? ");
		continuar = (entrada.next().equals("sim"));
		
		float menor = temperatura;
		float maior = temperatura;
		
		somaTemp = somaTemp + temperatura;
		
		while(continuar) {
			contTemp++;
			System.out.print("Informe a " + contTemp + "ª temperatura: ");
			temperatura = entrada.nextFloat();
			System.out.print("Continuar? ");
			continuar = (entrada.next().equals("sim"));
			if(temperatura >= maior) {
				maior = temperatura;
			}
			else {
				if(temperatura < menor) {
					menor = temperatura;
				}
			}
			somaTemp = somaTemp + temperatura;
		}
		
		System.out.println("Maior temperatura :" + maior);
		System.out.println("Menor temperatura :" + menor);
		System.out.println("Temperatura média: " + somaTemp/contTemp);
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		int base = entrada.nextInt();
		
		System.out.print("Informe o expoente: ");
		int expoente = entrada.nextInt();
		
		int resultado;
		
		if(expoente == 0) {
			resultado = 1;
		}else {
			if(expoente == 1)
				resultado = base;
			else {
				resultado = base;
				for(int i = expoente-1;i>0;i--) {
					resultado = resultado * base;
				}
			}
		}
		
		System.out.println(resultado);
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe n: ");
		int num = Integer.parseInt(entrada.nextLine());
		
		int termo1 = 1;
		int termo2 = 1;
		
		System.out.print("S= ");
		while(termo1 < num) {
			System.out.print(termo1 + "/"+termo2 + " + ");
			termo1++;
			termo2 = termo2 + 2;
		}
		
		System.out.println(termo1 + "/"+termo2);
		
		entrada.close();

	}

}

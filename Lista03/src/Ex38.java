import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		while(num < 0) {
			System.out.print("Informe um valor positivo: ");
			num = entrada.nextInt();
		}
		String numString = Integer.toString(num);
		String numInvertido = Character.toString(numString.charAt(numString.length() -1)) ;
		for(int i = numString.length()-2;i>=0;i--) {
			numInvertido = numInvertido + Character.toString(numString.charAt(i));
		}
		
		System.out.println(numInvertido);
		entrada.close();
		
	}

}

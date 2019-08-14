import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i <20;i++) {
			System.out.println(i+1);
		}
		
		for(int i = 0; i <20;i++) {
			System.out.print(i+1 + "|");
		}
		
		entrada.close();

	}

}

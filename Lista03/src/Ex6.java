import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0;i<=50;i++) {
			if((i+1) % 2 == 0)
				System.out.print(i+1 + ", ");
		}
		
		entrada.close();

	}

}

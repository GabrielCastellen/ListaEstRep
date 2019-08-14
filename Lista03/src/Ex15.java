import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int v = 37;
		int d =1;
		int resultado = 0;
		System.out.print("(" + v +"*" + (v+1) + ")/" + d);
		resultado = resultado +(v*(v+1))/d;
		v--;
		d++;
		while (v>=1) {
			System.out.print(" + (" + v +"*" + (v+1) + ")/" + d);
			resultado = resultado +(v*(v+1))/d;
			v--;
			d++;
		}
		System.out.println(" = " + resultado);
		
		entrada.close();

	}

}

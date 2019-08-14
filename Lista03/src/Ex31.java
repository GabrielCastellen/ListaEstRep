import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int k;
		System.out.print("Número do aluno: ");
		int numAluno = entrada.nextInt();
		System.out.print("Altura do aluno: ");
		int alturaAluno = entrada.nextInt();
		
		int numMaisAlto = numAluno;
		int numMaisBaixo = numAluno;
		int altAlto = alturaAluno;
		int altBaixo = alturaAluno;
		
		for(k = 2; k<=10; k++) {
			System.out.print("Número do aluno: ");
			numAluno = entrada.nextInt();
			System.out.print("Altura do aluno: ");
			alturaAluno = entrada.nextInt();
			if(alturaAluno > altAlto) {
				altAlto = alturaAluno;
				numMaisAlto = numAluno;
			}
			else {
				if(alturaAluno < altBaixo) {
					altBaixo = alturaAluno;
					numMaisBaixo = numAluno;
				}
			}
		}
		System.out.println("Número mais alto: " + numMaisAlto);
		System.out.println("Altura: " + altAlto + "cm");
		System.out.println("Número mais baixo: " + numMaisBaixo);
		System.out.println("Altura: " + altBaixo + "cm");
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de perguntas: ");
		final int QPERGUNTAS = entrada.nextInt();
		entrada.nextLine();
		
		String gabarito[] = new String[QPERGUNTAS];
		for(int i = 0;i<QPERGUNTAS;i++) {
			System.out.print("Informe a "+ (i+1) +"ª resposta do gabarito: ");
			gabarito[i] = entrada.nextLine();
		}
		
		String respostasAluno[] = new String[QPERGUNTAS];
		
		int menorAcerto = QPERGUNTAS+1;
		int maiorAcerto = -1;
		
		int contAlunos = 0;
		int somaNotas = 0;
		
		boolean proxAluno = true;
		while(proxAluno) {
			contAlunos++;
			System.out.println(contAlunos + "° aluno!");
			int nota = 0;
			for(int i = 0;i<QPERGUNTAS;i++) {
				System.out.print("Informe a "+ (i+1) +"ª resposta: ");
				respostasAluno[i] = entrada.nextLine();
				if(gabarito[i].equalsIgnoreCase(respostasAluno[i]))
					nota++;
			}
			if(nota > maiorAcerto)
				maiorAcerto = nota;
			if(nota <menorAcerto)
				menorAcerto = nota;
			somaNotas += nota;
			System.out.print("Há mais alunos a serem avaliados? ");
			proxAluno = "sim".equalsIgnoreCase(entrada.nextLine());
		
		}
		
		System.out.println("Maior Acerto: " + maiorAcerto);
		System.out.println("Menor Acerto: " + menorAcerto);
		System.out.println(contAlunos + " alunos utilizaram o sistema.");
		System.out.println("Media de notas da turma: " + somaNotas/contAlunos);
		
		entrada.close();

	}

}

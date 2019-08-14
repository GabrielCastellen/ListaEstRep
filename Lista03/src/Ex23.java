import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int k,q_alunos;
		int soma = 0;
		System.out.print("Informe a quantidade de turmas: ");
		int quant_turmas = Integer.parseInt(entrada.nextLine());
		while(quant_turmas < 1) {
			System.out.print("Deve ser informado pelo menos uma turma: ");
			quant_turmas = Integer.parseInt(entrada.nextLine());
		}
		for(k = 1; k<= quant_turmas;k++) {
			System.out.print("Informe a quantidade de alunos na " + k + " ª turma: ");
			q_alunos = Integer.parseInt(entrada.nextLine());
			while(q_alunos < 1 || q_alunos > 40) {
				System.out.print("Valor inválido, tente novamente: ");
				q_alunos = Integer.parseInt(entrada.nextLine());
			}
			soma = soma + q_alunos;
		}
		System.out.println("Média de alunos por turma: " + (soma/quant_turmas));
		
		entrada.close();

	}

}

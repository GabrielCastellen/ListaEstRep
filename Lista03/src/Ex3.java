import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = " ";
		do {
			System.out.print("Informe um nome(>3caracteres): ");
			nome = entrada.nextLine();
			if(nome.length() <= 3)
				System.out.println("Nome muito curto!");
		}while(nome.length() <= 3);
		
		int idade = -1;
		do {
			System.out.print("Informe a idade(entre 0 e 150): ");
			idade = entrada.nextInt();
			if(idade < 0 || idade > 150)
				System.out.println("Idade inv�lida");
		}while(idade < 0 || idade > 150);
		
		float salario = 0;
		do {
			System.out.print("Informe o sal�rio: ");
			salario = entrada.nextFloat();
			if(salario <= 0)
				System.out.println("Ningu�m paga pra trabalhar!");
		}while(salario <= 0);
		
		entrada.nextLine();
		
		String sexo = " ";
		do {
			System.out.println("Informe o sexo(F-Feminino, M- Masculino)");
			sexo = entrada.nextLine();
			if(!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo))
				System.out.println("Sexo n�o identificado");
		}while(!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo));
		
		String estadoCivil = " ";
		do {
			System.out.print("Informe seu estado civ�l(s,c,v,d): ");
			estadoCivil = entrada.nextLine();
			if(!"s".equalsIgnoreCase(estadoCivil) && !"c".equalsIgnoreCase(estadoCivil) && !"v".equalsIgnoreCase(estadoCivil) && !"d".equalsIgnoreCase(estadoCivil))
				System.out.println("Favor informar um valor v�lido!");
		}while(!"s".equalsIgnoreCase(estadoCivil) && !"c".equalsIgnoreCase(estadoCivil) && !"v".equalsIgnoreCase(estadoCivil) && !"d".equalsIgnoreCase(estadoCivil));
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: R$" + salario);
		if("f".equalsIgnoreCase(sexo))
			System.out.println("Sexo: Feminino");
		else
			System.out.println("Sexo: Masculino");
		System.out.println("Estado Civil: " + estadoCivil);
		
		entrada.close();

	}

}

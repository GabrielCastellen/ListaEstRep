import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome de usu�rio: ");
		String nome = entrada.nextLine();
		String senha = " ";
		
		do {
			System.out.println("Informe a senha: ");
			senha = entrada.nextLine();
			if(senha.equals(nome))
				System.out.println("A senha n�o pode ser igual ao nome!");
		}while(senha.equals(nome));
			
		System.out.println("Usu�rio registrado!");
		
		entrada.close();

	}

}

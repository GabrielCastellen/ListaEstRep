import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigo;
		float altura;
		float peso;
		int codMaisAlto, codMaisBaixo, codMaisMagro, codMaisGordo;
		float alturaMaisAlto, alturaMaisBaixo, pesoMaisGordo, pesoMaisMagro;
		float somaAlturas = 0;
		float somaPesos = 0;
		int contClientes = 1;
		
		System.out.println("Informe seus dados:");
		System.out.print("Código: ");
		codigo = entrada.nextInt();
		codMaisAlto = codigo;
		codMaisBaixo = codigo;
		codMaisGordo = codigo;
		codMaisMagro = codigo;
		System.out.print("Altura: ");
		altura = entrada.nextFloat();
		
		while(altura <=0) {
			System.out.print("Altura inválida, tente de novo: ");
			altura = entrada.nextFloat();
		}
		
		alturaMaisAlto = altura;
		alturaMaisBaixo = altura;
		somaAlturas = somaAlturas + altura;
		System.out.print("Peso: ");
		peso = entrada.nextFloat();
		
		while(peso <=0) {
			System.out.print("Peso inválido, tente de novo: ");
			peso = entrada.nextFloat();
		}
		
		pesoMaisGordo = peso;
		pesoMaisMagro = peso;
		somaPesos = somaPesos + peso;
		
		while(codigo != 0){
			System.out.println("Informe seus dados:");
			System.out.print("Código: ");
			codigo = entrada.nextInt();
			if(codigo != 0) {
				System.out.print("Altura: ");
				altura = entrada.nextFloat();
				while(altura <=0) {
					System.out.print("Altura inválida, tente de novo: ");
					altura = entrada.nextFloat();
				}
				somaAlturas = somaAlturas + altura;
				System.out.print("Peso: ");
				peso = entrada.nextFloat();
				while(peso <=0) {
					System.out.print("Peso inválido, tente de novo: ");
					peso = entrada.nextFloat();
				}
				somaPesos = somaPesos + peso;
				if(altura >= alturaMaisAlto) {
					alturaMaisAlto = altura;
					codMaisAlto = codigo;
				}
				else {
					if(altura < alturaMaisBaixo) {
						alturaMaisBaixo = altura;
						codMaisBaixo = codigo;
					}
				}
				if(peso >= pesoMaisGordo) {
					pesoMaisGordo = peso;
					codMaisGordo = codigo;
				}
				else {
					if(peso < pesoMaisMagro) {
						pesoMaisMagro = peso;
						codMaisMagro = codigo;
					}
				}
				contClientes++;
			}
		}
		System.out.println("Código do mais alto: " + codMaisAlto);
		System.out.println("Altura: " + alturaMaisAlto);
		System.out.println("Código do mais Baixo: " + codMaisBaixo);
		System.out.println("Altura: " + alturaMaisBaixo);
		System.out.println("Código do mais gordo: " + codMaisGordo);
		System.out.println("Peso: " + pesoMaisGordo + "Kg");
		System.out.println("Código do mais magro: " + codMaisMagro);
		System.out.println("Peso: " + pesoMaisMagro + "Kg");
		System.out.println("Média das alturas: " + somaAlturas/contClientes);
		System.out.println("Média dos pesos: " + somaPesos/contClientes + "Kg");
		
		entrada.close();

	}

}

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qItem1 = 0;
		int qItem2 = 0;
		int qItem3 = 0;
		int qItem4 = 0;
		int qItem5 = 0;
		int qItem6 = 0;
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.print("Informe o código do produto: ");
			int cod = entrada.nextInt();
			System.out.print("Informe a quantidade: ");
			int quant = entrada.nextInt();
			if(cod == 100)
				qItem1 += quant;
			else {
				if(cod == 101)
					qItem2 += quant;
				else {
					if(cod == 102)
						qItem3 += quant;
					else {
						if(cod == 103)
							qItem4 += quant;
						else {
							if(cod == 104)
								qItem5 += quant;
							else {
								if(cod == 105)
									qItem6 += quant;
							}
						}
					}
				}
			}
			entrada.nextLine();
			System.out.print("Deseja finalizar o pedido? ");
			String cont = entrada.nextLine();
			continuar = !("sim".equalsIgnoreCase(cont));
			
		}
		
		float total = 0;
		
		if(qItem1 > 0) {
			System.out.println("Cachorro Quente: R$" + (qItem1*1.20f));
			total += qItem1*1.20f;
		}
		if(qItem2 > 0) {
			System.out.println("Bauru Simples: R$" + (qItem2*1.30f));
			total += qItem2*1.30f;
		}
		if(qItem3 > 0) {
			System.out.println("Bauru com ovo : R$" + (qItem3*1.50f));
			total += qItem3*1.50f;
		}
		if(qItem4 > 0) {
			System.out.println("Hambúrguer : R$" + (qItem4*1.20f));
			total += qItem4*1.20f;
		}
		if(qItem5 > 0) {
			System.out.println("Cheeseburguer: R$" + (qItem5*1.30f));
			total += qItem5*1.30f;
		}
		if(qItem6 > 0) {
			System.out.println("Refrigerante  : R$" + (qItem6*1.00f));
			total += qItem6*1.00f;
		}
		
		System.out.println("Total: R$" + total);
		entrada.close();

	}

}

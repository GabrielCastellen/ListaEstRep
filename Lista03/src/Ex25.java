
public class Ex25 {

	public static void main(String[] args) {
		int k;
		float valor = (float)1.99;
		System.out.println("Lojas Quase dois - Tabela de preços");
		for(k = 1; k<=50; k++) {
			System.out.println(k + " - R$ " + valor);
			valor = valor + (float)1.99;
		}
	}

}
import java.util.Scanner;

public class Exercito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade");
		
		int idade = entrada.nextInt();
		if(idade >= 18) {
			System.out.println("Devera se alistar");
		}else {
			System.out.println("Não devera se alistar");
		}
	}
}

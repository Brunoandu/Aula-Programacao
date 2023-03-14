import java.util.Scanner;

public class Mediatotal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu nome: ");
		String nome= entrada.nextLine();
		
		System.out.println("Digite sua primeira nota :");
        double primeiraNota = entrada.nextDouble();
        System.out.println("Digite sua segunda nota :");
        double segundaNota = entrada.nextDouble();
        double mediaFinal = (primeiraNota + segundaNota) / 2;
        if( mediaFinal >= 7) {
        	System.out.println(nome + "Esta aprovado!");
        }else {
        	System.out.println(nome + "Esta reprovado!");
        }
        }
   }
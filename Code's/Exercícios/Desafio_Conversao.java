
import java.util.Scanner;

public class Desafio_Conversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o Primeiro Salário ");
		String salString1 = entrada.nextLine();
		
		System.out.printf("Digite o Segundo Salário ");
		String salString2 = entrada.nextLine();
		
		System.out.printf("Digite o Terceiro Salário ");
		String salString3 = entrada.nextLine();
		
		entrada.close();
		
		double sal1 = Double.parseDouble(salString1.replace(",", "."));
		double sal2 = Double.parseDouble(salString2.replace(",", "."));
		double sal3 = Double.parseDouble(salString3.replace(",", "."));
		
		double soma = sal1 + sal2 + sal3;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 3);
		
		
	}

}

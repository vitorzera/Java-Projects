import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia! \n\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n \n\n", 
									1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f%n \n\n", 1234.5678);
		
		System.out.printf("Nome: %s%n \n\n", "João");
		
		
		//Scanner entrada = new Scanner (System.in);
		//entrada.nextLine();
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf("Digite seu nome ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Digite sua idade ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
							nome, sobrenome, idade);
		
		entrada.close();
	}

}

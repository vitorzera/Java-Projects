public class Tipo_String {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		System.out.println("\n\n\n");
		
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = "33";
		var salario = 1234.852;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + 
							"\nIdade: " + idade + "\nSalário: " 
								+ salario + "\n\n");
		
		String UmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + 
							"\nIdade: " + idade + "\nSalário: " 
									+ salario + "\n\n";
		System.out.println(UmaFrase);
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f\n", 
							nome, sobrenome, idade, salario);
		
		String OutraFrase = String.format("O Senhor %s %s tem %d anos e ganha R$%.2f\n", 
											nome, sobrenome, idade, salario);
		System.out.println(OutraFrase);
	}
	

}

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 'a';
		
		System.out.println(a == b); // 	==	-> Significa "IGUAL"
		System.out.println(a != b); // 	!=	-> Significa "DIFERENTE"
		System.out.println(a > 6);	// 	>	-> Significa "a é MAIOR QUE"	
		System.out.println(a >= 6);	//	>=	-> Significa "a é MAIOR ou IGUAL"
		System.out.println(a < 8);	//	<	-> Significa "a é MENOR QUE"
		System.out.println(a <= 8);	//	<=	-> Significa "a é MENOR OU IGUAL
		
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("\nEsse aluno tera desconto ? " + temDesconto);
		
	}

}

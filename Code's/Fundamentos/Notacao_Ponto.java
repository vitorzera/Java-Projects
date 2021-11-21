public class Notacao_Ponto {
	public static void main(String[] args) {
		String s = "Bom dia XD"; // cria uma string
		System.out.println(s);
		
		s = s.replace("XD", "Senhor"); // troca "XD" por "Senhor"
		System.out.println(s);
		
		s = s.toUpperCase(); // deixa tudo em caixa alta
		System.out.println(s);
		
		s = s.toLowerCase(); // deixa tudo em caixa baixa
		System.out.println(s);
		
		s = s.concat("!!!"); // adiciona no final do texto "!!!"
		System.out.println(s);
		
		
		// formas de escrever
		String x = "Victor".toUpperCase();
		System.out.println(x);
		
		String y = "Boa tarde cuzao"
					.replace("cuzao", "Verônica")
					.toUpperCase()
					.concat("!!!");
		System.out.println(y);			
		
	}
}

public class Tipos_Primitivos {
	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		byte anos_de_empresa = 25;
		short numero_de_voos = 568;
		int id = 24589;
		long pontos_acumulados = 2_976_234_567L;
		
		// Tipos numéricos reais
		float salario = 8_857.92f;
		double vendas_realizadas = 1_214_247_897;
		
		//Tipos booleanos
		boolean esta_de_ferias = false; // ou true
		
		//Tipos Caractere
		char status = 'A'; // A de ativo ou F de falso
		
		
		//Dias de empresa
		System.out.println("O funcionário trabalha a " + anos_de_empresa * 365 + " na empresa");
		
		//Número de viagens
		System.out.println("O funcionário viajou para " + numero_de_voos / 2 + " lugares a trabalho");
		
		//Comissão	
		System.out.println("O funciorio até hoje recebera uma comissão de " + pontos_acumulados / vendas_realizadas);
		
		//Quanto o funcionario ganha mensal
		System.out.println("O funcionário com id = " + id + "ganha um sálario de " + salario);
		
		//Estado do funcionario
		System.out.println("O funcionário está de férias? " + esta_de_ferias);
		
		//Status do funcionário
		System.out.println("Status do funcionário: " + status);
				
	}

}

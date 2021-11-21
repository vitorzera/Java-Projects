

public class Desafio_Logico {
	public static void main(String[] args) {
		/*
		 * Prova vai ser terça ou quinta, ou msm até nos dois dias
		 * Se a prova ocorrer nos dois dias comprara uma de TV 50p e comprara um sorvete 
		 * Se somente for terça comprara uma TV de 32p e um sorvete
		 * Se somente for quinta comprara uma TV de 32p e um sorvete
		 * Se não ocorrer a prova n comprara a TV nem o sorvete
		*/
		
		boolean prova1 = true;
		boolean prova2 = true;
		
		boolean comprouTV50 = prova1 && prova2;
		boolean comprouTV32 = prova1 ^ prova2;
		boolean comprouSorvete = prova1 || prova2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}

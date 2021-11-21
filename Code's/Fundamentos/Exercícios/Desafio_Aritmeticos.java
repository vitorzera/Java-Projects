

public class Desafio_Aritmeticos {
	public static void main(String[] args) {
		
		/*
		([6 * (3 + 2)]²  - (1 - 5) * (2 - 7)²)³
		     / 3*2                  / 2
		     	        /10³
		*/
		
		var a = 3 * 2;
		var b = (3 + 2) * 6;
		var c = Math.pow(b, 2); // faz a primeira sequencia
		var d = c / a;
		
		var e = ((1 - 5) * (2 - 7)) / 2;
		var f = Math.pow(e, 2); // faz a segunda sequencia
		
		var g = d - f;
		
		var h = Math.pow(g, 3);
		
		var i = 10;
		var j = Math.pow(i, 3);
		
		var k = h / j;
		System.out.println(k);
		
		
	}
}

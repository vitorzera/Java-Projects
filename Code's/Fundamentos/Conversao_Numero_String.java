public class Conversao_Numero_String {
	
	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		// .toString transforma os num inteiros em Strings
		// .length faz a quantidade de quanto caracteres tem na String
		
	}
}

import javax.swing.JOptionPane;

public class Conversao_String_Numero {
	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog( 
				"Digite o Primeiro Número"); // cria um painel para escrita
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o Segundo Número");
		
		System.out.println(valor1 + valor2); // junta as duas strings digitadas acima
		
		double num1 = Double.parseDouble(valor1); // transforma as strings em doubles
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2; // faz uma conta aritmética
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
		
		
	}

}

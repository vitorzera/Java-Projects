import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas!");
            System.out.println("\nQuer sair? ");

            texto = entrada.nextLine();

        } while(!texto.equalsIgnoreCase("por favor"));

        entrada.close();    
    }
}

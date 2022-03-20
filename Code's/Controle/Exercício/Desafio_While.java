import java.util.Scanner;

public class desafio_while {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int quantDeNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantDeNotas++;
            } else if(nota != -1){
                System.out.println("Nota Inválida!");
            }
        }

        // Calculo da média
        double media = total / quantDeNotas;
        System.out.println("Média = " + media);

        entrada.close();
    }
    
}

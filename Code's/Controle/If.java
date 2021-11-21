import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        boolean apr = media <= 10 && media >= 7.0;
        boolean rec = media < 7 && media >= 5.0;
        boolean rep = media < 5 && media >= 0;

        if(apr) {
            System.out.println("O Aluno foi Aprovado! Parabéns!!");
        }

        if(rec) {
            System.out.println("O Aluno está em Recuperação!");
        }

        if(rep){
            System.out.println("O Aluno foi Reprovado!");
        }

        entrada.close();
    }
    
}

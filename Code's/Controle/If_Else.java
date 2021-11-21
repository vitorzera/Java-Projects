import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor p/ saber se é Par ou Ímpar: ");
        int num = entrada.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse Número é Par!");
        }
        else{
            System.out.println("Esse Número é Ímpar!");
        }

        entrada.close();
    }
    
}

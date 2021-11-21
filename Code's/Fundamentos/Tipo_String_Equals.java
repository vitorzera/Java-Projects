import java.util.Scanner;

public class Tipo_String_Equals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1)); // O .equals() vai compara os conteudos de nas string 

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.nextLine();
        System.out.println("2".equals(s2.trim()));  // o .trim() servira para tirar os espaços em branco 
                                                    //  assim nao correndo o risco de digitar um espaço sem querer
        entrada.close();
    }
}


// Para comparar Strings deve ser usado o .equals() nao o "=="

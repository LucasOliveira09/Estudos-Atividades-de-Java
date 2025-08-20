import java.util.Scanner;


public class descobre_idade {
    public static void main(String[] args) {

        int ano, anoNasc, idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Coloque seu ano de nascimento: ");
        anoNasc = input.nextInt();

        System.out.println("Coloque o ano atual: " );
        ano = input.nextInt();

        System.out.println("Sua idade é " + (ano - anoNasc));
    }
}
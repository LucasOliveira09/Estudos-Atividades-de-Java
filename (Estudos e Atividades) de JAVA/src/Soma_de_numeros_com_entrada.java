import java.util.Scanner;


public class Soma_de_numeros_com_entrada {
    public static void main(String[] args) {

    int n1, n2, n3 , total;

    Scanner input = new Scanner(System.in);

    System.out.println("Coloque que o primeiro numero para a soma: ");
    n1 = input.nextInt();

    System.out.println("Coloque que o segundo numero para a soma: ");
        n2 = input.nextInt();

        System.out.println("Coloque que o terceiro numero para a soma: ");
        n3 = input.nextInt();

    System.out.println(n1+n2+n3);


    }
}
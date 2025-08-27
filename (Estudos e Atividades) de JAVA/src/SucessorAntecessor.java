import java.util.Scanner;

public class SucessorAntecessor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();
        int sucessor, antecessor;
        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.println("O sucessor do numero é: " + sucessor);
        System.out.println("O antecessor do numero é: " + antecessor);
    }

}

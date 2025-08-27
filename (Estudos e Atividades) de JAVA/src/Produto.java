import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        int valor = teclado.nextInt();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = teclado.nextInt();


        int total = valor * quantidade;

        System.out.println("O valor total é:  " + total);


    }


}
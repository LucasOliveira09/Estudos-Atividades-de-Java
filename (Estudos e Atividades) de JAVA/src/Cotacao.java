import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args){
        double numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextDouble();

        System.out.println("O numero divido por 2 é: " + numero / 2 );

    }
}

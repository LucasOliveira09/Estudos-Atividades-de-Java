import java.util.Scanner;

public class ValorRealDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double valorReal = input.nextDouble();

        System.out.println("Digite o valor do Dolar: ");
        double valorDolar = input.nextDouble();

        System.out.println("O valor em dolar é: " + (valorDolar * valorReal));
    }
}

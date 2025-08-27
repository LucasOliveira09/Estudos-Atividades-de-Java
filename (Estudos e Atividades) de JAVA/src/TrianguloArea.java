import java.util.Scanner;

public class TrianguloArea {
    public static void main(String[] args) {

        double base, altura, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a Altura do Triangulo: ");
        altura = input.nextDouble();

        System.out.print("Digite a Base: ");
        base = input.nextDouble();

        total = (base * altura) / 2;

        System.out.println("A area total é: " + total);
    }
}

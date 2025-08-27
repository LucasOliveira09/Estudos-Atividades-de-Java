import java.util.Scanner;

public class SalarioHora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as horas trabalhadas: ");
        int horasTrabalhadas = teclado.nextInt();
        System.out.println("Informe os valor das horas trabalhadas: ");
        int valorHoras = teclado.nextInt();
        System.out.println("Informe o valor do imposto das horas trabalhadas: ");
        int valorImposto = teclado.nextInt();

        int salario = (horasTrabalhadas * valorHoras) - valorImposto;
        System.out.println("Seu salario é de: R$ " + salario);


    }
}

import java.util.Scanner;

import java.util.Scanner;


public class Salarios_media {
    public static void main(String[] args) {

        int func1, func2, func3;

        Scanner input = new Scanner(System.in);

        System.out.println("Coloque que o primeiro numero para a soma: ");
        func1 = input.nextInt();

        System.out.println("Coloque que o segundo numero para a soma: ");
        func2 = input.nextInt();

        System.out.println("Coloque que o terceiro numero para a soma: ");
        func3 = input.nextInt();

        System.out.println((func1+func2+func3) / 2);


    }
}
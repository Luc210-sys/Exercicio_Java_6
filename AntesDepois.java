// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class AntesDepois {
    public static void main (String[] args) {
        int num;
        int ant;
        int suc;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número inteiro desejado: ");
        num = input.nextInt();
        ant = num - 1;
        suc = num + 1;

        System.out.println("O numero antecessor ao digitado eh: " + ant + " e o numero sucessor eh: " + suc);
    }
}

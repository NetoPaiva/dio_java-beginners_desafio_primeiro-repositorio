package aulas;

import java.util.Scanner;


public class DigitaComparaNumero {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("teste 1\n");

        int x;
        int y;

        System.out.println("digite um númenro inteiro e pressione enter: ");
        x=in.nextInt();

        System.out.println("digite outro númenro inteiro e pressione enter: ");
        y= in.nextInt();

        if (x == y)
            System.out.println("São iguais!");
        else if (x != y)
            System.out.println("Não são iguais!");

    }
}
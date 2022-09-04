package Ex5;

import java.util.Scanner;

public class mainCalculadoraEx5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual tabuada vc deseja saber? ");
        int x = entrada.nextInt();

        calculadora calc = new calculadora(x);

        calc.tabuada();

        entrada.close();
    }
}
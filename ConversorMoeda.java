package Ex9;

import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float cambio = 0;
        float valor = 0;

        while (true) {
            
            System.out.println("""

                    1 - Atualizar Cambio
                    2 - Calcular valor em reais 
                    """);
            int opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nQual o valor do dólar? ");
                    cambio = ent.nextFloat(); 
                    break;
                case 2:
                    System.out.print("\nQuantos dólares serão comprados? ");
                    valor = ent.nextFloat();

                    ConversorMoeda.valorCambio(valor, cambio);
                    break;
            }
            ent.close();
        }
    }

    public static void valorCambio(float valor, float cambio) {
        if (cambio == 0){System.out.println("\nAtualize o cambio do dólar!"); }

        if (cambio != 0) {
            valor = valor * (cambio * 6 / 100 + cambio);
            System.out.printf("\nFuncionário: Valor a ser pago em reais = %.2f", valor);
        }
    }
}
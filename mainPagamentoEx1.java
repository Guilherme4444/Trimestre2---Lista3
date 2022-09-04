package Ex1;

import java.util.Scanner;

public class mainPagamentoEx1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        float valorHora = entrada.nextFloat();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        FuncionarioEx1 p = new FuncionarioEx1(nome, valorHora, horasTrabalhadas);

        p.pagamento();

        entrada.close();
    }
}
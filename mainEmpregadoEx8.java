package Ex8;

import java.util.Scanner;

public class mainEmpregadoEx8 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Salário Bruto: ");
        double salarioBruto = scan.nextDouble();
        System.out.print("Imposto: ");
        double imposto = scan.nextDouble();


        empregado emp = new empregado(nome, salarioBruto, imposto);
        
        System.out.printf("Funcionário: %s, salário liquido: %.2f", emp.getNome(), emp.buscasSalarioLiquido());

        System.out.print("\nQual a porcentagem para aumentar o salario? ");
        double porcentagem = scan.nextDouble();

        emp.aumentarSalario(porcentagem);

        System.out.printf("Dados atualizados: %s, R$ %.2f", emp.getNome(), emp.buscasSalarioLiquido());

        scan.close();
    }
}
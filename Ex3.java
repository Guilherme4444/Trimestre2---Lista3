import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome:");
        String n1 = entrada.nextLine();
        System.out.println("Idade:");
        int idade1 = entrada.nextInt();
        System.out.println("Dados da segunda pessoa: ");
        System.out.println("Nome:");
        entrada.nextLine();
        String n2 = entrada.nextLine();
        System.out.println("Idade:");
        int idade2 = entrada.nextInt();

        float mediaIdade = (idade1+idade2);
        float media2 = mediaIdade/2;

        System.out.println("A idade média de " + n1 + " e " + n2 + " é de " + media2 + " anos.");
    }
    
}
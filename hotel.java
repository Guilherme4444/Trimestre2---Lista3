package Ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ex10.SupClass.Animal;
import Ex10.SubClass.*;

public class hotelPet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> listaA = new ArrayList<>();

        String nome = "";
        String raca = "";

        int opcao = 0;
        do {
            System.out.println("""
                
                1 - Check-in
                2 - Check-out
                0 - Sair""");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome: ");
                    nome = scan.nextLine();

                    boolean tryRaca = false;

                    do {
                        System.out.print("Raça (cão/gato): ");
                        raca = scan.nextLine(); 

                        if (raca.equals("cão") || raca.equals("cao")) {
                            Cachorro obj = new Cachorro(nome);
                            System.out.println(obj.late());
                            listaA.add(obj);
                            tryRaca = true;

                        } else if (raca.equals("gato")) {
                            Gato obj = new Gato(nome);
                            System.out.println(obj.mia());
                            listaA.add(obj);
                            tryRaca = true;

                        } else {
                            System.out.println("Digite uma raça válida.\n");
                        }    
                    } while (!tryRaca); 
                    break;

                case 2:
                    System.out.print("\nDigite o nome do animal: ");
                    nome = scan.nextLine();

                    boolean encontrado = false;

                    for (Animal is : listaA) {
                        if (is != null && is.getNome().equals(nome)) {
                            System.out.printf("\nAté mais %s, volte sempre!", is.getNome());
                            listaA.remove(is);
                            if (listaA.size() == 0) {
                                break;
                            }
                            
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scan.close();
    }
}
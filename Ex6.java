import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int senhaC = 2002;

        boolean i = true;
        while(i==true){
            System.out.println("Digite a senha: ");
            int senha = entrada.nextInt();

            if(senha!=senhaC){
                System.out.println("Senha Inválida!");
            }else if(senha==senhaC){
                System.out.println("Acesso permitido!");
                i = false;
            
            }


        }
    }
    
}
import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        boolean t = true;
        int x;
        int y;

        while (t == true){

            System.out.println("Digite dois números: ");
            x = e.nextInt();
            y = e.nextInt();

            if(x > y){
                System.out.println("Decrescente");
            }else if(x<y){
                System.out.println("Crescente");
            }else if(x==y){
                t = false;
            }
        }
    
    e.close();
    }
}
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite a medida da glicose:");
        float medidaGlicose = entrada.nextFloat();

        if(medidaGlicose<=100){
            System.out.println("Classificacao: normal");
        }else if(medidaGlicose==100||medidaGlicose<=140){
            System.out.println("Classificacao: elevado");
        }else if(medidaGlicose>140){
            System.out.println("Classificacao: diabetes");
        }
    }
    
}
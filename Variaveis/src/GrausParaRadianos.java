import java.util.Scanner;

public class GrausParaRadianos {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = sc.nextDouble();
        
        double anguloRadianos = Math.toRadians(anguloGraus);

        System.out.println("O ângulo em radianos é: " + anguloRadianos);

        sc.close();
    }
}

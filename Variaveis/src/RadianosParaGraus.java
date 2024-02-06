import java.util.Scanner;

public class RadianosParaGraus {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ângulo em radianos: ");
        double anguloRadianos = sc.nextDouble();

        double anguloGraus = Math.toDegrees(anguloRadianos);

        System.out.println("O ângulo em graus é: " + anguloGraus);

        sc.close();
    }
}

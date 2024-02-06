import java.util.Scanner;

public class MilhasParaQuilometros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a distância em milhas: ");

        double distanciaMilhas = sc.nextDouble();

        double distanciaQuilometros = distanciaMilhas * 1.60934;

        System.out.println("A distância em quilômetros é: " + distanciaQuilometros);

        sc.close();
    }
}

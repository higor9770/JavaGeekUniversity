import java.util.Scanner;

public class QuilometrosParaMilhas {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");

        double distanciaQuilometros = sc.nextDouble();

        double distanciaMilhas = distanciaQuilometros / 1.60934;

        System.out.println("A distância em milhas é: " + distanciaMilhas);

        sc.close();
    }
}

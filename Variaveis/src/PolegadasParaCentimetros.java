import java.util.Scanner;

public class PolegadasParaCentimetros {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double medidaPolegadas = sc.nextDouble();

        double medidaCentimetros = medidaPolegadas * 2.54;

        System.out.println("A medida em centímetros é: " + medidaCentimetros);

        sc.close();
    }
}

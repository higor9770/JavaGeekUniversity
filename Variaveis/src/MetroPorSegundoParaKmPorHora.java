import java.util.Scanner;

public class MetroPorSegundoParaKmPorHora {

	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);

		 	System.out.print("Digite a velocidade em metros por segundo: ");

	        double velocidadeMetrosPorSegundo = sc.nextDouble();

	        double velocidadeKmPorHora = velocidadeMetrosPorSegundo * 3.6;

	        System.out.println("A velocidade em quilômetros por hora é: " + velocidadeKmPorHora);

	        sc.close();

	}

}

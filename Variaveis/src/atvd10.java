import java.util.Scanner;


public class atvd10 {

	public static void main(String[] args) {
		// Ler a velocidade em Km/h e apresentar em m/s
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Digite a velocidade em km/h: ");

	     double velocidadeKmPorHora = sc.nextDouble();

	     double velocidadeMetrosPorSegundo = velocidadeKmPorHora / 3.6;

	     System.out.println("A velocidade em metros por segundo é: " + velocidadeMetrosPorSegundo);

	     sc.close();

	}

}

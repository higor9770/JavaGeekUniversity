import java.util.Scanner;

public class atvd09 {

	public static void main(String[] args) {
		// ler a temperatura em celsius e apresentar em kelvin
		
		Scanner sc = new Scanner(System.in);

        System.out.print("temperatura em Celsius: ");

        double temperaturaCelsius = sc.nextDouble();

        double temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("A temperatura em Kelvin é: " + temperaturaKelvin);

        sc.close();

	}

}

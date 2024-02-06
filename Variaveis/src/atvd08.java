import java.util.Scanner;

public class atvd08 {

	public static void main(String[] args) {
		
		//ler a temperatura em kelvin e apresentar em celsius

        Scanner sc = new Scanner(System.in);

        System.out.print("temperatura em Kelvin: ");

        double temperaturaKelvin = sc.nextDouble();

        double temperaturaCelsius = temperaturaKelvin - 273.15;

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        sc.close();
 }
}
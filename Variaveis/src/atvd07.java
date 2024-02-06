import java.util.Scanner;

public class atvd07 {

	public static void main(String[] args) {
		
		// ler a temperatura em fahrenheit e aprensentar em celsius

		Scanner sc = new Scanner(System.in);

        System.out.print("temperatura em farenheit: ");

        double temperaturaFahrenheit = sc.nextDouble();

        double temperaturaCelsius = 5 * (temperaturaFahrenheit - 32) / 9;

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        sc.close();

 }
}
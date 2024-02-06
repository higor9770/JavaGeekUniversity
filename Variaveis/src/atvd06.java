import java.util.Scanner;

public class atvd06 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("temperatura em Celsius: ");

        double temperaturaCelsius = sc.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        sc.close();

 }
}
import java.util.Scanner;

public class ConversaoRealParaDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorReal = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        double QuantidadeDeDolares = valorReal / cotacaoDolar;

        System.out.println("O valor correspondente em dólares é: " + QuantidadeDeDolares);

        scanner.close();
    }
}

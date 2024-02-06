import java.util.Scanner;

public class LitrosParaMetrosCubicos {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o volume em litros: ");

        double volumeLitros = sc.nextDouble();

        double volumeMetrosCubicos = volumeLitros / 1000;

        System.out.println("O volume em metros cúbicos é: " + volumeMetrosCubicos);

        sc.close();
    }
}

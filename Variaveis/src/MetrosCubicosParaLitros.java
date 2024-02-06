import java.util.Scanner;

public class MetrosCubicosParaLitros {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o volume em metros cúbicos: ");
        double volumeMetrosCubicos = sc.nextDouble();

        double volumeLitros = volumeMetrosCubicos * 1000;

        System.out.println("O volume em litros é: " + volumeLitros);

        sc.close();
    }
}

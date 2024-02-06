import java.util.Scanner;

public class atvd04 {

	public static void main(String[] args) {
		// imprimir o quadrado do número
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		
		float quadrado = num1 * num1;
		
		System.out.print("O quadrado é: " + quadrado);
		
	}

}

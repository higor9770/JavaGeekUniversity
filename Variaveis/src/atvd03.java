import java.util.Scanner;

public class atvd03 {

	public static void main(String[] args) {
		
		//soma de valores inteiros

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		System.out.print("Digite o segundo número: ");
		float num2 = sc.nextFloat();
		System.out.print("Digite o terceiro número: ");
		float num3 = sc.nextFloat();
		
		float soma = num1 + num2 + num3;
		
		

		System.out.print("A soma é: " + soma);
		
	}

}
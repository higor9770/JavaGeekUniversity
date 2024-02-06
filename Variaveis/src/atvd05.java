import java.util.Scanner;

public class atvd05 {

	public static void main(String[] args) {
		// imprimindo as parte desse número
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		float num1 = sc.nextFloat();
		
		float segundaParte = num1 / 2;
		float tercaParte = num1 / 3;
		float quartaParte = num1 / 4;
		float quintaParte = num1 / 5;
		
		System.out.println("A segunda parte: " + segundaParte);
		System.out.println("A terca parte: " + tercaParte);
		System.out.println("A quarta parte: " + quartaParte);
		System.out.println("A quinta parte: " + quintaParte);
	
	}

}

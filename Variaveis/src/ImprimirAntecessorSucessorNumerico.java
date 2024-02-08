import java.util.Scanner;

public class ImprimirAntecessorSucessorNumerico {

	public static void main(String[] args) {
		
		// ler um número inteiro e imprimir seu sucessor e antecessor
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int SucessorNumber = number + 1;
        int PredecessorNumber = number - 1;
        
        System.out.print("Sucessor: " + SucessorNumber + "\nPredecessor: " + PredecessorNumber);


	}

}

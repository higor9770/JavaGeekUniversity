import java.util.Scanner;

public class QuadradosDosValores {

	public static void main(String[] args) {
		
		// ler 4 valores e imprimir a soma dos quadrados desses números
		
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, num4;
        
        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        num3 = sc.nextDouble();
        
        System.out.print("Digite o quarto valor: ");
        num4 = sc.nextDouble();

        System.out.print("\n Primeiro número: " + num1 + 
        		"\nSegundo número: " + num2 + 
        		"\nTerceiro número: " + num3 +
        		"\nQuarto número: " + num4 );
        
        double Quadrado = num1 * num1 + num2 * num2 + num3 * num3 + num4 * num4 ;
        
        System.out.print("\nA soma dos quadrados dos 3 valores: " + Quadrado);

        
    
	}

}

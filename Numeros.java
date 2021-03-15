/**
 * 
 */
package basico;
import java.util.Scanner;
/**
 * @author dngom
 *
 */
public class Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		
		System.out.print("Coloque o Primeiro Número: ");
		num1 = input.nextInt();
		
		System.out.print("Coloque o Segundo Número: ");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("A soma é %d%n", sum);
	}

}
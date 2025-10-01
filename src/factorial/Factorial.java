package factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Introduce el numero: ");
		int N = input.nextInt();
		int factorial = 1;
		for (int i=2;i<=N;i++ ) {
			factorial *=i;
		}
		System.out.print("Resultado: "+factorial);
	}

}

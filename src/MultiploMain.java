import java.util.Scanner;

public class MultiploMain {

	public static void main(String[] args) {
		System.out.println("Digite um Numero: ");
		Scanner in = new Scanner(System.in);

		Multiplo multiplo = new Multiplo();
        multiplo.setNumero(in.nextInt());

	    System.out.println("Dos multiplos de 3 e 5 abaixo de " + multiplo.getNumero() + ", a soma é  " + CalculoMultiplo.CalculaMultiplo(multiplo));
	}
}

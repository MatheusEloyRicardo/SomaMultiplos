import java.util.Scanner;

public class CalculoMultiplo {

	/**
	 * Realiza o Calculo de Multiplos
	 * @param multiplo
	 * @return
	 */
	public static int CalculaMultiplo(Multiplo multiplo) {
		int resultado = 0;

		int x = 3;
	    int z = 5;
	    int somax = 0;
	    int somaz = 0; 

	    for(int i = 1; i < multiplo.getNumero(); i++) {
	        if(i % x == 0) {
	            somax += i;
	        }
	    }

	    for(int i = 1; i < multiplo.getNumero(); i++) {
	        if(i % z == 0) {
	            somaz += i;
	        }
	    }

	    resultado = somax + somaz;

		return resultado;
	}

}

package ue.lenguajesdeprogramacion.ejuno;
import java.util.Scanner;
import java.util.Random;

/**
 * Vector utils es mi clase de herramientas que permitiran desarrollar el punto.
 * @author The Young Knight
 *
 */

public class VectorUtils {
 	
	private Scanner c_Medina;

	/**
	 * El metodo entradaUsu_Medina toma la entrada del usuario; la cual debe ser entera, la almacena
	 * y la retorna.
	 * @return
	 */
	
	public int  entradaUsu_Medina() {
		System.out.println("Ingrese su valor entero de entrada!");
		c_Medina = new Scanner(System.in);
		int capv_Medina = c_Medina.nextInt();
		
	return capv_Medina;
		
	}
	
	/**
	 * El metodo contenidoRan_Medina permite invocar un número del 0 al 9 de manera aleatoria y retornarlo como entero.
	 * @return
	 */
	public int contenidoRan_Medina () {
		
		Random random_Medina = new Random();
		int ranNume=random_Medina.nextInt(9);
		
	return ranNume;
	}
}

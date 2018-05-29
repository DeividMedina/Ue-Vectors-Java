package ue.lenguajesdeprogramacion.ejuno;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;
/**
 * PROGRAMA QUE GENERA UN ALGORITMO QUE CREE UN VECTOR DE LONGITUD N DONDE N LO DEFINE EL USUARIO CALCULA NUMERO MAYOR Y MENOR
 * @author The Young Knight
 *
 */
public class OrquestadorVecEjUno_Medina {
	
	/**
	 * OrquestadorVecEjUno_Medina toma un numero que se captura con un metodo el cual se encuentra en la clase VectorUtils
	 * Indica este numero tomado como la capacidad del vector
	 * Se rellena el vector con valores aleatorios
	 * Se organiza el vector de modo ascendente segun sus valores de contenido
	 * se indica como menor la primera posicion y como mayor la ultima
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int collector_Medina,randomizer_Medina,position_Medina;
			VectorUtils vUtils = new VectorUtils();
			
			collector_Medina=vUtils.entradaUsu_Medina();
			int vector[]= new int [collector_Medina];
			for ( position_Medina = 0; position_Medina < vector.length; position_Medina++) {
				randomizer_Medina= vUtils.contenidoRan_Medina();
				vector[position_Medina]=randomizer_Medina;
			}
			Arrays.sort(vector);
			for ( position_Medina = 0; position_Medina < vector.length; position_Medina++) {
				System.out.println("Posicion:["+position_Medina+"] - Contenido:"+vector[position_Medina]);
			}
			System.out.println("Numero mayor del vector");
			System.out.println("Este: "+vector[0]);
			System.out.println("Numero menor del vector");
			System.out.println("Este: "+vector[collector_Medina-1]);
		} catch (Exception e) {
			System.out.println("No se pudo ejecutar la operacion"+e);
		}
		
	}
}

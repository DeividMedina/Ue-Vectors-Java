package ue.lenguajesdeprogramacaion.ejedos;
/**
 * Orquestador de metodos para el desarrollo del segundo punto.
 * @author The Young Knight
 *
 */
public class OrquestadorVecEjDos_Medina {
	/**
	 * clase principal que genera un vector el cual se rellena con 15 valores aleatorios.
	 * Los valores aleatorios provienen de un metodo en la clase VectoresUtils.
	 * Seguido de ello se ordenan de modo ascendente con metodo sort y descendentemente con metodo burbuja
	 * el cual permite generar un comparador entre posiciones y orientar la organización del contenido.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			VectoresUtils vUtils = new VectoresUtils();
			int randomizer_Medina,position_Medina;
			int[] order_Medina;
			int vector_Medina[] = new int[15];
			for (position_Medina = 0; position_Medina < vector_Medina.length; position_Medina++) {
				randomizer_Medina= vUtils.contenidoRan_Medina();
				vector_Medina[position_Medina]=randomizer_Medina;
			}
			order_Medina= vUtils.burbujeMethod_Medina(vector_Medina);
			for (int printer = 0; printer < order_Medina.length; printer++) {
				System.out.println("Possicion: "+printer+" - Contenido: "+order_Medina[printer]);
			}
		} catch (Exception e) {
			System.out.println("No se pudo ejecutar la operacion");
		}
		
	}
}

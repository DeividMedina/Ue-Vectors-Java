package ue.lenguajesdeprogramacion.ejtres;

import java.util.Arrays;
import java.util.Scanner;

public class VectorUtils {
	
	/**
	 * Metodo capNumEnt_Medina, encargado de capturar los 20 números requeridos.
	 */
	public int[] numEntra_Medina() {
		Scanner sc = new Scanner(System.in);
		
		int vector_Medina[]=new int[20];
		for (int i = 0; i < vector_Medina.length; i++) {
			System.out.println("Ingrese su numero: "+i);
			vector_Medina[i]=sc.nextInt();
		}
		return vector_Medina;
	}
	
	/**
	 * El metodo nMaximo organiza ascendentemente el vector y teniendo en cuenta el limite, por tiempos y optimización se evalua la ultima posicion como la mayor.
	 * @param vectorOrganizado
	 * @return
	 */
	public int nMaximo_Medina (int[] vectorOrganizado) {
		Arrays.sort(vectorOrganizado);
		int nMax=vectorOrganizado[19];
		System.out.println("El numero maximo del arreglo es: "+nMax);
		return nMax;
	}
}

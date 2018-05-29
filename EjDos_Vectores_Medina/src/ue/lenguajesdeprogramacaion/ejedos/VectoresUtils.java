package ue.lenguajesdeprogramacaion.ejedos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class VectoresUtils {

	/**
	 * El metodo contenidoRan_Medina permite invocar un número del 0 al 9 de manera aleatoria y retornarlo como entero.
	 * @return
	 */
	public int contenidoRan_Medina () {
		
		Random random_Medina = new Random();
		int ranNume=random_Medina.nextInt(9);
		
	return ranNume;
	}
	/**
	 * Metodo burbujeMethod_Medina permite organizar descendentemente el contenido de un arreglo que se encuentra ordenado de manera ascendente
	 */
	public int[] burbujeMethod_Medina(int[] vecUnorder_Medina) {
		 Arrays.sort(vecUnorder_Medina);
		 int i, j, aux;
         for(i=0;i<vecUnorder_Medina.length-1;i++)
              for(j=0;j<vecUnorder_Medina.length-i-1;j++)
                   if(vecUnorder_Medina[j+1]>vecUnorder_Medina[j]){
                      aux=vecUnorder_Medina[j+1];
                      vecUnorder_Medina[j+1]=vecUnorder_Medina[j];
                      vecUnorder_Medina[j]=aux;
                   }
		return vecUnorder_Medina;
	}
}

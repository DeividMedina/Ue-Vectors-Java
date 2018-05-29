package ue.lenguajesdeprogramacion.ejcuatro;

import java.util.Arrays;
import java.util.Random;

public class VectorUtils {
	
	public int[] vectInitial_Medina(){
		
		int basicVect_Medina[]=new int[16];
		for (int i = 0; i < basicVect_Medina.length; i++) {
			Random random_Medina = new Random();
			int ranNume=random_Medina.nextInt(9);
			basicVect_Medina[i]=ranNume;
		}
		Arrays.sort(basicVect_Medina);
		return basicVect_Medina;
	}
	public int[] vOne_Medina(int[] vecInitial_Medina) {
		int partitionOneVector_Medina[]= new int [8];
		for (int i = 0; i < vecInitial_Medina.length/2; i++) {
			partitionOneVector_Medina[i]=vecInitial_Medina[i];
		}
		return partitionOneVector_Medina;
	}
	
	public int[] vTwo_Medina(int[] vecInitial_Medina) {
		int count=8;
		int partitionTwoVector_Medina[]= new int [8];
		for (int i = 0; i < partitionTwoVector_Medina.length; i++) {
			partitionTwoVector_Medina[i]=vecInitial_Medina[count];
			count=count+1;
		}
		return partitionTwoVector_Medina;
	}
}

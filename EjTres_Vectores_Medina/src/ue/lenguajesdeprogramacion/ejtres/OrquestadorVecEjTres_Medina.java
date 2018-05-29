package ue.lenguajesdeprogramacion.ejtres;

import java.util.Arrays;
import java.util.Scanner;

public class OrquestadorVecEjTres_Medina {
	public static void main(String[] args) {
		try {
			VectorUtils vUtils= new VectorUtils();
			int vectorlleno_medina[];
			System.out.println("Bienvenido, los numeros que debe ingresar deben ser 20 enteros, ingrese sus numeros y presione enter sucesivamente");
			vectorlleno_medina= vUtils.numEntra_Medina();
			int nMaximo=vUtils.nMaximo_Medina(vectorlleno_medina);
			for (int i = 0; i < vectorlleno_medina.length; i++) {
			System.out.println("Posición: "+i+" - Contenido: "+vectorlleno_medina[i]);
			}
		} catch (Exception e) {
			System.out.println("No se pudo ejecutar la operacion");
		}
	}
}

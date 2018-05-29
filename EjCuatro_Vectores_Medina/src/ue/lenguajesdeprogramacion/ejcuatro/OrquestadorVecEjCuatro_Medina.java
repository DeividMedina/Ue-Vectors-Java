package ue.lenguajesdeprogramacion.ejcuatro;

public class OrquestadorVecEjCuatro_Medina {
	
	public static void main(String[] args) {
	try {
		int vector_Medina[]=null;
		int vectortwo_Medina[]=null;
		VectorUtils vUtils = new VectorUtils();
		vector_Medina=vUtils.vectInitial_Medina();
		System.out.println("El vector generado es: ");
		for (int i = 0; i < vector_Medina.length; i++) {
			System.out.println("Posicion: ["+i+"] - "+"Contenido: "+vector_Medina[i]);
		}
		vector_Medina=vUtils.vOne_Medina(vector_Medina);
		System.out.println("Primer vector dividido: ");
		for (int i = 0; i < vector_Medina.length; i++) {
			System.out.println("Posicion: ["+i+"] - "+"Contenido: "+vector_Medina[i]);
		}
		vector_Medina=vUtils.vTwo_Medina(vector_Medina);
		System.out.println("Segundo vector dividido: ");
		for (int i = 0; i < vector_Medina.length; i++) {
			System.out.println("Posicion: ["+i+"] - "+"Contenido: "+vector_Medina[i]);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}

	}
}

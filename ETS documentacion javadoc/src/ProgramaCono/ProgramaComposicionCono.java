package ProgramaCono;

public class ProgramaComposicionCono {

	/**
	 * Esta clase genera un cono con numeros aleatorios
	 * @author Usuario
	 * @param imprimir este metodo coge la informacion de los atributos de los objetos circulo y cono y los imprime en pantalla
	 */
	
	public static void imprimir(Object datos) {
		System.out.println(datos);
	}
	
	/**
		 * @param main Este programa genera un radio aleatorio de un cono a traves de un bucle for,ademas, llama a los atributos de los objetos y lo muestra por pantalla
         *   
		 */
	
	public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}

		
		
		
		
	}

}

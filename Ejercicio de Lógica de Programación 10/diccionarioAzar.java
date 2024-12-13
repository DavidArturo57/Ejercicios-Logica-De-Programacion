package Ejercicio_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class diccionarioAzar {

	public static void main(String[] args) {
		// utiliza hashmap para el diccionario
		HashMap<String, String> dicc = new HashMap();

		// guarda las 20 palabras ingles-español
		dicc.put("gato", "cat");
		dicc.put("pollo", "chicken");
		dicc.put("aguila", "eagle");
		dicc.put("arana", "spider");
		dicc.put("ardilla", "squirell");

		dicc.put("ballena", "whale");
		dicc.put("buho", "owl");
		dicc.put("caballo", "horse");
		dicc.put("camello", "camel");
		dicc.put("cisne", "swan");

		dicc.put("jirafa", "giraffe");
		dicc.put("lagarto", "lizard");
		dicc.put("mariposa", "butterfly");
		dicc.put("oso", "bear");
		dicc.put("pajaro", "bird");

		dicc.put("pantera", "panther");
		dicc.put("pez", "fish");
		dicc.put("pinguino", "penguin");
		dicc.put("pulpo", "octopus");
		dicc.put("rana", "frog");
		
		//realiza 5 palabras al azar
		List<String>palabra_esp = new ArrayList<>(dicc.keySet());
		Collections.shuffle(palabra_esp);
		List<String>palabra_selec = palabra_esp.subList(0, 5);
	    //contadores respuestas correctas y incorrectas
		int correcto= 0;
		int incorrecto= 0;
		
		// utiliza scanner para recibir entrada usuario
		Scanner sc = new Scanner(System.in);

		
		for(String ingles: palabra_selec) {
			System.out.println("Se traduce: "+ ingles );
			System.out.println("Ingresa las siguiente palabra al ingles:");
			String resp = sc.nextLine().toLowerCase();
			
			if(resp.equals(dicc.get(ingles))) {
				System.out.println("Estas en lo correcto");
				correcto++;
			}else {
				System.out.println("No es correcto. La traduccion es: " + dicc.get(ingles));
				incorrecto++;
			}
		}
		
		//Imprime resultados
		System.out.println("Correctas son: " + correcto);
		System.out.println("Incorrectas son: " + incorrecto);
		
		sc.close();

	}

}

package Ejercicio_9;

import java.util.HashMap;
import java.util.Scanner;

public class diccionarioEspañoIngles {

	public static void main(String[] args) {
		//utiliza hashmap para el diccionario
		HashMap<String, String> dicc = new HashMap();
		
		//guarda las 20 palabras ingles-español
		dicc.put("gato","cat");
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
		
		//utiliza scanner para recibir entrada usuario
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa palabra en español:");
		String español = sc.nextLine().toLowerCase();
		
		//ciclo if ver si esta la palabra ingresada
		if(dicc.containsKey(español)) {
			System.out.println("Traduccion: "+ español + " es: " + dicc.get(español));
		}else {
			System.out.println("Palabra no existe diccionario");
		}
		
		sc.close();
	}

}

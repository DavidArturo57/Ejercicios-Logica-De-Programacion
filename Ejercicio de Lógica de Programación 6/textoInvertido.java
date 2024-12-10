import java.util.Scanner;

public class textoInvertido {

	public static void main(String[] args) {
		//usa un scanner para la entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Ingresar usuario palabra o frase
		System.out.println("Introduce frase o palabra:");
		String text = sc.nextLine();
		
		//Realiza el invertir el texto introducido
		String text_invertido = invertir_text(text);
		
		//Imprime el resultado
		System.out.println("El texto invetido es: " + text_invertido);
		
		//Finaliza el scanner
		sc.close();
		
		
	}
	
	//Metodo para inversion del texto
	public static String invertir_text(String text) {
		StringBuilder text_invertido = new StringBuilder(text);
		return text_invertido.reverse().toString();  
	}

}

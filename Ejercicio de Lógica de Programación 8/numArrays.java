package Ejercicio_8;

import java.util.Scanner;

public class numArrays {

	public static void main(String[] args) {
		//Realiza scanner para entrada del usuario
		Scanner sc = new Scanner(System.in);
		int num [] = new int [10];
		int resul [] = new int [10];
		
		//ciclo for Ingrese 10 numeros al usuario
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingrese el numero "+(i+1) +":");
			num[i] = sc.nextInt();
		}
		
		//Saber si es primo o no
		int ind_primo = 0;
		int ind_noprimo = 0;
		
		int noprimo[] = new int [10];
		
		for(int numero: num) {
			if(primo(numero)) {
				resul[ind_primo++] = numero;
			}else {
				noprimo[ind_noprimo++] = numero;
			}
		}
		
		for(int i = 0; i < ind_noprimo; i++) {
			resul[ind_primo++] = noprimo[i];
		}
		
		//imprime resultado
		for(int i = 0; i < 10; i++) {
			System.out.println("pos["+ i +"] = " + resul[i]);
		}
		
		sc.close();
	}
	
	//Verifica el numero primo
	public static boolean primo(int numero) {
		if(numero <=1) {
			return false;
		}
		
		for (int i = 2; i<= Math.sqrt(numero); i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}

package clases;

import java.util.Scanner;

public class main {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		String apellido;
		int edad = 0;
		String hobbie;
		String editor;
		String SO;

		boolean error = false;

		System.out.println("Bienvenido a la actividad práctica de <Codo a Codo/>");

		System.out.println("Ingrese su nombre");
		nombre = ingresarString();

		System.out.println("Ingrese su apellido");
		apellido = ingresarString();

		do {
			try {
				System.out.println("Ingrese su edad");
				edad = ingresarEdad();
				error = false;
			} catch (Exception numero) {
				System.out.println(numero.getMessage());
				error = true;
			}

		} while (error);

		System.out.println("Ingrese su hobbie");
		hobbie = ingresarString();

		System.out.println("Ingrese su editor de código favorito");
		editor = ingresarString();

		System.out.println("Ingrese su Sistema Operativo");
		SO = ingresarString();

		System.out.println("");
		System.out.println("");

		System.out.println("*****************************************");

		System.out.println("Su nombre: " + nombre);
		System.out.println("Su apellido: " + apellido);
		System.out.println("Su edad: " + edad);
		System.out.println("Su hobbie: " + hobbie);
		System.out.println("Su IDE favorito: " + editor);
		System.out.println("Su SO: " + SO);

		System.out.println("*****************************************");
	}

	private static int ingresarEdad() throws Exception {
		int edad = 0;
		final int EDAD_MIN = 0;
		final int EDAD_MAX = 120;

		try {
			edad = Integer.parseInt(input.nextLine());

			if (EDAD_MIN >= edad || EDAD_MAX < edad) {
				throw new Exception();
			}

		} catch (NumberFormatException e) {
			throw new Exception("Por favor, ingrese un número");
		}

		catch (Exception e) {
			throw new Exception("Por favor, ingrese un número entre 1 y 120");
		}

		return edad;

	}

	private static String ingresarString() {
		String retorno;

		retorno = input.nextLine();

		while (retorno.isBlank()) {
			System.out.println("El dato no puede ser nulo. Ingrese un valor");
			retorno = input.nextLine();
		}

		return retorno;
	}

}

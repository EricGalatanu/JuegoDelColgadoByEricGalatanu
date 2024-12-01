package ColgadoGame;

import java.util.Scanner;

public class ColgadoByEricGalatanu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);

		String respReglas;
		String respJugadores;
		String respJugador1;
		String respJugador2;
		String respJugador3;
		String respJugador4;
		String palabraOriginal = "";
		String palabraOcultada;
		int intentosMax = 6;
		int intentosActuales;
		int rondas;
		int rondasJugadas = 0;
		int puntajeJugador1 = 0;
		int puntajeJugador2 = 0;
		
		// Reglas
		System.out.println("¿Quieres saber las reglas?");
		respReglas = s.next();

		if (respReglas.equalsIgnoreCase("Si")) {
			System.out.println("Reglas del juego:\r\n" + "\r\n"
					+ "El juego comienza pidiendo al administrador (un jugador) que elija una palabra secreta, la cual debe ser oculta durante el juego.\r\n"
					+ "Cada jugador tiene que adivinar una letra de la palabra secreta en cada ronda.\r\n"
					+ "El número máximo de intentos por jugador es 6.\r\n"
					+ "Si un jugador adivina correctamente una letra, esta se revela en su posición en la palabra secreta.\r\n"
					+ "Si un jugador se queda sin intentos, pierde la ronda.\r\n"
					+ "El jugador que adivine toda la palabra primero o quien gane más rondas será el ganador.\r\n"
					+ "IMPORTANTE, El juego esta pensado para jugar entre 2-4 personas, no más!");
			System.out.println();
			System.out.println("Ahora que ya sabes las reglas, empecemos con el juego.");
		} else if (respReglas.equalsIgnoreCase("No")) {
			System.out.println("Vale entonces empecemos con el juego");
		} else {
			System.out.println("Esta opción no está entre las disponibles. Entonces empezamos con el juego");
		}

		// Número de jugadores
		System.out.println("");
		System.out.println("¿Cuántos jugadores queréis jugar?");
		respJugadores = s.next();

		if (respJugadores.equalsIgnoreCase("Dos") || respJugadores.equals("2")) {

			System.out.println("Jugador 1, como te quieres llamr: ");
			respJugador1 = s.next();
			System.out.println("Jugador 2, como te quieres llamr: ");
			respJugador2 = s.next();
			System.out.println();
			System.out.println(respJugador1 + " eres el administrador");
			System.out.println(respJugador2 + " tienes que adivinar la palabra");
		
			// Numero de rondas
				System.out.println("¿Cuántas rondas quieres jugar?");
				rondas = s.nextInt();
				
				while (rondasJugadas < rondas) {
					System.out.println("Ronda " + (rondasJugadas + 1));

			
					System.out.println(respJugador1 + ", elige la palabra que " + respJugador2 + " tiene que adivinar:");
					palabraOriginal = s.next().toLowerCase();

				
					palabraOcultada = "_ ".repeat(palabraOriginal.length());
					System.out.println(respJugador2 + " la palabra que tienes que adivinar es: " + palabraOcultada);

					intentosActuales = intentosMax;

					while (intentosActuales > 0 && palabraOcultada.contains("_")) {
						System.out.println("Intentos: " + intentosActuales);
						System.out.print(respJugador2 + ", adivina una letra: ");
						String letra = s.next().toLowerCase();

						if (palabraOriginal.contains(letra)) {

							String nuevaPalabraOcultada = "";
							for (int i = 0; i < palabraOriginal.length(); i++) {
								if (palabraOriginal.charAt(i) == letra.charAt(0)) {
									nuevaPalabraOcultada += letra + " ";
								} else {
									nuevaPalabraOcultada += palabraOcultada.charAt(i * 2) + " ";
								}
							}
							palabraOcultada = nuevaPalabraOcultada;
							System.out.println("Letra correcta");
							System.out.println();
						} else {
							intentosActuales--;
							System.out.println("Letra incorrecta.");
							System.out.println();
						}

						System.out.println("Palabra: " + palabraOcultada);
					}
				
					// Resultado
					if (!palabraOcultada.contains("_")) {
						System.out.println("Felicidades, " + respJugador2 + " has adivinado la palabra: " + palabraOriginal);
						puntajeJugador2++;
					} else {
						System.out.println("Lo siento " + respJugador2 + " no has adivinado la palabra: " + palabraOriginal);
						puntajeJugador1++;
					}

					rondasJugadas++;
					System.out.println();
				}

				// Puntos
				System.out.println("Fin del juego. El puntaje final es:");
				System.out.println(respJugador1 + ": " + puntajeJugador1 + " puntos.");
				System.out.println(respJugador2 + ": " + puntajeJugador2 + " puntos.");

				if (puntajeJugador1 > puntajeJugador2) {
					System.out.println("Felicidades, " + respJugador1 + " has ganado");
				} else if (puntajeJugador2 > puntajeJugador1) {
					System.out.println("Felicidades, " + respJugador2 + " has ganado");
				} else {
					System.out.println("El juego terminó en empate.");
				}
			}

		if (respJugadores.equalsIgnoreCase("Tres") || respJugadores.equals("3")) {

			System.out.println("Jugador 1, como te quieres llamr: ");
			respJugador1 = s.next();
			System.out.println("Jugador 2, como te quieres llamr: ");
			respJugador2 = s.next();
			System.out.println("Jugador 3, como te quieres llamr: ");
			respJugador3 = s.next();
			System.out.println();
			System.out.println(respJugador1 + " eres el administrador");
			System.out.println(respJugador2 + " tienes que adivinar la palabra");
			System.out.println(respJugador3 + " tienes que adivinar la palabra");
		
			// Numero de rondas
				System.out.println("¿Cuántas rondas quieres jugar?");
				rondas = s.nextInt();
				
		}
		
		if (respJugadores.equalsIgnoreCase("Cuatro") || respJugadores.equals("4")) {

			System.out.println("Jugador 1, como te quieres llamr: ");
			respJugador1 = s.next();
			System.out.println("Jugador 2, como te quieres llamr: ");
			respJugador2 = s.next();
			System.out.println("Jugador 3, como te quieres llamr: ");
			respJugador3 = s.next();
			System.out.println("Jugador 4, como te quieres llamr: ");
			respJugador4 = s.next();
			System.out.println();
			System.out.println(respJugador1 + " eres el administrador");
			System.out.println(respJugador2 + " tienes que adivinar la palabra");
			System.out.println(respJugador3 + " tienes que adivinar la palabra");
			System.out.println(respJugador4 + " tienes que adivinar la palabra");
			// Numero de rondas
				System.out.println("¿Cuántas rondas quieres jugar?");
				rondas = s.nextInt();
				
		}
		
		else {
			System.out.println("No esta pensado para jugar asi");
		}
	}

}

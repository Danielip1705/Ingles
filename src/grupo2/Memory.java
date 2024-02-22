package grupo2;

import java.util.Random;

public class Memory {
	/***
	 * Tamaño del tablero para el array bidimensional
	 */
	public static final int N = 6;

	/***
	 * Objeto Random
	 */
	public static Random rand = new Random();

	/**
	 * Funcion que devuelve el tablero a jugar
	 * 
	 * @param N
	 * @return
	 */
	public static int[][] crearTablero(int N) {

		int[][] tablero = new int[N][N];

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = rand.nextInt(1, (N * N / 2) + 1);
			}
		}

		return tablero;

	}

}

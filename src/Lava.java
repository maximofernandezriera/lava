import java.util.ArrayList;

public class Lava {
    int encontrarPasos(boolean[][] tablero, Coordenada inicio, Coordenada fin) {

        // Inicializamos una matriz de visitados
        boolean[][] visitados = new boolean[tablero.length][tablero[0].length];

        // Crear una un ArrayList a modo de cola (como si de una cola del supermercado se tratara)
        ArrayList<Coordenada> cola = new ArrayList<>();

        // Añadimos el inicio a la "cola" y marcar como visitado
        cola.add(inicio);
        visitados[inicio.fila][inicio.columna] = true;

        // Pasos y arrays para tratar los movimientos

        int pasos = 0;

        //el índice 0 representa un movimiento hacia arriba en el tablero
        //el índice 1 representa un movimiento hacia abajo en el tablero
        //el índice 2 representa un movimiento hacia la izquierda en el tablero
        //y el índice 3 representa un movimiento hacia la derecha en el tablero

        int[] movFila = {-1, 1, 0, 0};
        int[] movColumna = {0, 0, -1, 1};

        // Bucle mientras el arrayList (la cola a partir de ahora) no esté vacío
        while (!cola.isEmpty()) {
            // Procesaremos los elementos de la "cola" uno por uno
            int tamano = cola.size();

            for (int i = 0; i < tamano; i++) {
                // Eliminamos el primer elemento de la "cola" para ir tratando
                Coordenada actual = cola.remove(0);

                // Si hemos llegado al final, retornamos el contador de pasos
                if (actual.fila == fin.fila && actual.columna == fin.columna) {
                    return pasos;
                }

                // Revisamos todas las direcciones posibles, aquí está el grosso del ejercicio
                for (int direccion = 0; direccion < 4; direccion++) {
                    //  Vamos sumando el movimiento correspondiente a la dirección actual a la posición actual
                    //  para obtener la nueva posición a tratar.
                    int nuevaFila = actual.fila + movFila[direccion];
                    int nuevaColumna = actual.columna + movColumna[direccion];

                    // Si la nueva posición es válida y no ha sido visitada, la añadimos a la "cola"
                    if (nuevaFila >= 0 && nuevaFila < tablero.length && nuevaColumna >= 0 && nuevaColumna < tablero[0].length && !tablero[nuevaFila][nuevaColumna] && !visitados[nuevaFila][nuevaColumna]) {
                        visitados[nuevaFila][nuevaColumna] = true;
                        cola.add(new Coordenada(nuevaFila, nuevaColumna));
                    }
                }
            }
            pasos++;
        }

        // Si no es posible llegar, retornamos -1
        return -1;
    }

}

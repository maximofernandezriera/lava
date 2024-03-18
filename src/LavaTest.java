import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LavaTest {
    @Test
    public void testEncontrarMinimoDePasos() {
        Lava lava = new Lava();
        boolean[][] tablero = new boolean[][]{
                {false, false, false, false},
                {false, false, false, false},
                {true, true, false, true},
                {false, false, false, false}
        };
        Coordenada inicio = new Coordenada(3, 0);
        Coordenada fin = new Coordenada(0, 0);

        int resultado = lava.encontrarPasos(tablero, inicio, fin);

        assertEquals(7, resultado);
    }
}
## Método: encontrarPasos(tablero, inicio, fin) 

### Parámetros de entrada:

- **tablero**: matriz bidimensional de booleanos que representa el tablero
- **inicio**: coordenada de inicio
- **fin**: coordenada de destino
- Pueden ser una **clase Coordenada**.

### Salida (return):

- **número de pasos** para llegar de inicio a fin, o -1 si no es posible

### Algoritmo encontrarPasos:

1. **Verificaciones iniciales:**
   - Si el tablero está vacío o las coordenadas no son válidas, retornamos -1.
2. **Inicializar:**
   - Crear una matriz de visitados del mismo tamaño que el tablero y marcar todas las casillas como no visitadas.
   - Crear una estructura de datos (array o ArrayList) cuyo comportamiento sea similar a una cola. La ponemos a 0.
3. Añadimos la coordenada de inicio a la cola y lo marcamos como visitado.
4. **Mientras la cola no esté vacía:**
   - Procesar elementos:
     - Obtener el tamaño actual de la cola.
     - Recorrer la cola desde el principio hasta el tamaño actual:
       - Sacar el primer elemento de la cola.
       - Si la coordenada actual es la coordenada de destino, retornar el número de pasos.
       - Explorar las cuatro direcciones adyacentes:
         - Si la nueva posición es válida, no está visitada y no está bloqueada en el tablero:
           - Marcar la nueva posición como visitada.
           - Añadir la nueva coordenada a la cola.
   - Incrementar el número de pasos.
5. Si no se ha encontrado un camino, retornar -1.

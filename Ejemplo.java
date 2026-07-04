static void main() {
    int cantidad;
    int[] arreglo;

    IO.println("Bienvenid@ al algoritmo de ordenamiento por unión");
    IO.println("¿Cuántos números desea ingresar?");
    cantidad = Integer.parseInt(IO.readln());
    arreglo = new int[cantidad];

    for (int i = 0; i < cantidad; i++) {
        IO.println("Ingrese un número");
        arreglo[i] = Integer.parseInt(IO.readln());
    }

    mergeSort(arreglo, 0, arreglo.length - 1);

    IO.println("Su arreglo ordenado:");
    for (int n : arreglo) {
        IO.print(n + " ");
    }
}

static void mergeSort(int[] arreglo, int inicio, int fin) {
    if (inicio < fin) {
        int medio = (inicio + fin) / 2;
        mergeSort(arreglo, inicio, medio);
        mergeSort(arreglo, medio + 1, fin);
        merge(arreglo, inicio, medio, fin);
    }
}

static void merge(int[] arreglo, int inicio, int medio, int fin) {
    int tamañoIzquierda = medio - inicio + 1;
    int tamañoDerecha = fin - medio;

    int[] izquierda = new int[tamañoIzquierda];
    int[] derecha = new int[tamañoDerecha];

    for (int i = 0; i < tamañoIzquierda; i++) {
        izquierda[i] = arreglo[inicio + i];
    }
    for (int j = 0; j < tamañoDerecha; j++) {
        derecha[j] = arreglo[medio + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = inicio;

    while (i < tamañoIzquierda && j < tamañoDerecha) {
        if (izquierda[i] <= derecha[j]) {
            arreglo[k] = izquierda[i];
            i++;
        } else {
            arreglo[k] = derecha[j];
            j++;
        }
        k++;
    }

    while (i < tamañoIzquierda) {
        arreglo[k] = izquierda[i];
        i++;
        k++;
    }

    while (j < tamañoDerecha) {
        arreglo[k] = derecha[j];
        j++;
        k++;
    }
}
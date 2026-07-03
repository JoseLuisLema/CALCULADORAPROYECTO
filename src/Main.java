void main() {
    IO.println("-".repeat(40));
    IO.println("CALCULADORA EN PUCE");
    IO.println("-".repeat(40));

    int opcion = 0;
    String texto;
    int numero1, numero2, resultado;

    while (opcion != 5) {

        IO.println("\nMENU");
        IO.println("1. Sumar");
        IO.println("2. Restar");
        IO.println("3. Multiplicar");
        IO.println("4. Dividir");
        IO.println("5. Salir");

        texto = IO.readln("Seleccione una opción: ");
        opcion = Integer.parseInt(texto);
    }
}

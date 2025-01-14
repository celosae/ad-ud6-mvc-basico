package app.vistas;

import app.core.Router;

import java.util.Scanner;

public class VistaConsolaRouter {
    private final Router router;

    public VistaConsolaRouter(Router router) {
        this.router = router;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal con Router ===");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Listar Jugadores");
            System.out.println("3. Agregar Videojuego");
            System.out.println("4. Listar Videojuegos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1 -> agregarJugador(scanner);
                case 2 -> listarJugadores();
                case 3 -> agregarVideojuego(scanner);
                case 4 -> listarVideojuegos();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private void agregarJugador(Scanner scanner) {
        System.out.print("Ingrese nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese nivel del jugador: ");
        int nivel = scanner.nextInt();
        System.out.print("Ingrese puntuación del jugador: ");
        int puntuacion = scanner.nextInt();

        router.ejecutarAccion("jugadores", "agregarJugador", nombre, nivel, puntuacion);
    }

    private void listarJugadores() {
        router.ejecutarAccion("jugadores", "listarJugadores");
    }

    private void agregarVideojuego(Scanner scanner) {
        System.out.print("Ingrese título del videojuego: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese género del videojuego: ");
        String genero = scanner.nextLine();
        System.out.print("Ingrese precio del videojuego: ");
        double precio = scanner.nextDouble();

        router.ejecutarAccion("videojuegos", "agregarVideojuego", titulo, genero, precio);
    }

    private void listarVideojuegos() {
        router.ejecutarAccion("videojuegos", "listarVideojuegos");
    }
}


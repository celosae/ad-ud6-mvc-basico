package app.vistas;

import app.controladores.JugadorControlador;
import app.controladores.VideoJuegoControlador;

import java.util.Scanner;

public class VistaConsola {
    private final JugadorControlador jugadorControlador;
    private final VideoJuegoControlador videojuegoControlador;

    public VistaConsola(JugadorControlador jugadorControlador, VideoJuegoControlador videojuegoControlador) {
        this.jugadorControlador = jugadorControlador;
        this.videojuegoControlador = videojuegoControlador;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
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
        jugadorControlador.agregarJugador(nombre, nivel, puntuacion);
    }

    private void listarJugadores() {
        jugadorControlador.listarJugadores().forEach(System.out::println);
    }

    private void agregarVideojuego(Scanner scanner) {
        System.out.print("Ingrese título del videojuego: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese género del videojuego: ");
        String genero = scanner.nextLine();
        System.out.print("Ingrese precio del videojuego: ");
        double precio = scanner.nextDouble();
        videojuegoControlador.agregarVideojuego(titulo, genero, precio);
    }

    private void listarVideojuegos() {
        videojuegoControlador.listarVideojuegos().forEach(System.out::println);
    }
}
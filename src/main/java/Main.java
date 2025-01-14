import app.controladores.JugadorControlador;
import app.controladores.VideoJuegoControlador;
import app.vistas.VistaConsola;

public class Main {
    public static void main(String[] args) {
        JugadorControlador jugadorControlador = new JugadorControlador();
        VideoJuegoControlador videojuegoControlador = new VideoJuegoControlador();

        VistaConsola vista = new VistaConsola(jugadorControlador, videojuegoControlador);
        vista.mostrarMenu();
    }
}

package app.modelos;

public class VideoJuego {
    private int id;
    private String titulo;
    private String genero;
    private double precio;

    public VideoJuego() {}

    public VideoJuego(int id, String titulo, String genero, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }
}

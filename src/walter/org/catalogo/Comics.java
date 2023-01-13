package walter.org.catalogo;

public class Comics extends Libro {
    private final String personaje;

    public Comics(int precio, String autor, String titulo, String editorial, String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.85;
    }
}

package walter.org.catalogo;

public abstract class Producto implements IProduct {
    private final int precio;

    Producto(int precio) {
        this.precio = precio;
    }
    @Override
    public int getPrecio() {

        return this.precio;
    }



}

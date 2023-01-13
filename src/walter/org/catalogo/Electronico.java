package walter.org.catalogo;

public abstract class Electronico extends Producto implements IElectronico {
    private final String fabricante;

    Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }
    @Override
    public String getFabricante() {
        return this.fabricante;
    }




}

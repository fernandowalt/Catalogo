package walter.org.catalogo;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(String fabricante, int precio, int pulgadas) {
        super(fabricante, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.8;
    }

    public int getPulgadas() {
        return this.pulgadas;
    }


}

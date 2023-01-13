package walter.org.catalogo;

public class IPhone extends Electronico {
    private final String modelo;
    private final String color;

    public IPhone(String fabricante, int precio, String modelo, String color) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;

    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }
}

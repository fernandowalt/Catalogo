import walter.org.catalogo.*;

import java.util.Arrays;
import java.util.Date;

public class ProyectoCatalogo {

    public static void main(String[] args) {
        IProduct[] productos = new Producto[6];

        productos[0] = new IPhone("Apple", 299000, "3G", "Negro");
        productos[1] = new IPhone("Apple", 399000, "4G", "Blanco");
        productos[2] = new TvLcd("Sony", 340000, 40);
        productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        productos[5] = new Comics(5000, "Pepo", "Condorito", "Alguna...", "Condorito");

        for (IProduct producto : productos) {

            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos  ============
            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                // Para los IPhone ============
                if (producto instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) producto).getColor());
                }

                // Para los LCD  ============
                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                }
            }

            // Para los Libros  ============
            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                // Para los Comics  ============
                if (producto instanceof Comics) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje());
                }

            }
        }





    }


}

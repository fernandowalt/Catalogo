package walter.org.catalogo;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();

    String getAutor();

    String getTitulo();

    String getEditorial();

}
package Challenge.LiterAlura.dto;

import Challenge.LiterAlura.modelos.Autor;

public record LibroDto(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {
}

package queMePongo;


public class TipoPrenda {
        Categoria categoria;

        public TipoPrenda(Categoria unaCategoria){
            categoria = unaCategoria;
        }

        public Categoria getCategoria() {
            return categoria;
        }
}

enum  Categoria{
    SUPERIOR,
    INFERIOR,
    CALZADO,
    ACCESORIO
}
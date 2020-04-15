public class Atuendo {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;
    Prenda accesorio;

    Atuendo(Prenda prendaSuperior,Prenda prendaInferior, Prenda calzado,Prenda accesorio){
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
        this.accesorio = accesorio;
    }
}

class Prenda {


    TipoPrenda tipoPrenda;
    String material;
    String colorPrincipal;
    String colorSecundario;

    /**Como usuarie de QuéMePongo,
     *  quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).
     *  quiero poder indicar de qué tela o material está hecha una prenda
     *  quiero poder indicar un color principal para mis prendas
     *
     *  quiero evitar que haya prendas sin tipo, tela, categoría o color primario
     *
     */
    Prenda(TipoPrenda unTipo, String unMaterial, String unColor){
        tipoPrenda = unTipo;
        material = unMaterial;
        colorPrincipal = unColor;
    }

    /**Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.*/
    void setColorSecundario(String unColor){
        colorSecundario = unColor;
    }

    /**Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).
     * */
    String getCategoria(){
        return tipoPrenda.categoria.getCategoria();
    }


}

class TipoPrenda {
    Categoria categoria;

    /**Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo.
     * (Ej, una remera no puede ser calzado).
     * Como usuario determino la categoria del tipo de prenda
     * */
    TipoPrenda(Categoria unaCategoria){
        categoria = unaCategoria;
    }
}

/**Uso el patrón “Template method” para la definición de categorías. Una prenda no cambia de categoría (un zapato categorizado como calzado no puede pasar a ser pantalón). Entonces defino una clase padre desde donde las subclases deben definir, en ésta interación, la clase getCategoria()
 */

abstract class Categoria {
    abstract String getCategoria();
}

class Superior extends Categoria{

    String getCategoria(){
        return "Superior";
    }
}
class Inferior extends Categoria{

    String getCategoria(){
        return "Inferior";
    }
}

class Calzado extends Categoria{

    String getCategoria(){
        return "Calzado";
    }
}
class Accesorio extends Categoria{

    String getCategoria(){
        return "Accesorio";
    }
}

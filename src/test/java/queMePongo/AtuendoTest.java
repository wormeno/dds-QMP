package queMePongo;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AtuendoTest {
    private Atuendo atuendo;
    private TipoPrenda zapato = new TipoPrenda(Categoria.CALZADO);
    private TipoPrenda camisaMangaLarga = new TipoPrenda(Categoria.SUPERIOR);
    private TipoPrenda pantalon = new TipoPrenda(Categoria.INFERIOR);
    private TipoPrenda gorro = new TipoPrenda(Categoria.ACCESORIO);

    private Color rojo = new Color(15,25,85);
    private Color blanco = new Color(10,25,85);
    private Prenda zapatoBlanco;
    private Prenda pantalonBlanco;
    private Prenda camisaBlancaRayada;
    private Prenda gorroBlanco;

    private Prenda prendaInferior;
    private Prenda accesorio;



    @Before
    public void init() {
        zapatoBlanco = new Prenda(zapato,Material.CUERO,blanco,null ,Trama.LISO);
        zapatoBlanco = new Prenda(pantalon,Material.TELA,blanco,null ,Trama.LISO);
        camisaBlancaRayada = new Prenda(camisaMangaLarga,Material.TELA,blanco,null ,Trama.RAYADO);
        gorroBlanco = new Prenda(gorro,Material.TELA,blanco,null ,Trama.LISO);
    }

    @Test
    public void temperaturaBuenosAires() {
      //  Assert.assertEquals(20.0,clima.getTemperatura(),0);
    }

}

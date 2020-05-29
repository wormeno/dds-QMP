package queMePongo;

import java.lang.Object;


public class Borrador {

    TipoPrenda tipo;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama = Trama.LISO;

    Borrador(TipoPrenda unTipo){
        if (  unTipo == null ){
            throw new BorradorException("Debe indicar el tipo de prenda");
        }
    }

    void especificarMaterial(Material unMaterial){
        if (  unMaterial == null ){
            throw new BorradorException("Debe indicar material");
        }
        this.validarMaterialConsistenteConTipoDePrenda(unMaterial);
    }

    void especificarColorPrimario(Color unColor){
        if (  unColor == null ){
            throw new BorradorException("Debe indicar el color primario de la prenda");
        }

    }

    void especificarColorSecundario(Color unColor){
        this.colorSecundario = unColor;
    }
    void especificarTrama(Trama unaTrama){
        if (  unaTrama != null ){
            trama = unaTrama;
        }

    }

    Prenda crearPrenda(){
        return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama);
    }

    void validarMaterialConsistenteConTipoDePrenda(Material material){

    }

}

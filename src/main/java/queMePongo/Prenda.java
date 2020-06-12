package queMePongo;

import java.util.List;


public class Prenda
{
    double precioBase,descuentoBase;
    Color colorPrimario;
    Color colorSecundario;
    TipoPrenda tipoPrenda;
    Material material;
    Trama trama;
    Estado estado;
    double temperaturaMaximaAdecuada;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    Prenda( TipoPrenda unTipo, Material unMaterial,Color unColor,Color unColorSecundario,Trama trama){
        this.tipoPrenda =unTipo;
        this.colorPrimario = unColor;
        this.material = unMaterial;
        this.trama = trama;
        this.colorSecundario = unColorSecundario;
    }

    public void setEstado(Estado unEstado){
        estado = unEstado;
    }

    public double precio(){
        return estado.precio(precioBase, descuentoBase);
    }

    void setTemperaturaMaximaAdecuada(double temperatura){
        temperaturaMaximaAdecuada = temperatura;
    }

    double getTemperaturaMaximaAdecuada(){
        return temperaturaMaximaAdecuada;
    }



}

interface Estado {

    public double precio(double precioBase, double descuento);

}

class nuevo implements Estado {

   public double precio(double precioBase, double descuento){
        return precioBase;
    }

}

class promocion implements Estado {

    public double precio(double precioBase, double descuento){
        return precioBase - descuento;
    }
}

class liquidacion implements Estado {

    public double precio(double precioBase, double descuento){
        return precioBase - precioBase*0.5;
    }
}

enum Material {
    TELA,
    CUERO,
    CUERINA
}

enum Trama{
    LISO,
    RAYADO,
    CON_LUNARES,
    A_CUADROS,
    ESTAMPADO
}

class Color {
    int colorR;
    int colorG;
    int colorB;
    Color(int colorR, int colorG, int colorB){
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }
}






/**
 *“Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta.
 Las ventas pueden ser en efectivo o con tarjeta. En el caso que sea con tarjeta, tienen el mismo comportamiento que en efectivo (el cual no modifica el precio), solo que se le aplica un recargo según la cantidad de cuotas seleccionadas (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”
*/
class Item {
    int cantidad;
    Prenda prenda;
    Item(Prenda unaPrenda, int unaCantidad){
        prenda = unaPrenda;
        cantidad = unaCantidad;
    }

    public double importe(){
        return prenda.precio() * cantidad;
    }
}
abstract class Venta {
    java.util.Date fechaVenta;
    List<Item> items;

    public void addItem(Item unItem){
        items.add(unItem);
    }
    public double precioVenta(){

     /*  return conRecargo( items.stream()
               .mapToDouble(item -> item.importe())
               .sum() );*/
       return conRecargo(25.2);
    }

    abstract double conRecargo(double importeBase);
}

class ventaEfectivo extends Venta {

  @Override double conRecargo(double importeBase){
        return importeBase;
  }
}

class ventaConTarjeta extends   Venta {
    int cantidadDeCuotas, unCoeficiente;

    @Override  double conRecargo(double importeBase){
        return importeBase +cantidadDeCuotas * unCoeficiente + 0.01;
    }

}
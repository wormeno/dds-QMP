package queMePongo;

public class Atuendo {
    Prenda prendaSuperior,prendaInferior,calzado,accesorio;
    Prenda prendaSujeridaSuperior,prendaSujeridaInferior,calzadoSujerido,accesorioSujerido;

    Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio){
        this.prendaSuperior = prendaSuperior;
        this.prendaSuperior = prendaSuperior;
        this.calzado = calzado;
        this.accesorio = accesorio;
    }

    void recibirSugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio){
        prendaAcordeConClima(prendaSuperior);
        prendaAcordeConClima(prendaInferior);
        prendaAcordeConClima(calzado);
        prendaAcordeConClima(accesorio);
        this.prendaSujeridaSuperior = prendaSuperior;
        this.prendaSujeridaInferior = prendaSuperior;
        this.calzadoSujerido = calzado;
        this.accesorioSujerido = accesorio;
    }


    /**
     * Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes
     * a la temperatura actual sabiendo que para cada prenda habrá una temperatura hasta la cual
     * es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)
     * @param prenda
     */
    void prendaAcordeConClima(Prenda prenda){
        Clima clima = new Clima();
        if( prenda.getTemperaturaMaximaAdecuada() >  clima.getTemperatura() ){
            throw  new BorradorException("La prenda no es adecuada para el clima de la ciudad: "+clima.getTemperatura()+"C");
        }
    }




}

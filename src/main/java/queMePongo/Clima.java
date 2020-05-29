package queMePongo;

import queMePongo.Servicios.AccuWeatherAPI;

import java.util.*;

public class Clima {

    String ciudad = "Buenos Aires, Argentina";


    /**
     * Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires en un momento
     * dado para obtener sugerencias acordes.
     * Por ahora la condición climática se resume a la temperatura
     * @return
     */
    double getTemperatura(){
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        return  apiClima.getTemperatura(ciudad,new Date());
    }

    int getProbabilidadLluvia(){
        AccuWeatherAPI apiClima = new AccuWeatherAPI();

        return apiClima.getProbabilidadDeLluvia(ciudad,new Date());
    }

}

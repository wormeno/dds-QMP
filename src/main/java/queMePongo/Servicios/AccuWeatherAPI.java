package queMePongo.Servicios;

import java.util.*;

public final class AccuWeatherAPI implements ServiciosClima {


    @Override
    public double getTemperatura(String Ciudad, Date date) {
        List<Map<String, Object>> condicionesClimaticas = getWeather(Ciudad);
        Map<String,Integer> val = (Map<String, Integer>) condicionesClimaticas.get(0).get("Temperature");
        return val.get("Value");
    }

    @Override
    public int getProbabilidadDeLluvia(String Ciudad, Date fecha) {
        List<Map<String, Object>> condicionesClimaticas = getWeather(Ciudad);
        return (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
    }



     List<Map<String, Object>> getWeather(String ciudad) {
        return Arrays.asList(new HashMap(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap(){{
                put("Value", 20);
                put("Unit", "C");
                put("UnitType", 27);
            }});
        }});
    }
}

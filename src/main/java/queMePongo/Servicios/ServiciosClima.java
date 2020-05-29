package queMePongo.Servicios;

import java.util.Date;

interface  ServiciosClima {
    double getTemperatura(String Ciudad, Date fecha);

    int getProbabilidadDeLluvia(String Ciudad, Date fecha);
}

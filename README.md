**Maco Wins**
###[Cuarta Iteración]

* Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires en un momento dado para obtener sugerencias acordes.
   
   
* Como usuarie de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una prenda para cada categoría, aunque a futuro podrán tener más (Ej.: Una remera, un pantalón, zapatos y un gorro).

    
* Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes a la temperatura actual sabiendo que para cada prenda habrá una temperatura hasta la cual es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)

* Como administradore de QuéMePongo, quiero poder configurar fácilmente diferentes servicios de obtención del clima para ajustarme a las cambiantes condiciones económicas.

    Implemento un adaptador que permita que el componente atuendo se consulte el clima al servicio metereologico.
    
    El clima genera una relación "de usa" con los ServiciosDelClima

* Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de mi aplicación sin incurrir en costos innecesarios. 

    En éste punto no sé como asegurarle al stakeHolder, que no tiene conocimientos técnicos, que para asegurar la calidad estoy aplicando patrones de diseño y las abstracciones necesarias para representar su modelo de negocio


[Diagrama de Clases de la cuarta iteracion](/documents/4Iteracion.phg)

---

##[Segunda Iteración]

En esta iteración seguiremos trabajando sobre la carga de prendas válidas:

Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.

Sin embargo, agregaremos algunos requerimiento adicionales

Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).

Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.

Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc) para evitar elegir materiales inconsistentes con el tipo de prenda.

Como usuarie de QuéMePongo, quiero guardar un borrador de la la última prenda que empecé a cargar para continuar después.

Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa.

Como usuarie de QuéMePongo, quiero poder guardar una prenda solamente si esta es válida.

Por otro lado, el equipo de producto está analizando potenciales futuras funcionalidades para la aplicación y, a fin de tener una estimación de su complejidad, nos pidió que esbocemos una solución a los siguientes requerimientos, orientados a integrar el software con colegios e instituciones privadas:

Como usuario QueMePongo, quiero que poder recibir sugerencias de uniformes armados.

Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado

Como administrador de QueMePongo, quiero poder configurar diferentes uniformes para distintas instituciones (Ej: para el colegio San Juan debe ser una chomba verde de piqué, un pantalón de acetato gris y zapatillas blancas, mientras que para el Instituto Johnson siempre será una camisa blanca, pantalón de vestir negro y zapatos negros) 


## [Primera Iteración]
Primera Iteración

Comenzaremos definiendo que un atuendo es una combinación de prendas que tiene sentido usar juntas. Algunos ejemplos de atuendos podrían ser:
tus anteojos de sol favoritos, una remera de mangas cortas azul, el pantalón que te regaló tu mamá y unas zapatillas converse.
un pañuelo verde, una remera de mangas largas rayada, un pantalón de jean y un par de botas de cuero.
una musculosa de mickey, una pollera amarilla y unas crocs.

Como primer paso para generar los atuendos, les usuaries de QuéMePongo identificaron el siguiente requerimiento como principal:

Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.

Y luego, al consultar más sobre este requerimiento general, logramos descomponerlo con mayor detalle en los siguientes:

Como usuarie de QuéMePongo, quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).

Como usuarie de QuéMePongo, quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).

Como usuarie de QuéMePongo, quiero poder indicar de qué tela o material está hecha una prenda

Como usuarie de QuéMePongo, quiero poder indicar un color principal para mis prendas

Como usuarie de QuéMePongo, quiero poder indicar, si existe, un color secundario para mis prendas.

Como usuarie de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario

Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).


---
###[Requerimiento inicial]
Se requiere:

Identificar los requerimientos
Presentar una solución usando el paradigma de objetos (pseudocódigo, diagrama de clases).
Explicar todo lo que considere necesario en prosa.
Si descarta alguna alternativa durante el desarrollo de la solución, o tiene otra solución expliquela brevemente.


La conocida empresa de ropa formal para caballeros, Macowins, es capaz de darle soporte a la venta de prendas. Un fragmento de la grabación del analista con el cliente:

“Queremos saber el precio de venta de una prenda y sus tipos, los tipos de prenda son: sacos, pantalones, camisas.”

El cálculo del precio de una prenda es, el precio propio de la prenda modificado según el estado de la prenda, que pueden ser:
Nueva: en este caso no modifican el precio base.
Promoción: Le resta un valor fijo decidido por el usuario.
Liquidación: Es un 50% del valor del producto.

Ah, un requerimiento más: Macowins registra las ventas de estas prendas y necesita saber las ganancias de un determinado día. 

“Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta. 
Las ventas pueden ser en efectivo o con tarjeta. En el caso que sea con tarjeta, tienen el mismo comportamiento que en efectivo (el cual no modifica el precio), solo que se le aplica un recargo según la cantidad de cuotas seleccionadas (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”

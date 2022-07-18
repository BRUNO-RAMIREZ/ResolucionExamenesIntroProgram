------------------------------------------------------------------------
Resolucion por : BRUNO ELIAS RAMIREZ ROMERO
Ejercicio 1. (70 ptos.) Se tiene una maquina que realiza cortes en piezas sobre la base de un patron. Cada que se
quiere cortar, se debe verificar que el patron de corte tenga forma ya sea lineal o una forma simetrica. Por ejemplo,
si el patron es 1111, es una lınea, pero si el patron es 12421, es simetrico; se dice que es sim´etrico si se puede leer el
patron de izquierda a derecha igual que de derecha a izquierda. Considerando esta restriccion, el patron 997 no es un
patron de corte permitido.
Si se quiere cortar una placa con un patron que no es simetrico, la maquina cortadora deberıa convertir el patron
no simetrico a uno simetrico, para ello se debe realizar sumas sucesivas entre el patron original con su invertido tantas
veces como sea necesario para obtener un patron simetrico. En el caso que se tenga el patron 997, se hace las siguientes
modificaciones:
     997
    +799
    -----
    1796, no es simetrico, entonces se vuelve a sumar
    
     1796
    +6971
    ------
     8767, una vez mas..
     
     8767
    +7678
    ------
    16445, una vez mas..
    
     16445
    +54461
    -------
     70906, una vez mas..
     
     70906
    +60907
    -------
    131813, una vez mas..
    
     131813
    +318131
    --------
     449944 ya es simetrico.... entonces se para

para lograr esta transformacion se han realizado 6 transformaciones.
Jamas la maquina transforma un patron demasiadas veces, por lo que la cortadora tiene un limite de transformaciones especificada por lim, 
en caso de que la cantidad de transformaciones exceda este lim se deja de intentar y se dice que se han hecho -1 transformaciones.
Por ejemplo, si lim es 30 y el patron de corte es 998, entonces se realizan
mas operaciones de las que se tiene en lim, por lo cual la maquina debe responder -1.
Cada vez que se tiene un patron correcto, ya sea directo o por transformacion, la maquina debe contar que se ha
realizado un corte mas.
Dado este contexto se pide:
    1. Modelar tu solucion, indicando que tiene y que hace cada clase.
    2. Escribir el (los) m´etodos necesarios para que dada una solictud de corte dado un patron, la maquina indique la
    cantidad de transformaciones que se han realizado sobre el patron antes de realizar el corte.
    3. Escribir un metodo, que permita calcular el costo de operacion de la m´aquina. Cada transformacion que hace la
    m´aquina, cuesta cost. En caso de que una transformaci´on sea -1, no se toma como un costo. Si se considera que la
    m´aquina, ha recibido las solicitudes de corte con patrones: 1111, 12421, 997 y 998; la cantidad de transformaciones
    en total es 6 (solo necesito transformar el 997) y si se tiene que cost es 10 por transformaci´on, entonces el costo
    de operaci´on por transformacion de la m´aquina es 60. A esto se le suma la cantidad de cortes que la maquina
    ha hecho, en el caso del ejemplo, se ha realizado 3 cortes de las 4 solicitudes, ya que 998 no genero corte. Por lo
    que al final es costo de operaci´on total es 60 + 3.
------------------------------------------------------------------------


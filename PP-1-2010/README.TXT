------------------------------------------------------------------------
Resolucion por: BRUNO ELIAS RAMIREZ ROMERO
Ejercicio 1 (60 pts.) Se tiene una caja fuerte que asegura la misma por el sistema de rodillos. Cuando los
rodillos se ponen en los d´ıgitos correctos la caja se abre. Estas cajas mantienen internamente su clave, y para
ayudar al dueño entregan pistas cuando el dueño olvida la clave, por supuesto no cualquiera deberıa poder
entender la pista. Para ello, lo que hace la caja fuerte es: dada una intencion de clave (de la misma cantidad de
cifras que la clave correcta) deberıa indicar el numero de movimientos mınimos que se requiere hacer a esta clave
de intencion para obtener la clave correcta. Por supuesto, no deberıa decir en que sentido son los movimientos,
ya que como es en base a rodillos se puede mover el rodillo hacia arriba o hacia abajo; por lo que solamente
indica el numero mınimo de movidas.
Por ejemplo si se tiene la caja fuerte con su clave de 4 dıgitos igual a 3241, y se pide una pista con:
3241 la caja fuerte deberıa decir que se requiere 0 movimientos.
3231 darıa 1 movimiento necesario
3131 darıa 2 movimientos
1989 darıa 11; ya que para llegar de 1 a 3 se requiere 2 movimientos mınimos hacia arriba, para llegar de
9 al 2 se mueve hacia arriba 3, para llegar de 8 a 4 se mueve 4 hacia abajo y de 9 a 1 se requiere 2 hacia
arriba, lo que hace que se requiera de 2 + 3 + 4 + 2 movimientos (un total de 11).
Dado este contexto se pide:
1. Realizar el modelo para resolver el problema planteado (10 pts).
2. Realizar todos los constructores del modelo que hallaste. (10 pts)
3. Realizar el (los) metodo(s) necesario(s) para otorgar una pista dada una clave tentativa. (40 pts)

------------------------------------------------------------------------


***TAREA LIBRERIA CALCULADORA*** <br>
------------------------
Solicitando dos números al usuario, el programa debe realizar la suma, la resta, la multiplicación y la división de estos. Dichos números se solicitarán a través de librería
"EntradaSalida" que se importó previamente. <br><br>
Para importar una librería hay que crear el jar de la clase de los métodos que se quieren utilizar: <br>
File--> Project Structure --> Artifacts --> + --> JAR --> From modules with dependencies --> Ok --> Apply <br>
Tras esto, construimos el JAR: <br>
Build --> Build Artifact <br>
Una vez construido el JAR, vamos al proyecto en el que queremos usar los métodos y lo añadimos:<br>
File --> Project Structure --> Libraries --> Apply

***OPERACIONES***<br>
---------------------------
A través del método Switch, se le dará al usuario la opción de elegir entre una de las operaciones, incluyendo un tratamiento de excepciones (try catch) en cada una para posibles errores.

1. SUMA:
El usuario deberá escribir dos número y el programa dará el resultado de la suma por consola. El programa termina mostrando el resultado final.

2. RESTA:
El usuario deberá escribir dos número y el programa dará el resultado de la resta por consola. El programa termina mostrando el resultado final.

3. MULTIPLICACIÓN:
El usuario deberá escribir dos número y el programa dará el resultado de la multiplicación por consola. El programa termina mostrando el resultado final.

4. DIVISIÓN:
El usuario deberá escribir dos número y el programa dará el resultado de la división por consola. El programa termina mostrando el resultado final. 
<br>


En caso de que el resultado sea infinito, por ejemplo si divido un número entre cero, aparecerá el mensaje: **Error: No se puede dividir entre cero. Prueba otra vez.** 
Dicho resultado es permitido gracias al método *isInfinite()* o *isNan()*, los cuales son propios de la clase Java y devuelven un true si la variable es infinita o no válida, y un false, en caso contrario.

[JavaDoc](https://jorgeamestoy.github.io/LibreriaCalculadora/)

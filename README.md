## Objetivo
Crear una arquitectura básica, pero completa de una aplicación diseñada con POO.
Y para ello empezar a entender cómo se puede `pensar` en Objetos y Clases. Y llevar a concretar un ejemplo con un Controlador (MVC) y un Repositorio aplicado mediante DI.     
>¡¡¡Dios nos coja confesados!!!    

### Enunciado
<br/>

Dada una clase Persona, establecida con un atributo `'nombre'`, y dos métodos `'escucha'` y `'dice'`, en la que los métodos pueden ser codificados con las siguientes sentencias:   
`'dice'` puede tener:
```java
    System.out.print(nombre + " dice: ");
    return scn.nextLine();
``` 
Y `'eschucha'` podría ser:
```java
    System.out.println(nombre + " escucha: '" + palabras + "' ");
    return this;
```

y realiza la siguiente práctica de entornos:

0.- `Crea la Persona`  
Y comprueba que funciona.
**Nota**: Crear el objeto, entender los métodos y entender qué significa `this`.
**Objetivo**: Entender Clases, Objetos. Y los principios de Coherencia y responsabilidad única del diseño de clases.   
**Práctica**: Trás crear la persona demuestra que puedes crear un `Novio` (con algún _atributo_ más, como la _intensidad_ de su amor)

1.- `Los Novios enfadados`   
Establece un diálogo _eterno_ entre dos `Personas` o `Novios`en el que se simula que los participantes colaboran en una discusión o intercambio de mensajes.  
**Nota**: Si puedes utiliza `this` en el diálogo.
**Objetivo**: Entender Clases, Objetos y envío de mensajes entre Objetos.

2.- `El acuerdo`   
Modifica el diálogo anterior y simula la discusión hasta que dos mensajes consecutivos, y específicos (indicados por código) son los escuchados por los novios y esperados para finalizar la discusión.   
**Nota**: No importa el orden en el que se dicen los mensajes ni quien lo dice.   
**Objetivo**: Presentar la opción de un control específico del diálogo. Y desglosar las reponsabilidades de la aplicación. 

3.- `La memoria`   
Uno de los participantes repite siempre lo que dijo anteriormente, antes de volver a decir algo nuevo.   
**Nota**: Reescribe Persona/Novio o inventa algo nuevo.   
**Objetivo**: Entender la herencia. Encapsulación. Sobreescritura. Principio Open/Close.   
**Práctica**: Sobreescribe el método de escucha para que recuerde lo que recibió.

4.- `Abrupto terminar. Límite alcanzado`  
Toda discusión tiene un límite y esto se produce cuando uno de los participantes _con memoria_ escucha un mensaje (_por segunda vez_) y esto, le produce tanto rechazo que revienta el diálogo.  
**Nota**: Aquí hay que utilizar Excepciones y capturarlas. Entender cómo esto nos obliga a reescribir código y a pensarlas desde un comienzo si queremos tenerlas encuenta.(en Java)    
**Objetivo**: Entender las interrupciones/excepciones y capturarlas adecuadamente.  
**Práctica**: Ya hemos hecho mucho con el ciclo de conversación. Trata de sacar el diálogo a un método, y mejor aún a una clase.
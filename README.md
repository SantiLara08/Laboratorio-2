# Laboratorio-2
Equipo: Simon Ramirez, Andres Jaimes y Santiago Lara

1. Primero crearemos las clases que vanmos a usar: Clases Plato, Clase Bebida y Clase Combo, que todas heredan de la clase padre producto. Ademas, crear clase Cliente, Repartidor, Pedido y Sede.
2. En la clase cliente y repartidor se creo los Getters para poder leer los datos desde otras clases, los equals para poder comprobar si un cliente es igual a otro en el caso del cliente y en el repartidor de utiliza para comparar los mismos repartidores, despues se utilizo colecciones el hashcode para convertir estas variables a un numero y usar el hashmap hacer mucho mas rapido y facil su busqueda, por ultimo en la clase repartidor instanciamos dos atributos "calificacion" y "entregas", para despues con sus Getters organizarlos.

3. Producto es abstracta porque no se debe instanciar por si solo. GetPrecio es abstracta porque cada clase lo calcula diferente, por ejemplo, combo tiene descuento. Cada producto tiene un id producto para poder evitar duplicados y consutlar facil usando un hashMap o Hashshet sin recorrer todo.

4. Se creo una clase utlitiara para los calculos. Aqui aprovehchamos para usar PROGRAMACION FUNCIONAL y WILDCARDS. Usamos Wildcards en el argumento del metodo calcular total, en el cual hay un extends a producto, osea que recibe cualquier lista de clases de producto para abajo(plato,bebida,combo) Y usamos programacion funcional para obtener cada precio y sumarlo.
   
5. En las clases Pedido y Sede se crearon getters para llamarlos desde las otras clases. A sede se le creo el HashCode y el Equals igual que en el punto 2 para facilitar su búsqueda y poder evitar duplicados.

6. Se crearon los enums canal para saber desde donde se trajo el usuario si es wpp, telefono o app. Y el enum EstadoPedido. Se agregaron estos como atributos en la clase Pedido con sus getters y setters.

7. Se creo un comparador para poder conocer los mejores repartidores
   
   

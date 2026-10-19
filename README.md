# Laboratorio-2
Equipo: Simon Ramirez, Andres Jaimes y Santiago Lara

1. Primero crearemos las clases que vanmos a usar: Clases Plato, Clase Bebida y Clase Combo, que todas heredan de la clase padre producto. Ademas, crear clase Cliente, Repartidor, Pedido y Sede.

2. Producto es abstracta porque no se debe instanciar por si solo. GetPrecio es abstracta porque cada clase lo calcula diferente, por ejemplo, combo tiene descuento. Cada producto tiene un id producto para poder evitar duplicados y consutlar facil usando un hashMap o Hashshet sin recorrer todo.

3. Se creo una clase utlitiara para los calculos. Aqui aprovehchamos para usar PROGRAMACION FUNCIONAL y WILDCARDS. Usamos Wildcards en el argumento del metodo calcular total, en el cual hay un extends a producto, osea que recibe cualquier lista de clases de producto para abajo(plato,bebida,combo) Y usamos programacion funcional para obtener cada precio y sumarlo.
   

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Creacion de registros
        Registro<String, Cliente> clientes = new Registro<>(c -> c.getDocumento());
        Registro<String, Producto> menu = new Registro<>(p -> p.getId());
        Registro<String, Repartidor> repartidores = new Registro<>(r -> r.getId_repartidor());
        Registro<String, Pedido> pedidos = new Registro<>(p -> p.getId());



        //Creacion de clientes
        Cliente cliente1 = new Cliente("1001", "Ana", "ana@gmail", "3001112233");
        Cliente cliente2 = new Cliente("1002", "Luis", "luis@gmail", "3004445566");
        Cliente cliente3 = new Cliente("1001", "Ana", "ana@gmail", "3001112233");



        //Creacion del menu
        Plato plato1 = new Plato(28000, "Bandeja paisa", 20, "P1");
        Plato plato2 = new Plato(24000, "Ajiaco", 15, "P2");
        Plato plato3 = new Plato(24000, "Hamburguesa", 10, "P3");
        Plato plato4 = new Plato(9000, "Arepa", 5, "P4");
        Bebida bebida1 = new Bebida(7000, "Limonada", 400, "B1");
        Combo combo1 = new Combo("Combo hamburguesa", 10, "C1");
        combo1.getProductos().add(plato3);
        combo1.getProductos().add(bebida1);

        menu.guardar(plato1);
        menu.guardar(plato2);
        menu.guardar(plato3);
        menu.guardar(plato4);
        menu.guardar(bebida1);
        menu.guardar(combo1);



        //Creacion de repartidores y sus entregas
        Repartidor repartidor1 = new Repartidor("R1", "Carlos", "3101234567");
        Repartidor repartidor2 = new Repartidor("R2", "Maria", "3107654321");
        Repartidor repartidor3 = new Repartidor("R3", "Pedro", "3109998877");
        repartidor1.registrarEntrega(4.5);
        repartidor1.registrarEntrega(4.0);
        repartidor2.registrarEntrega(5.0);
        repartidor2.registrarEntrega(5.0);
        repartidor2.registrarEntrega(4.0);
        repartidor3.registrarEntrega(4.0);

        repartidores.guardar(repartidor1);
        repartidores.guardar(repartidor2);
        repartidores.guardar(repartidor3);



        //Creacion de sedes
        Sede sede1 = new Sede("S1", "Centro", "Calle 10 # 5-20");
        Sede sede2 = new Sede("S2", "Norte", "Carrera 15 # 90-10");
        List<Sede> sedes = new ArrayList<>();
        sedes.add(sede1);
        sedes.add(sede2);



        //Creacion de pedidos
        Pedido pedido1 = new Pedido("PE1", cliente1, sede1, EstadoPedido.EN_PROCESO, Canal.APP);
        pedido1.agregarProducto(plato1);
        pedido1.agregarProducto(bebida1);

        Pedido pedido2 = new Pedido("PE2", cliente1, sede2, EstadoPedido.EN_PROCESO, Canal.WHATSAPP);
        pedido2.agregarProducto(plato2);
        pedido2.agregarProducto(plato1);
        pedido2.setPromocion(new DescuentoPorcentaje(10));

        Pedido pedido3 = new Pedido("PE3", cliente2, sede1, EstadoPedido.EN_PROCESO, Canal.TELEFONO);
        pedido3.agregarProducto(plato4);
        pedido3.agregarProducto(plato1);
        pedido3.agregarProducto(combo1);

        pedidos.guardar(pedido1);
        pedidos.guardar(pedido2);
        pedidos.guardar(pedido3);




        System.out.println("-------------------------------Registro de clientes(sin duplicados)-------------------------------------------");
        System.out.println("Ana por la app: " + clientes.guardar(cliente1));
        System.out.println("Ana otra vez por WhatsApp: " + clientes.guardar(cliente3));
        System.out.println("Luis: " + clientes.guardar(cliente2));



        System.out.println("-------------------------------Buscar un cliente que no existe-------------------------------------------");
        Optional<Cliente> clienteBuscado = clientes.buscar("9999");
        if(clienteBuscado.isPresent() == true){
            System.out.println("Encontrado: " + clienteBuscado.get().getNombre());
        }
        else{
            System.out.println("El cliente 9999 no existe");
        }



        System.out.println("-------------------------------Menu ordenado por nombre-------------------------------------------");
        List<Producto> listaMenu = menu.getTodos();
        Collections.sort(listaMenu);
        listaMenu.forEach(p -> System.out.println(p.getNombre() + " " + p.getPrecio()));



        System.out.println("-------------------------------Menu ordenado por precio y nombre-------------------------------------------");
        Collections.sort(listaMenu, new OrdenarMenu());
        listaMenu.forEach(p -> System.out.println(p.getNombre() + " " + p.getPrecio()));



        System.out.println("-------------------------------Cambio de estado de un pedido-------------------------------------------");
        pedido1.agregarInteresado(new Aviso("Cocina"));
        pedido1.agregarInteresado(new Aviso("Cliente"));
        pedido1.agregarInteresado(new Aviso("Repartidor"));
        pedido1.setEstado(EstadoPedido.ENTREGADO);



        System.out.println("-------------------------------3 platos mas vendidos-------------------------------------------");
        List<Producto> vendidos = pedidos.getTodos().stream()
                .flatMap(p -> p.getProductos().stream())
                .toList();
        menu.getTodos().stream()
                .filter(p -> p instanceof Plato)
                .sorted((p1, p2) -> Long.compare(
                        vendidos.stream().filter(v -> v.equals(p2)).count(),
                        vendidos.stream().filter(v -> v.equals(p1)).count()))
                .limit(3)
                .forEach(p -> System.out.println(p.getNombre()));



        System.out.println("-------------------------------Facturacion por sede-------------------------------------------");
        sedes.forEach(s -> System.out.println(s.getNombre() + ": " + pedidos.getTodos().stream()
                .filter(p -> p.getSede().equals(s))
                .mapToDouble(p -> p.getTotal())
                .sum()));



        System.out.println("-------------------------------Pedido mas caro de Ana-------------------------------------------");
        Optional<Pedido> pedidoMasCaro = pedidos.getTodos().stream()
                .filter(p -> p.getCliente().equals(cliente1))
                .sorted((p1, p2) -> Double.compare(p2.getTotal(), p1.getTotal()))
                .findFirst();
        if(pedidoMasCaro.isPresent() == true){
            System.out.println(pedidoMasCaro.get().getId() + " " + pedidoMasCaro.get().getTotal());
        }
        else{
            System.out.println("Ana no tiene pedidos");
        }



        System.out.println("-------------------------------Mejores repartidores-------------------------------------------");
        List<Repartidor> listaRepartidores = repartidores.getTodos();
        Collections.sort(listaRepartidores, new Comparadormejoresrepartidores());
        listaRepartidores.forEach(r -> System.out.println(r.getNombre() + " " + r.getCalificacion() + " " + r.getEntregas()));

    }
}

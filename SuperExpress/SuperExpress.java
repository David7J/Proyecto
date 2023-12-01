import java.util.Scanner;

public class SuperExpress {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        
        Factura facturaAgua = new Factura();

        facturaAgua.establecerRecibo("ENACAL");
        facturaAgua.establecerServicio("Pago Recibo de Agua");
        facturaAgua.establecerCajero("JHY 26-09-2023 02:18 pm");
        facturaAgua.establecerNuTRX("J9895556");
        facturaAgua.establecerFactura("F-Z-R-CTA");
        facturaAgua.establecerMonto(350);        

        facturaAgua.establecerCedula("001270905001Y-David Jeshua Areas Perez");
        facturaAgua.establecerMoneda("Cordobas");
        facturaAgua.establecerEfectivo(350);
        facturaAgua.establecerTotal(350);


        System.out.println("           SUPER EXPRESS");
        System.out.println("             RECIBIDO");
        System.out.println("Recibo: " + facturaAgua.mostrarRecibo());
        System.out.println("Servicio: " + facturaAgua.mostrarServicio());
        System.out.println("Cajero: " + facturaAgua.mostrarCajero());
        System.out.println("NuTRX: " + facturaAgua.mostrarNuTRX());
        System.out.println("Factura: " + facturaAgua.mostrarFactura());
        System.out.println("Monto: " + facturaAgua.mostrarMonto());
        System.out.println("Cedula: " + facturaAgua.mostrarCedula());
        System.out.println("Moneda: " + facturaAgua.mostrarMoneda());
        System.out.println("Efectivo: " + facturaAgua.mostrarEfectivo());
        System.out.println("Total: " + facturaAgua.mostrarTotal());


        System.out.println(" ");
        System.out.println("*****************************************");
        Producto cliente = new Producto() {
            
        };
    
        cliente.setCantStock(45);
        cliente.setDisponible(true);
        cliente.setNombre("Jugo del valle");
        cliente.setPrecioUnitario(25);

        System.out.println("CantStock: " + cliente.getCantStock());
        System.out.println("Disponible: " + cliente.isDisponible());
        System.out.println("Nombre del producto: " + cliente.getNombre());
        System.out.println("Precio: " + cliente.getPrecioUnitario());
        
        System.out.println(" ");
        System.out.println("*****************************************");
        Producto usuario = new Producto() {
        };
        usuario.setCantStock(34);
        usuario.setDisponible(true);
        usuario.setNombre("Barras de granola");
        usuario.setPrecioUnitario(87);

        System.out.println("CantStock: " + usuario.getCantStock());
        System.out.println("Disponible: " + usuario.isDisponible());
        System.out.println("Nombre del producto: " + usuario.getNombre());
        System.out.println("Precio: " + usuario.getPrecioUnitario());

        Producto[] inventario = {
            new Pelicula("Pelicula", 15.99, 20, true),
            new Telefono("Telefono: Samsung", 299.99, 10, true),
            new ComboHamburguesa("Combo A: hamburguesa con papas fritas", 9.99, 30, true),
            new Libro("Libro: Cien años de soledad", 12.50, 25, true),
            new Audifonos("Audifonos: P45", 49.99, 15, true)
        };
        System.out.println(" ");
        System.out.println("Productos disponibles:");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i + 1) + ". " + inventario[i].getNombre());
        }

        System.out.println("Seleccione el número del producto que desea comprar:");
        int seleccion = lector.nextInt();

        if (seleccion >= 1 && seleccion <= inventario.length) {
            Producto productoSeleccionado = inventario[seleccion - 1];
            System.out.println("Ha seleccionado: " + productoSeleccionado.getNombre());

            System.out.println("¿Cuántas unidades desea comprar?");
            int cantidad = lector.nextInt();

            if (cantidad > 0 && cantidad <= productoSeleccionado.getCantStock()) {
                double total = cantidad * productoSeleccionado.getPrecioUnitario();
                System.out.println("Total a pagar: " + total);

            
                productoSeleccionado.setCantStock(productoSeleccionado.getCantStock() - cantidad);
            } else {
                System.out.println("Cantidad inválida o insuficiente en el inventario.");
            }
        } else {
            System.out.println("Selección inválida.");
        }

        lector.close();
    }
}

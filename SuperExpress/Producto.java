import java.util.Scanner;

abstract class Producto {
    private String nombre;
    private double precioUnitario;
    private int cantStock;
    private boolean disponible;


    public Producto(){

    }

    public Producto(String nombre, double precioUnitario, int cantStock, boolean disponible) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantStock = cantStock;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantStock() {
        return cantStock;
    }




    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCantStock(int i) {
    }
}

class Pelicula extends Producto {
    public Pelicula(String nombre, double precioUnitario, int cantStock, boolean disponible) {
        super(nombre, precioUnitario, cantStock, disponible);
    }
}

class Telefono extends Producto {
    public Telefono(String nombre, double precioUnitario, int cantStock, boolean disponible) {
        super(nombre, precioUnitario, cantStock, disponible);
    }
}

class ComboHamburguesa extends Producto{
    public ComboHamburguesa(String nombre, double precioUnitario, int cantStock, boolean disponible){
         super(nombre, precioUnitario, cantStock, disponible);
    }
}

class Libro extends Producto{
    public Libro(String nombre, double precioUnitario, int cantStock, boolean disponible){
         super(nombre, precioUnitario, cantStock, disponible);
    }
}

class Audifonos extends Producto{
    public Audifonos(String nombre, double precioUnitario, int cantStock, boolean disponible){
         super(nombre, precioUnitario, cantStock, disponible);
    }
}
package ejercicio2;

public class Detalle {
    private Producto producto;
    private int cantidad;
    private int precio;


    public Detalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = producto.getPrecio();
    }


    @Override
    public String toString() {
        return "Detalle [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "]";
    }

   

    



}

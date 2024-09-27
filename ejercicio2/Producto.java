package ejercicio2;

public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private Proveedor provedor;
    private TipoProducto tipoProducto;
    
    public Producto(int codigo, String nombre, int precio, Proveedor provedor, TipoProducto tipoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.provedor = provedor;
        this.tipoProducto = tipoProducto;
    }

    

    public int getPrecio() {
        return precio;
    }



    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", provedor=" + provedor
                + ", tipoProducto=" + tipoProducto + "]";
    }

    

    
    


}

package ejercicio2;

public class TipoProducto {
    private int codigo;
    private String descripcion;
    private int iva;
    
    public TipoProducto(int codigo, String descripcion, int iva) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "TipoProducto [codigo=" + codigo + ", descripcion=" + descripcion + ", iva=" + iva + "]";
    }
 
    

}

package ejercicio2;

public class Proveedor {
    private int id;
    private String nombre;
    
    public Proveedor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
    }

    

}

package ejercicio2;

public class Cliente {
    private int id;
    private String nombre;
    
    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + "]";
    }

    
}

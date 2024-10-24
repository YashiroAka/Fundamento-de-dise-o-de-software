package ejercicio1;
//Gomez Tarazona Paula Lucia
//Mondragon Rey Nicolas Jacobo
public class Titular {
	private String nombre;
    private String apellido;
    private String correo;
    private int id;
	public Titular(String nombre, String apellido, String correo, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
}

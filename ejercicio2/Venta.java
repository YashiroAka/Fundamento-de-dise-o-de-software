package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private int numero;
    private LocalDate fecha;
    private Cliente cliente;
    private int valorTotal;
    private int iva;
    private ArrayList<Detalle> listaDetalles;

/**
 * 
 * @param numero
 * @param cliente
 */
    public Venta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.listaDetalles =new ArrayList<>();
        fecha = LocalDate.now();

    }
/**
 * Función para adicionar un detalle a la lista detalles
 * @param detalle
 */
    public void adicionarDetalle(Detalle detalle){
        listaDetalles.add(detalle);
    }
/**
 * Funcionar para mostrar por consola la lita de detalles comprados
 */
    public void mostrarDetalle(){
        for (Detalle detalle : listaDetalles) {
            System.out.println(detalle);
        }
    }

}

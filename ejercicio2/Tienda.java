package ejercicio2;

import java.util.ArrayList;

public class Tienda {
    public static void main(String[] args) {
        
    
    ArrayList<Producto> listaProducto =new ArrayList<>();
    ArrayList<Venta> listaVentas =new ArrayList<>();

    TipoProducto tipoP1 =new TipoProducto(10,"Gaseosa" ,15);
    TipoProducto tipoP2 =new TipoProducto(20, "Empacados", 19);

    Proveedor proveedor =new Proveedor(100,"Juanita");

    Producto producto1 =new Producto(10000,"Cocacola" , 6000, proveedor, tipoP1);
    Producto producto2 =new Producto(1020, "Doritod", 3500, proveedor, tipoP2);

    listaProducto.add(producto1);
    listaProducto.add(producto2);

    for (Producto producto : listaProducto) {
        System.out.println(producto);
    }

    Cliente cliente1 =new Cliente(2560, "Juanito");

    Venta venta1 =new Venta(1000, cliente1);

    Detalle detalle1 =new Detalle(producto1, 3);

    venta1.adicionarDetalle(detalle1);

    Detalle detalle2 =new Detalle(producto2, 2);

    venta1.adicionarDetalle(detalle2);

    venta1.mostrarDetalle();

   



    }

}

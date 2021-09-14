package Super;

import java.util.ArrayList;

public class Inventario extends Super_Online {

	public static int ultimoCatalogo;
	public static int ficheroInventario;
	public static ArrayList<Producto> lista= new ArrayList<Producto>();

	private Inventario(){

	}

	/*public static void initInventario(){
		if(lista==null){
			lista = new ArrayList<Producto>();
		}


	}*/

	public static void cargarProductos(){

	}

	public static void guardarProductos(){



	}

	public static void addNuevoProducto(Producto p){
		lista.add(p);
	}

	public static void mostrarProductos(){

		for(Producto p : lista){

			p.imprimir();

		}

	}

	public static Producto getProducto(int id){

		return lista.get(id);


	}

	public void actualizarCantidad(int codigo,int cantidad, Producto p){

		//lista.set(codigo, p.setCantidad(cantidad));

	}

	public static int tamano(){

		return 0;
	}

	public static void mostrarProductosEnviables(){

	}

	public void eliminarProducto(int id){

		lista.remove(id);
	}


}

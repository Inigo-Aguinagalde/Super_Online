package Super;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
		 try {
			BufferedReader bufReader = new BufferedReader(new FileReader("C:/Users/2dam3/Desktop/super_online/productos.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void guardarProductos(){

		 FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("C:/Users/2dam3/Desktop/super_online/productos.txt");
	            //pw = new PrintWriter(fichero);

	            for (Producto p : lista){
	            	fichero.write(p.volcar(lista));
	            }
	            fichero.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

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

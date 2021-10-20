package Super;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;

public class Inventario extends Super_Online implements Serializable {

	public static int ultimoCatalogo;
	public static int ficheroInventario;
	public static ArrayList<Producto> lista= new ArrayList<Producto>();
	private static int i=0;
	private static FileOutputStream file;
	private static ObjectOutputStream output;
	private static FileInputStream fl;
	private static ObjectInputStream input;
	static ArrayList<String> productos = new ArrayList<String>();
	private static ResultSet rFruta;
	private static ResultSet rOtro;
	private static ResultSet rHerramientas;
	private static ResultSet rBebida;
	private static ResultSet rLacteo;




	private Inventario(){

	}

	/*public static void initInventario(){
		if(lista==null){
			lista = new ArrayList<Producto>();
		}


	}*/

	public static void cargarProductos(){



		rFruta=st.cargarFrutas();
		rOtro=st.cargarOtros();
		rHerramientas=st.cargarHerramientas();
		rBebida=st.cargarBebidas();
		rLacteo=st.cargarLacteos();

	}

	public static void guardarProductos(){

		XMLEncoder e = null;
		try {
			e = new XMLEncoder(
					new BufferedOutputStream(
							new FileOutputStream("C:/Users/2dam3/Desktop/super_online/Test.xml")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.writeObject(lista);
		e.close();

	}

	public static void addNuevoProducto(Producto p){

		lista.add(p);
	}

	public static void mostrarProductos() throws SQLException{

		System.out.println("Lacteos");
		while (rLacteo.next()) {

			System.out.println(rLacteo.getInt("codigo") + " | " + rLacteo.getString("nombre") + " | " + rLacteo.getDouble("precio")+" | "+rLacteo.getInt("cantidad")+" | "+rLacteo.getDouble("peso")+" | "+rLacteo.getString("fecha")+" | "+rLacteo.getString("lote"));

		}


		System.out.println("Fruta y hortalizas");
		while (rFruta.next()) {

			System.out.println(rFruta.getInt("codigo") + " | " + rFruta.getString("nombre") + " | " + rFruta.getDouble("precio")+" | "+rFruta.getInt("cantidad")+" | "+rFruta.getDouble("peso")+" | "+rFruta.getString("fecha")+" | "+rFruta.getString("origen"));

		}
		System.out.println("Bebidas");
		while (rBebida.next()) {

			System.out.println(rBebida.getInt("codigo") + " | " + rBebida.getString("nombre") + " | " + rBebida.getDouble("precio")+" | "+rBebida.getInt("cantidad")+" | "+rBebida.getDouble("peso")+" | "+rBebida.getString("fecha")+" | "+rBebida.getString("graduacion"));

		}

		System.out.println("Herramientas");
		while (rHerramientas.next()) {

			System.out.println(rHerramientas.getInt("codigo") + " | " + rHerramientas.getString("nombre") + " | " + rHerramientas.getDouble("precio")+" | "+rHerramientas.getInt("cantidad")+" | "+rHerramientas.getDouble("peso"));

		}
		System.out.println("Otro");
		while (rOtro.next()) {

			System.out.println(rOtro.getInt("codigo") + " | " + rOtro.getString("nombre") + " | " + rOtro.getDouble("precio")+" | "+rOtro.getInt("cantidad")+" | "+rOtro.getDouble("peso")+" | "+rFruta.getString("categoria"));

		}

	}

	public static Producto getProducto(int id){

		return lista.get(id);


	}

	public void actualizarCantidad(int codigo,int cantidad, Producto p){

		//lista.set(codigo, p.setCantidad(cantidad));

	}

	public static int tamano(){


		return i;
	}

	public static void mostrarProductosEnviables(){

	}

	public void eliminarProducto(int id){

		lista.remove(id);
	}


}

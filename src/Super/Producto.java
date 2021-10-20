package Super;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public abstract class Producto {

	private double iva;
	private int codigo;
	private String nombre;
	private double precio;
	private int cantidad;
	private double peso;
	private Scanner sc;




	public Producto(int codigo, String nombre, double precio, int cantidad, double peso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.peso = peso;
	}

	public Producto(Scanner sc){

		this.sc=sc;
	}

	public Producto() {
		
	}



	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double calcularPrecioIva(){
		iva= (precio*cantidad)/iva;

		return iva;
	}


	public void imprimir(){

		System.out.println("nombre: "+getNombre()+"\n "
				+"precio: "+getPrecio()+"\n "
				+ "cantidad: "+getCantidad()+"\n "
				+"peso: "+getPeso()+"\n"

				);


	}

	public void imprimirEnvio(){


		FileWriter fichero = null;
		PrintWriter pw = null;
		try
		{
			fichero = new FileWriter("C:/Users/2dam3/Desktop/super_online/productos.txt");
			pw = new PrintWriter(fichero);



		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public String volcar(){

		
		
		return "nombre: "+getNombre()+" "+"precio: "+getPrecio()+" "+ "cantidad: "+getCantidad()+" "+"peso: "+getPeso()+" ";
	}



}

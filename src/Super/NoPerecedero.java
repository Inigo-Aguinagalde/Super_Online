package Super;

import java.util.Scanner;

public class NoPerecedero extends Producto {

	public NoPerecedero(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	
	public NoPerecedero() {
		
	}

	public NoPerecedero(Scanner sc){
		super(sc);
	}

	public void imprimir(){
		super.imprimir();

	}

}

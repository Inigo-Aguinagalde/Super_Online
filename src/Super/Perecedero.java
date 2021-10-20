package Super;

import java.util.Scanner;

public abstract class Perecedero extends Producto implements Enviable {

	private String fechacad;

	public Perecedero(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	public Perecedero() {
		// TODO Auto-generated constructor stub
	}

	public Perecedero(Scanner sc){
		super(sc);
	}


	public double tarifaEnvio(){

		return 0;

	}

	public String getFechacad() {
		return fechacad;
	}

	public void setFechacad(String fechacad) {
		this.fechacad = fechacad;
	}

	@Override
	public void imprimir(){
		super.imprimir();

	}

	public String volcar(){

		return super.volcar();
	}


	public void imprimirEnvio(){

	}


	public boolean envioFragil(){

		return true;
	}

}

package Super;

import java.util.Scanner;

public class Otros extends NoPerecedero{

	private String categoria;
	private double valor_iva=0.16;
	private boolean eFragil;

	public Otros(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	
	public Otros() {
		
	}
	
	public Otros(Scanner sc, Sentencias st){
		super(sc);
		String fragil;
		System.out.println("Introduzca el nombre del producto ");
		
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio del producto");
		while (!sc.hasNextInt()) sc.next();
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad del producto");
		while (!sc.hasNextInt()) sc.next();
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso del producto");
		while (!sc.hasNextDouble()) sc.next();
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("Introduzca la categoria del producto");
		setCategoria(sc.nextLine());

		st.insertOtros(getNombre(), getPrecio(), getCantidad(), getPeso(), getCategoria());

	}



	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void imprimir(){
		super.imprimir();
		System.out.println("Categoria: "+categoria);

	}

	public String volcar(){
		String superVolcar=super.volcar();

		String string;
		
		if(eFragil==true) {
			string = superVolcar+" el producto es fragil";
		}else {
			string = superVolcar+" el producto no es fragil ";

		}
		return string;
	}

}

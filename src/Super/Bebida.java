package Super;

import java.util.Scanner;

public class Bebida extends Perecedero {

	private String graduaciom;
	private double valor_iva=0.16;
	private boolean eFragil;

	public Bebida(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}


	public Bebida(Scanner sc){
		super(sc);
		String fragil;
		System.out.println("Introduzca el nombre de la bebida ");
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio de la bebida");
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad de la bebida");
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso de la bebida");
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("Introduzca la graduacion de la bebida");
		setGraduaciom(sc.nextLine());

		sc.nextLine();

		System.out.println("La botella o lata es fragil");
		fragil=sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}
	}


	public String getGraduaciom() {
		return graduaciom;
	}


	public void setGraduaciom(String graduaciom) {
		this.graduaciom = graduaciom;
	}


	public String volcar(){

		return "";
	}

	@Override
	public void imprimir(){
		super.imprimir();
		System.out.println("graduaccion: "+graduaciom				);
		if(eFragil==true){
			System.out.println("El paquete es fragil");
		}else{
			System.out.println("El paquete no es fragil");
		}

	}

	public boolean envioFragil(boolean fragil){
		boolean efragil;

		efragil=fragil;

		return efragil;

	}
}

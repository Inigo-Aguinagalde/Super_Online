package Super;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Herramienta extends NoPerecedero implements Enviable {

	private double valor_iva=0.4;
	private boolean eFragil;
	private double tarifaEnvio;

	public Herramienta(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}

	public Herramienta(Scanner sc){
		super(sc);
		String fragil;
		System.out.println("Introduzca el nombre de la herramienta ");
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio de la herramienta");
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad de la herramienta");
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso de la herramienta");
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("La herramienta es fragil");
		fragil=sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}
	}

	@Override
	public boolean envioFragil() {
		// TODO Auto-generated method stub
		return eFragil;
	}

	@Override
	public double tarifaEnvio() {
		if(getPeso()>10){
			tarifaEnvio=1.76;
		}else{
			tarifaEnvio=0.5;
		}

		return tarifaEnvio;
	}

	public String volcar(){



		return "";
	}

	@Override
	public void imprimir(){
		super.imprimir();
		System.out.println("tarifa envio: "+tarifaEnvio()
				);
		if(envioFragil()==true){
			System.out.println("El paquete es fragil \n");
		}else{
			System.out.println("El paquete no es fragil \n");
		}

	}

	public void imprimirEnvio(){

	}

}

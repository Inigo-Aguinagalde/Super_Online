package Super;

import java.util.Scanner;

public class Lacteo extends Perecedero {

	private String lote;
	private double valor_iva=0.04;

	private boolean eFragil;


	public Lacteo(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}

	public Lacteo(Scanner sc){
		super(sc);
		String fragil;
		System.out.println("Introduzca el nombre del lacteo");
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio del lacteo");
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad del lacteo");
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso del lacteo");
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("Introduza el lote del lacteo");
		setLote(sc.nextLine());



		System.out.println("El embase del lacteo es fragil");
		fragil=sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}


	}

	public String volcar(){




		return "";
	}



	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public boolean envioFragil(boolean fragil){


		return eFragil;
	}

	@Override
	public void imprimir(){
		super.imprimir();

		System.out.println("lote: "+lote
				);

		if(eFragil==true){
			System.out.println("El paquete es fragil");
		}else{
			System.out.println("El paquete no es fragil");
		}

	}


}

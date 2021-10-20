package Super;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FrutaHortaliza extends Perecedero {

	private String origen;
	private double valor_iva=0.16;
	private boolean eFragil;
	private String date;

	public FrutaHortaliza(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	public FrutaHortaliza() {

	}

	public FrutaHortaliza(Scanner sc, Sentencias st){
		super(sc);
		String fragil;
		boolean repetir=true;
		System.out.println("Introduzca el nombre de la fruta o hortailza");
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio");
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad");
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso");
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("Introduza el orign");
		setOrigen(sc.nextLine());

		System.out.println("Introduzca la fecha,primero el dia, despues el mes y por ultimo el año");

		int dia = 0;
		while(repetir) {
			try {
				dia=sc.nextInt();
				if(dia>30 || dia<=0) {
					System.out.println("El dia no es correcto");
				}else {
					repetir=false;
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
				sc.next();
			}

		}

		repetir=true;
		System.out.println("Introduzca el mes");
		int mes = 0;
		while(repetir) {
			try {
				mes=sc.nextInt();
				if(mes>12 || mes<=0) {
					System.out.println("El mes no es correcto");
				}else {
					repetir=false;
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
				sc.next();
			}

		}

		repetir=true;
		System.out.println("Introduzca el año");
		int año = 0;
		while(repetir) {
			try {
				año=sc.nextInt();

				repetir=false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				sc.next();
				repetir=true;
			}

		}
		date = dia+"/"+mes+"/"+año;
		setFecha(date);


		System.out.println("La fruta u hortaliza es fragil");
		fragil=sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}
		st.insertFrutaHortaliza(getNombre(),getPrecio(),getCantidad(),getPeso(),getFecha(),getOrigen());

	}

	public String getFecha() {
		return date;
	}


	public void setFecha(String date) {
		this.date = date;
	}


	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String volcar(){
		String superVolcar=super.volcar();

		String string;

		if(eFragil==true) {
			string = superVolcar+" la fruta u hortaliza es fragil "+ "origen: "+origen+" fecha caducidad: "+getFechacad() ;
		}else {
			string = superVolcar+" la fruta u hortaliza no es fragil "+ "origen: "+origen+" fecha caducidad: "+getFechacad()  ;

		}
		return string;

	}

	@Override
	public void imprimir(){
		super.imprimir();
		System.out.println("origen: "+origen);
		if(eFragil==true){
			System.out.println("El paquete es fragil");
		}else{
			System.out.println("El paquete no es fragil");
		}

	}

	public boolean envioFragil(boolean fragil){


		return eFragil;
	}

	public void calcularPrecioEnvio(){

	}




}

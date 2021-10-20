package Super;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lacteo extends Perecedero {

	private String lote;
	private double valor_iva=0.04;
	private String date;
	private boolean eFragil;


	public Lacteo(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	
	public Lacteo() {
		
	}

	public Lacteo(Scanner sc, Sentencias st){
		super(sc);
		boolean repetir=true;
		System.out.println("Introduzca el nombre del lacteo ");
		setNombre(sc.nextLine());

		System.out.println("Introduzca el precio del lacteo");
		setPrecio(sc.nextDouble());

		System.out.println("Introduzca la cantidad del lacteo");
		setCantidad(sc.nextInt());

		System.out.println("Introduzca el peso del lacteo");
		setPeso(sc.nextDouble());

		sc.nextLine();

		System.out.println("Introduzca el lote del lacteo");
		setLote(sc.nextLine());
		
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
		System.out.println("La botella o lata es fragil");
		String fragil = sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}
		
		st.insertLacteo(getNombre(),getPrecio(),getCantidad(),getPeso(),getFecha(),getLote());
	}

	public String volcar(){
		String superVolcar=super.volcar();

		String string;

		if(eFragil==true) {
			string = superVolcar+" el embase es fragil "+ "lote: "+lote+" fecha caducidad: "+getFechacad() ;
		}else {
			string = superVolcar+" el embase no es fragil "+ "lote: "+lote+" fecha caducidad: "+getFechacad()  ;

		}
		return string;
	}

	public String getFecha() {
		return date;
	}


	public void setFecha(String date) {
		this.date = date;
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

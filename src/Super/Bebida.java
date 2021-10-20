package Super;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bebida extends Perecedero {

	private String graduaciom;
	private String date;
	private double valor_iva=0.16;
	private boolean eFragil=false;


	public Bebida(int codigo, String nombre, double precio, int cantidad, double peso) {
		super(codigo, nombre, precio, cantidad, peso);
		// TODO Auto-generated constructor stub
	}
	
	public Bebida() {
		
	}


	public Bebida(Scanner sc, Sentencias st){
		super(sc);
		int dia = 0;
		int mes=0;
		int año=0;
		boolean repetir=true;
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
		
		System.out.println("Introduzca la fecha,primero el dia, despues el mes y por ultimo el año");
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
		date=dia+"/"+mes+"/"+año;
		setFecha(date);
		System.out.println("La botella o lata es fragil");
		fragil=sc.nextLine();
		if(fragil.equalsIgnoreCase("si")){
			eFragil=true;
		}else{
			eFragil=false;
		}
		
		st.insertBebida(getNombre(),getPrecio(),getCantidad(),getPeso(),getFecha(),getGraduaciom());
	}


	public String getGraduaciom() {
		return graduaciom;
	}


	public void setGraduaciom(String graduaciom) {
		this.graduaciom = graduaciom;
	}
	
	public String getFecha() {
		return date;
	}


	public void setFecha(String date) {
		this.date = date;
	}


	public String volcar(){
		String superVolcar=super.volcar();

		String string;

		if(eFragil==true) {
			string = superVolcar+" la botella es fragil "+ "graduacion: "+graduaciom+" fecha caducidad: "+getFechacad() ;
		}else {
			string = superVolcar+" la lata no es fragil "+ "graduacion: "+graduaciom+" fecha caducidad: "+getFechacad()  ;

		}
		return string;
	}

	@Override
	public void imprimir(){
		super.imprimir();
		System.out.println("graduaccion: "+graduaciom);
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

package Super;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Sentencias {



	public void insertBebida(String name, double precio,int cantidad,double peso,String date,String graduacion ) {
		String sql ="INSERT INTO bebida(nombre, precio, cantidad, peso,fecha, graduacion)VALUES(?, ?,?, ?,?, ?)";


		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setDouble(2, precio);
			pstmt.setInt(3, cantidad);
			pstmt.setDouble(4, peso);
			pstmt.setString(5,date);
			pstmt.setString(6, graduacion);


			pstmt.executeUpdate();
			System.out.println("Se ha insetdado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void insertHerramienta(String name, double precio,int cantidad,double peso,double tarifaEnvio) {
		String sql ="INSERT INTO herramienta(nombre, precio, cantidad, peso, tarifaEnvio)VALUES(?,?,?,?,?)";



		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {


			pstmt.setString(1, name);
			pstmt.setDouble(2, precio);
			pstmt.setInt(3, cantidad);
			pstmt.setDouble(4, peso);
			pstmt.setDouble(5,tarifaEnvio);



			pstmt.executeUpdate();
			System.out.println("Se ha insetdado correctamente");
		} catch (SQLException e) {
			System.out.println(e.getMessage());


		}


	}

	public void insertOtros(String name, double precio,int cantidad,double peso,String categorias) {
		String sql ="INSERT INTO otros(nombre, precio, cantidad, peso, categorias)VALUES(?,?,?,?,?)";



		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {


			pstmt.setString(1, name);
			pstmt.setDouble(2, precio);
			pstmt.setInt(3, cantidad);
			pstmt.setDouble(4, peso);
			pstmt.setString(5,categorias);



			pstmt.executeUpdate();
			System.out.println("Se ha insetdado correctamente");
		} catch (SQLException e) {
			System.out.println(e.getMessage());


		}


	}

	public void insertLacteo(String name, double precio,int cantidad,double peso,String date,String lote ) {
		String sql ="INSERT INTO lacteo(nombre, precio, cantidad, peso,fecha, lote)VALUES(?, ?,?, ?,?, ?)";


		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setDouble(2, precio);
			pstmt.setInt(3, cantidad);
			pstmt.setDouble(4, peso);
			pstmt.setString(5,date);
			pstmt.setString(6, lote);


			pstmt.executeUpdate();
			System.out.println("Se ha insetdado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void insertFrutaHortaliza(String name, double precio,int cantidad,double peso,String date,String origen ) {
		String sql ="INSERT INTO frutaHortaliza(nombre, precio, cantidad, peso,fecha, origen)VALUES(?, ?,?, ?,?, ?)";


		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setDouble(2, precio);
			pstmt.setInt(3, cantidad);
			pstmt.setDouble(4, peso);
			pstmt.setString(5,date);
			pstmt.setString(6, origen);


			pstmt.executeUpdate();
			System.out.println("Se ha insetdado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}



	}

	public void actualizarLacteo(int cant,int id) {
		String sql ="UPDATE lacteo SET cantidad=? where codigo=?";

		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cant);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();
			System.out.println("Se ha actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void actualizarBebida(int cant,int id) {
		String sql ="UPDATE bebida SET cantidad=? where codigo=?";

		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cant);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();
			System.out.println("Se ha actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void actualizarHerramienta(int cant,int id) {
		String sql ="UPDATE herramienta SET cantidad=? where codigo=?";

		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cant);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();
			System.out.println("Se ha actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void actualizarFrutaHortaliza(int cant,int id) {
		String sql ="UPDATE frutaHortaliza SET cantidad=? where codigo=?";

		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cant);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();
			System.out.println("Se ha actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}

	public void actualizarOtro(int cant,int id) {
		String sql ="UPDATE otro SET cantidad=? where codigo=?";

		try (Connection conn = Conection.connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, cant);
			pstmt.setInt(2, id);

			pstmt.executeUpdate();
			System.out.println("Se ha actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}

	}



	public ResultSet cargarFrutas() {
		String sql="select codigo,nombre,precio,cantidad,peso,fecha,origen from frutaHortaliza";
		ResultSet rFruta = null;
		Connection conn = Conection.connect();
		PreparedStatement pstmt;
		try  {
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			rFruta=result;
			
			

		}catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return rFruta;
	}
	
	public ResultSet cargarHerramientas() {
		String sql="select codigo,nombre,precio,cantidad,peso from herramienta";
		ResultSet rHerramienta = null;
		Connection conn = Conection.connect();
		PreparedStatement pstmt;
		try  {
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			rHerramienta=result;
			
			

		}catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return rHerramienta;
	}
	
	public ResultSet cargarOtros() {
		String sql="select codigo,nombre,precio,cantidad,peso,categoria from otro";
		ResultSet rOtro = null;
		Connection conn = Conection.connect();
		PreparedStatement pstmt;
		try  {
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			rOtro=result;
			
			

		}catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return rOtro;
	}
	
	public ResultSet cargarBebidas() {
		String sql="select codigo,nombre,precio,cantidad,peso,fecha,graduacion from bebida";
		ResultSet rBebida = null;
		Connection conn = Conection.connect();
		PreparedStatement pstmt;
		try  {
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			rBebida=result;
			
			

		}catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return rBebida;
	}
	
	public ResultSet cargarLacteos() {
		String sql="select codigo,nombre,precio,cantidad,peso,fecha,lote from lacteo";
		ResultSet rLacteo = null;
		Connection conn = Conection.connect();
		PreparedStatement pstmt;
		try  {
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			rLacteo=result;
			
			

		}catch (SQLException e) {
			System.out.println(e.getMessage());

		}

		return rLacteo;
	}


}


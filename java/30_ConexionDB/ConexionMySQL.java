package Database;

import java.sql.*;

public class ConexionMySQL {

	public static void main(String[] args) {
		try {
	           Class.forName("com.mysql.cj.jdbc.Driver");
	           String url = "jdbc:mysql://127.0.0.1:3306/sakila";
	           Connection conn = DriverManager.getConnection(url,"root","1234");
	           Statement stmt = conn.createStatement();
	       
	           ResultSet rs;
	       
	           rs = stmt.executeQuery("SELECT title, description FROM film");
	           while ( rs.next() )
	           {
	               String nombre = rs.getString("title");
	               System.out.print(nombre);
	               System.out.print(" ---> ");
	               String sinopsis = rs.getString("description");
	               System.out.println(sinopsis);
	           }
	           conn.close();
	       } catch (Exception e) {
	               System.err.println("Got an exception! ");
	               System.err.println(e.getMessage());
	       }    
	}

}
/*
Ejemplo de UPADTE:
import java.sql.*;

public class Query1 {

   public static void main(String[] args) {
   
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://127.0.0.1:3309/flotacolonial";
Connection conn = DriverManager.getConnection(url,"root","joyfe");
Statement stmt = conn.createStatement();

// create the java mysql update preparedstatement
String query = "update colonia set nombre = ? where nombre LIKE ?";
PreparedStatement preparedStmt = conn.prepareStatement(query);
preparedStmt.setString(1, "Gemmenon");
preparedStmt.setString(2, "Gemenon");

// execute the java preparedstatement
preparedStmt.executeUpdate();
conn.close();
} catch (Exception e) {
System.err.println("Got an exception! ");
System.err.println(e.getMessage());
}
   }
}

Ejemplo de llamada a PA desde Java:
import java.sql.*;

public class Query1 {

   public static void main(String[] args) {
   
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://127.0.0.1:3309/sakila";
Connection conn = DriverManager.getConnection(url,"cliente","1234");


CallableStatement cs = conn.prepareCall("{call Registrar(?, ?, ?, ?, ?, ?, ?, ?)}");

//PREPARO LOS PARAMETROS DE ENTRADA CON SU VALOR
cs.setString(1, "Guille");
cs.setString(2, "PT");
cs.setInt(3, 1);
cs.setString(4, "algo@algo.es");
cs.setInt(5, 1);
cs.setString(6, "guille");
cs.setString(7, "1234");

//PREPARO LOS PARAMETROS DE SALIDA PARA RECIBIR UN VALOR
cs.registerOutParameter(8, Types.INTEGER);

cs.execute();

Integer resultado = (Integer) cs.getObject(8, Integer.class);
cs.close();
conn.close();
} catch (Exception e) {
System.err.println("Got an exception! ");
System.err.println(e.getMessage());
}
   }
}*/
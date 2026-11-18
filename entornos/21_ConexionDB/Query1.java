package Database;

import java.sql.*;

public class Query1 {

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
       }    }
}
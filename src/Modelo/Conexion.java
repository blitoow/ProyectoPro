
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     private static String servidor="jdbc:mysql://88.26.202.99:3306/dam31_ProyectoBasket";
        private static String user="dam31";
        private static String pass="califatus333";
        private static String driver="com.mysql.jdbc.Driver";
        private static Connection conexion;
        
        public Conexion(){
            
            try{
                Class.forName(driver);
                conexion= DriverManager.getConnection(servidor,user, pass);
                System.out.println("Conexión realizada con éxito");
            } catch (ClassNotFoundException | SQLException e){
                e.printStackTrace();
                System.out.println("Conexión fallida.");
            }
        }
        
        public Connection getConnection(){
            return conexion;
        }
    
}

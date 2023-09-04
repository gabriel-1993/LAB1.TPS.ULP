package obrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Obrador {

    public static void main(String[] args) {

        try {
            //Cargo los drivers en el try para prevenir algun error 
            Class.forName("org.mariadb.jdbc.Driver");
            //Conexion a la Base de Datos: en el url -> mariadb (es el driver que utilizamos para conectar java a BD)
          Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obrador2023", "root","");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Drivers" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }
    }

}

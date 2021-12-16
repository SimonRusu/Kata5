package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Simon
 */

public class CrearTabla {

    public static void createNewTable() {

        String url = "jdbc:sqlite:.\\src\\kata5\\Prueba.db";
        String sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n"
                + " id integer PRIMARY KEY AUTOINCREMENT,\n"
                + " direccion text NOT NULL);";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) 
        {
            stmt.execute(sql);
            System.out.println("Tabla creada");
            
        } 
        
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createNewTable();
    }
}

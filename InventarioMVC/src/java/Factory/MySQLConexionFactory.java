
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public final class MySQLConexionFactory extends conexionBD{

    
    public MySQLConexionFactory(String[] criterios){
    this.parametros = criterios;
    this.open();
    }
    
    @Override
    public Connection open() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]);
        }catch(Exception ex){
       ex.printStackTrace();
        }
        return this.conexion;
    }
    
    
}

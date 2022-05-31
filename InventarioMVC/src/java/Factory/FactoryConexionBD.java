
package Factory;

public class FactoryConexionBD {
    public static final int MySQL = 1;
    public static String[] configMySQL = {"bd_inventario", "root", ""};
    
    public static conexionBD open(int tipoBD){
    switch(tipoBD){
        case FactoryConexionBD.MySQL:
        return new MySQLConexionFactory(configMySQL);
        default:
            return null;
    }
}
    
}

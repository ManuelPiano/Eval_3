
package DAO;

import Model.Categoria;
import java.util.List;
import Factory.conexionBD;
import Factory.FactoryConexionBD;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class categoriaDAOImplementar implements categoriaDAO{
    
    conexionBD conn;
    
    public categoriaDAOImplementar(){
    this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
    }
    
    

    @Override
    public List<Categoria> Listar() {
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_categoria;");
        List<Categoria> lista = new ArrayList<Categoria>();
    try{
        ResultSet resultadoSQL = this.conn.consultasSQL(miSQL.toString());
        while(resultadoSQL.next()){
        Categoria categoria = new Categoria();
        categoria.setId_categoria(resultadoSQL.getInt("id_categoria"));
        categoria.setNom_categoria(resultadoSQL.getString("nom_categoria"));
        categoria.setEstado_categoria(resultadoSQL.getInt("estado_categoria"));
        }
    }catch(Exception ex){
    
    }finally{
    this.conn.cerrarConexion();
    }
    return lista;
    }

    @Override
    public List<Categoria> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria editarCat(int id_cad_edit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarCat(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarCat(int id_cat_borrar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

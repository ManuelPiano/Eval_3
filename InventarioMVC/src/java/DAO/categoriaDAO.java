
package DAO;

import Model.Categoria;
import java.util.List;

public interface categoriaDAO {
    public List<Categoria> Listar();
    public List<Categoria> Listar2();
    public Categoria editarCat(int id_cad_edit);
    public boolean guardarCat(Categoria categoria);
    public boolean borrarCat (int id_cat_borrar);

    
}


package Test;

import DAO.categoriaDAO;
import DAO.categoriaDAOImplementar;
import Model.Categoria;
import java.util.List;
public class Prueba {
    public static void main(String[] args) {
        Prueba evaluar =new Prueba();
        evaluar.listarCategorias();
    }
    public void listarCategorias(){
        categoriaDAO categoria = new categoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for(Categoria categoriaListar : listar){
            System.out.println("Id: " + categoriaListar.getId_categoria() +
                    " NOMBRE: " + categoriaListar.getNom_categoria() + 
                    " ESTADO: " + categoriaListar.getEstado_categoria());
        }
    }
}

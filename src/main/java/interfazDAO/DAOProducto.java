package interfazDAO;

import java.util.List;
import tablas.TablaProducto;

public interface DAOProducto {

    public void registrar(TablaProducto producto) throws Exception;

    public void eliminar(int productoId) throws Exception;

    public void modificar(TablaProducto producto) throws Exception;

    public List<TablaProducto> listar() throws Exception;
    
    public List<TablaProducto> buscar(String nema) throws Exception;
    
    public TablaProducto getUserById(int userId) throws Exception;
    
    

}

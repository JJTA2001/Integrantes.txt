
package interfaces;

import integrantes.Integrantes.proveedor;
import java.util.List;

public interface crud_proveedor {
    public List listarproveedor();
    public proveedor buscarproveedor(int idproveedor);
    public boolean agregarproveedor(proveedor proveedor);
    public boolean editarproveedor(proveedor proveedor);
    public boolean eliminarproveedor(int idproveedor);
    
}

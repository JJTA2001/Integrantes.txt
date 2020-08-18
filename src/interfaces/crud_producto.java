
package interfaces;

import integrantes.Integrantes.producto;
import java.util.List;


public interface crud_producto {
    public List listarproducto();
    public producto buscarproducto(int idproducto);
    public boolean agregarproducto(producto producto);
    public boolean editarproducto(producto producto);
    public boolean eliminarproducto(int idproducto);
    
}

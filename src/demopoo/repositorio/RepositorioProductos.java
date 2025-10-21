package demopoo.repositorio;

import demopoo.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProductos {
    private final List<Producto> productos = new ArrayList<>();

    public boolean agregar(Producto p) {
        if (p == null) return false;
        // Evita duplicados por id (opcional)
        if (buscarPorId(p.getId()) != null) return false;
        return productos.add(p);
    }

    public Producto buscarPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public boolean eliminar(String id) {
        Producto p = buscarPorId(id);
        return (p != null) && productos.remove(p);
    }

    public List<Producto> listar() {
        return new ArrayList<>(productos); // copia de seguridad
    }

    public int total() { return productos.size(); }
}

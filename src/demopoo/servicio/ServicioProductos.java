package demopoo.servicio;


import demopoo.modelo.Producto;
import demopoo.repositorio.RepositorioProductos;
import java.util.List;

public class ServicioProductos {
    private final RepositorioProductos repo = new RepositorioProductos();

    public boolean registrar(Producto p) { return repo.agregar(p); }
    public boolean eliminar(String id) { return repo.eliminar(id); }
    public Producto obtener(String id) { return repo.buscarPorId(id); }
    public List<Producto> listar() { return repo.listar(); }
    public int conteo() { return repo.total(); }
}
package demopoo.modelo;

public class Ropa extends Producto {
    private String talla;
    private String material;

    public Ropa(String id, String nombre, double precio,
                String talla, String material) {
        super(id, nombre, precio);
        this.talla = talla; this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " | Talla: " + talla + " | " + material;
    }
}

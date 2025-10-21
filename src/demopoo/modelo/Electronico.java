package demopoo.modelo;

public class Electronico extends Producto {
    private String marca;
    private int garantiaMeses;

    public Electronico(String id, String nombre, double precio,
                       String marca, int garantiaMeses) {
        super(id, nombre, precio);
        this.marca = marca; this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + marca + " | Garantía: " + garantiaMeses + "m";
    }
}

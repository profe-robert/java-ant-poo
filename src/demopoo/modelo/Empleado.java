package demopoo.modelo;

public abstract class Empleado {
    private String id;
    private String nombre;
    private double sueldoBase;

    public Empleado(String id, String nombre, double sueldoBase) {
        this.id = id; this.nombre = nombre; this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() { return sueldoBase; }
    public String getNombre() { return nombre; }
    public String getId() { return id; }

    // Puedes agregar: calcularSalario() base y sobreescribir abajo
    public double calcularSalario() { return sueldoBase; }
}

package demopoo.modelo;

public class EmpleadoPorHora extends Empleado implements Bonificable {
    private int horas;
    private double tarifa;
    public EmpleadoPorHora(String id, String nombre, double sueldoBase, int horas, double tarifa) {
        super(id, nombre, sueldoBase);
        this.horas = horas; this.tarifa = tarifa;
    }
    
    // Implementación de método definido en interfáz
    @Override public double calcularBonus() { return Math.min(horas * tarifa * 0.05, 100_000); }
    
    // Método de esta clase
    @Override public double calcularSalario() { return getSueldoBase() + (horas * tarifa) + calcularBonus(); }
}
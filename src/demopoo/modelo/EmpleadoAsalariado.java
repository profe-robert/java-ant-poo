package demopoo.modelo;

public class EmpleadoAsalariado extends Empleado implements Bonificable {
    public EmpleadoAsalariado(String id, String nombre, double sueldoBase) {
        super(id, nombre, sueldoBase);
    }
    // Implementación de método definido en interfáz
    @Override public double calcularBonus() { return getSueldoBase() * 0.10; }
    
    // Método propio de esta clase
    @Override public double calcularSalario() { return getSueldoBase() + calcularBonus(); }
}
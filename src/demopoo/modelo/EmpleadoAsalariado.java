package demopoo.modelo;

public class EmpleadoAsalariado extends Empleado implements Bonificable {
    public EmpleadoAsalariado(String id, String nombre, double sueldoBase) {
        super(id, nombre, sueldoBase);
    }
    @Override public double calcularBonus() { return getSueldoBase() * 0.10; }
    @Override public double calcularSalario() { return getSueldoBase() + calcularBonus(); }
}
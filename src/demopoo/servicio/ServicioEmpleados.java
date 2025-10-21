package demopoo.servicio;

import demopoo.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioEmpleados {
    private final List<Empleado> empleados = new ArrayList<>();

    public void agregar(Empleado e) { empleados.add(e); }
    public double costoTotal() {
        double total = 0;
        for (Empleado e : empleados) total += e.calcularSalario();
        return total;
    }
    public double bonusTotal() {
        double total = 0;
        for (Empleado e : empleados) {
            if (e instanceof Bonificable b) total += b.calcularBonus();
        }
        return total;
    }
    public List<Empleado> listar() { return new ArrayList<>(empleados); }
}

package demopoo;

import demopoo.modelo.*;
import demopoo.servicio.*;
import java.util.Scanner;

public class DemoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioProductos sp = new ServicioProductos();
        ServicioEmpleados se = new ServicioEmpleados();
        Scanner sc = new Scanner(System.in);

        // Seed de datos
        sp.registrar(new Electronico("E-1","Smartphone",299990,"Acme",12));
        sp.registrar(new Ropa("R-1","Polera básica",9990,"M","Algodón"));

        se.agregar(new EmpleadoAsalariado("A-1","Ana",900000));
        se.agregar(new EmpleadoPorHora("H-1","Hugo",300000,60,6000));

        int op;
        do {
            System.out.println("""
            ===== DemoPOO EA2 =====
            1) Listar productos
            2) Agregar electrónico
            3) Eliminar producto
            4) Listar empleados + salarios
            5) Totales: salarios y bonus
            0) Salir
            """);
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1 -> sp.listar().forEach(System.out::println);
                case 2 -> {
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Nombre: "); String n = sc.nextLine();
                    System.out.print("Precio: "); double p = Double.parseDouble(sc.nextLine());
                    System.out.print("Marca: "); String m = sc.nextLine();
                    System.out.print("Garantía meses: "); int g = Integer.parseInt(sc.nextLine());
                    boolean ok = sp.registrar(new Electronico(id, n, p, m, g));
                    System.out.println(ok ? "Agregado" : "ID duplicado");
                }
                case 3 -> {
                    System.out.print("ID a eliminar: "); String id = sc.nextLine();
                    System.out.println(sp.eliminar(id) ? "Eliminado" : "No existe");
                }
                case 4 -> {
                    se.listar().forEach(e ->
                        System.out.println(e.getId()+" - "+e.getNombre()+" $"+e.calcularSalario()));
                }
                case 5 -> {
                    System.out.println("Costo total salarios: $" + se.costoTotal());
                    System.out.println("Bonus total: $" + se.bonusTotal());
                }
            }
        } while (op != 0);
        
        System.out.println("Bye!");
    }
    
}

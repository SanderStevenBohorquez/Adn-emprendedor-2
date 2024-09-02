import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el costo de materiales (en USD): ");
        double costoMateriales = scanner.nextDouble();

        System.out.print("Ingrese el costo de mano de obra (en USD): ");
        double costoManoDeObra = scanner.nextDouble();

        System.out.print("Ingrese los gastos generales (en USD): ");
        double gastosGenerales = scanner.nextDouble();

        System.out.print("Ingrese el margen de beneficio deseado (en porcentaje, por ejemplo, 20 para 20%): ");
        double margenBeneficio = scanner.nextDouble();

        double costoTotalProduccion = costoMateriales + costoManoDeObra + gastosGenerales;

        double precioVenta = costoTotalProduccion * (1 + (margenBeneficio / 100));

        System.out.println("\n--- Resumen de Costos y Precio de Venta ---");
        System.out.println("Costo Total de Producción: $" + costoTotalProduccion);
        System.out.println("Margen de Beneficio: " + margenBeneficio + "%");
        System.out.println("Precio de Venta: $" + precioVenta);
    }
} 
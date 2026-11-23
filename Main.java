public class Main {

    public static void main(String[] args) {

        TanqueReserva tanque = new TanqueReserva(1000, 200);

        System.out.println("=== Estado inicial ===");
        System.out.println(tanque.obtenerEstado());

        System.out.println("\n=== Ingresos de agua ===");
        tanque.llenar(300);
        System.out.println(tanque.obtenerEstado());

        System.out.println("\n=== Ingreso excedente ===");
        tanque.llenar(800);
        tanque.llenar(100);
        System.out.println(tanque.obtenerEstado());

        System.out.println("\n=== Extracciones ===");
        tanque.consumir(400);
        System.out.println(tanque.obtenerEstado());

        System.out.println("\n=== Extracción excedente ===");
        tanque.consumir(900);
        tanque.consumir(600);
        tanque.consumir(10);
        System.out.println(tanque.obtenerEstado());

        System.out.println("\n=== Valores inválidos ===");
        tanque.llenar(-50);
        tanque.consumir(0);
        tanque.llenar(Double.NaN);

        System.out.println("\n=== Estado final ===");
        System.out.println(tanque.obtenerEstado());
        System.out.println("Nivel consultado con getter: " + tanque.getNivelActual() + " L");
    }
}
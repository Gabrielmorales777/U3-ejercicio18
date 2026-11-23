public class TanqueReserva {

    private final double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima, double nivelInicial) {
        if (!esNumeroValido(capacidadMaxima) || capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser un número mayor a 0.");
        }
        if (!esNumeroValido(nivelInicial) || nivelInicial < 0 || nivelInicial > capacidadMaxima) {
            throw new IllegalArgumentException("El nivel inicial debe estar entre 0 y la capacidad máxima.");
        }
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = nivelInicial;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public boolean llenar(double litros) {
        if (!validarLitros(litros)) {
            return false;
        }
        double espacioDisponible = capacidadMaxima - nivelActual;
        if (espacioDisponible == 0) {
            System.out.println("El tanque ya está lleno: no ingresó agua.");
            return false;
        }
        if (litros > espacioDisponible) {
            double desbordados = litros - espacioDisponible;
            nivelActual = capacidadMaxima;
            System.out.println("Tanque lleno: ingresaron " + espacioDisponible + " L y se desbordaron "
                    + desbordados + " L. Nivel actual: " + nivelActual + " L.");
        } else {
            nivelActual += litros;
            System.out.println("Llenando: +" + litros + " L. Nivel actual: " + nivelActual + " L.");
        }
        return true;
    }

    public boolean consumir(double litros) {
        if (!validarLitros(litros)) {
            return false;
        }
        if (litros > nivelActual) {
            System.out.println("Error: no hay agua suficiente. Solicitado: " + litros
                    + " L | Disponible: " + nivelActual + " L.");
            return false;
        }
        nivelActual -= litros;
        if (nivelActual == 0) {
            System.out.println("Consumo registrado: -" + litros + " L. El tanque quedó vacío.");
        } else {
            System.out.println("Consumo registrado: -" + litros + " L. Nivel actual: " + nivelActual + " L.");
        }
        return true;
    }

    public String obtenerEstado() {
        double porcentaje = nivelActual / capacidadMaxima * 100;
        return "Tanque | Nivel: " + nivelActual + " L de " + capacidadMaxima + " L (" + porcentaje + "%)";
    }

    private boolean validarLitros(double litros) {
        if (!esNumeroValido(litros)) {
            System.out.println("Error: el valor ingresado no es un número válido.");
            return false;
        }
        if (litros <= 0) {
            System.out.println("Error: los litros deben ser un número mayor a 0 (se ingresó " + litros + ").");
            return false;
        }
        return true;
    }

    private boolean esNumeroValido(double valor) {
        return !Double.isNaN(valor) && !Double.isInfinite(valor);
    }
}
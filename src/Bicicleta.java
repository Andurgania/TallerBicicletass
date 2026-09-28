public abstract class Bicicleta {
    private String codigoBicicleta;
    private int anioFabricacion;
    private double peso;

    public abstract double calcularCostoMantencion();

    public Bicicleta(String codigoBicicleta, int anioFabricacion, double peso) {
        this.codigoBicicleta = codigoBicicleta;
        this.anioFabricacion = anioFabricacion;
        this.peso = peso;
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPeso() {
        return peso;
    }
    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null || codigoBicicleta.isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser nulo ni vacío.");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 2000 || anioFabricacion > 2026) {
            throw new IllegalArgumentException("El año debe estar entre 2000 y 2026.");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Código: " + codigoBicicleta + " | Año: " + anioFabricacion;
    }
}
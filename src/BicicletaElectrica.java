public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private double autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigoBicicleta, int anioFabricacion, double peso, double autonomiaKm, boolean bateriaCertificada) {
        super(codigoBicicleta, anioFabricacion, peso);
        this.autonomiaKm = autonomiaKm;
        this.bateriaCertificada = bateriaCertificada;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        if (autonomiaKm <= 0) {
            throw new IllegalArgumentException("La autonomía debe ser mayor que cero.");
        }
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }
    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendida = true;
    }
    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;
        if (!bateriaCertificada) {
            costo = costo * 1.25;
        }
        return costo;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Autonomía: " + autonomiaKm + " km" +
                " | Batería certificada: " + (bateriaCertificada ? "Sí" : "No") +
                " | Garantía extendida: " + (garantiaExtendida ? "Sí" : "No") +
                " | Costo mantención: $" + calcularCostoMantencion();
    }
}

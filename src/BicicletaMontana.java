public class BicicletaMontana extends Bicicleta {
    private int cantidadSuspensiones;

    public BicicletaMontana(String codigoBicicleta, int anioFabricacion, double peso, int cantidadSuspensiones) {
        super(codigoBicicleta, anioFabricacion, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }
    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (cantidadSuspensiones > 1) {
            costo = costo * 1.15;
        }
        return costo;
    }
    @Override
    public String toString() {
        return super.toString() +
                " | Suspensiones: " + cantidadSuspensiones +
                " | Costo mantención: $" + calcularCostoMantencion();
    }
}
public class Main {
    public static void main(String[] args) {

        // Crear bicicletas eléctricas
        BicicletaElectrica be1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica be2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);

        // Crear bicicletas de montaña
        BicicletaMontana bm1 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);
        BicicletaMontana bm2 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);

        // Activar garantía extendida a BIC-E01
        be1.activarGarantiaExtendida();

        // Crear gestor y registrar todas las bicicletas
        GestorTaller gestor = new GestorTaller();
        gestor.registrarBicicleta(be1);
        gestor.registrarBicicleta(be2);
        gestor.registrarBicicleta(bm1);
        gestor.registrarBicicleta(bm2);

        // Listar todas
        gestor.listarBicicletas();

        // Buscar por código
        System.out.println("\n=== Búsqueda BIC-E01 ===");
        for (Bicicleta b : gestor.buscarPorCodigo("BIC-E01")) {
            System.out.println(b.toString());
        }
    }
}
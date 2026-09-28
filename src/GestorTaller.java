import java.util.ArrayList;

public class GestorTaller {

    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.println("Bicicleta " + bicicleta.getCodigoBicicleta() + " registrada correctamente.");
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> resultado = new ArrayList<>();
        for (Bicicleta b : bicicletas) {
            if (b.getCodigoBicicleta().equals(codigo)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public void listarBicicletas() {
        System.out.println("=== Bicicletas registradas ===");
        for (Bicicleta b : bicicletas) {
            System.out.println(b.toString());
        }
    }
}
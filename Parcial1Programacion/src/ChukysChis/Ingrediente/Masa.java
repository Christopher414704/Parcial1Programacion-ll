package ChukysChis.Ingrediente;

public class Masa implements Ingrediente{
    String tipo = "Suave";
    int cantidad = 20;

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

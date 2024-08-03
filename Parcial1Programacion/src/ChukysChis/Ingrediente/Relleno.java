package ChukysChis.Ingrediente;

public class Relleno implements Ingrediente{
    String sabor = "Dulce";
    int cantidad = 15;

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

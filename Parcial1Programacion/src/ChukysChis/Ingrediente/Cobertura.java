package ChukysChis.Ingrediente;

public class Cobertura implements Ingrediente{
    String tipo = "Dulce";
    int cantidad = 5;

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

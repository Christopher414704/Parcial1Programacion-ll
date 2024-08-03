package ChukysChis.Postre;

public class Brownie extends Postre{
    String tipoChocolate = "Holandes";

    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void servir() {
        super.servir();
    }

    public String getTipoChocolate(){
        return tipoChocolate;
    }

    @Override
    public String getNombre() {
        return "Brownie";
    }

    @Override
    public String getTamano() {
        return "Pequeño";
    }

    @Override
    public double getPrecio() {
        return 20;
    }
}

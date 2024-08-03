package ChukysChis.Postre;

public class Pastel extends Postre{
    String sabor = "Dulce";

    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void servir() {
        super.servir();
    }

    public String getSabor(){
        return sabor;
    }

    @Override
    public String getNombre() {
        return "Pastel";
    }

    @Override
    public String getTamano() {
        return "Pequeño";
    }

    @Override
    public double getPrecio() {
        return 15;
    }
}
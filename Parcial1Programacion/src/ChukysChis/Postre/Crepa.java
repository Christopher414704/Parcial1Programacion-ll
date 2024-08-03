package ChukysChis.Postre;

public class Crepa extends Postre{
    String tipoMasa = "Suave";

    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void servir() {
        super.servir();
    }

    public String getTipoMasa(){
        return tipoMasa;
    }

    @Override
    public String getNombre() {
        return "Crepa";
    }

    @Override
    public String getTamano() {
        return "Grande";
    }

    @Override
    public double getPrecio() {
        return 15;
    }
}

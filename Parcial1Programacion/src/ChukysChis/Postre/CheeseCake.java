package ChukysChis.Postre;

public class CheeseCake extends Postre{
    String tipoQueso = "Italiano";

    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void servir() {
        super.servir();
    }

    public String getTipoQueso(){
        return tipoQueso;
    }

    @Override
    public String getNombre() {
        return "CheeseCake";
    }

    @Override
    public String getTamano() {
        return "Pequeño";
    }

    @Override
    public double getPrecio() {
        return 5;
    }
}

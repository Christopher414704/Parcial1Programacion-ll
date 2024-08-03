package ChukysChis.Postre;

public abstract class Postre {
    String nombre = "Cheese";
    String tamano = "Grande";
    double precio;


    public void preparar(){
        return;
    }
    public void servir(){
        return;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTamano(){
        return tamano;
    }

    public double getPrecio(){
        return precio;
    }

}

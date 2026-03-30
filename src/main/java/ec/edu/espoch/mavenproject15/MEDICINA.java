package ec.edu.espoch.mavenproject15;
public class MEDICINA {
    public int idmedicamento;
    public String nombremedicamento;
    public int disponible;
    
        public boolean hayStack(int cantidad) {
        return disponible >= cantidad;
    }

    public boolean reducirStock(int cantidad) {
        if (disponible >= cantidad) {
            disponible -= cantidad;
            return true;
        }
        return false;
    }
}

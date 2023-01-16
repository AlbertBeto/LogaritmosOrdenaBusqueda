public class EntradaTelefono {

    private String nombre;
    private int numero;

    public EntradaTelefono(String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}

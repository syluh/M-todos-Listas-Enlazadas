public class Nodo {
    Persona cliente;
    Nodo sig;

    public Nodo(int id,String name, String addres, int age) {
        this.cliente = new Persona(id,name,addres,age);
        this.sig = null;
    }
}

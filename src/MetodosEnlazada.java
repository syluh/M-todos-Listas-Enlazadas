import java.util.Scanner;
public class MetodosEnlazada {
    Scanner entrada = new Scanner(System.in);
    Nodo head;

    public MetodosEnlazada() {
        this.head = null;
    }
    public int menu(){
        System.out.println("                                ");
        System.out.println("Insertar Inicio              [1]");
        System.out.println("Insertar Final               [2]");
        System.out.println("Insertar Ordenado            [3]");
        System.out.println("Presentar                    [4]");
        System.out.println("Modificar                    [5]");
        System.out.println("Presentar Invertido          [6]");
        System.out.println("Eliminar un elemento         [7]");
        System.out.println("Salir                        [0]");
        return entrada.nextInt();

    }

    public boolean listaVacia(){

        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public void insertarF(int id,String name,String addres,int age ){
        Nodo nuevo = new Nodo(id,name,addres,age);
        if (listaVacia()){
            head = nuevo;
        }else{
            Nodo actual = head;
            while(actual.sig != null)
                actual = actual.sig;
            actual.sig = nuevo;
        }
    }
    public void insertarI(int id,String name,String addres,int age ){
        Nodo nuevo = new Nodo(id,name,addres,age);
        if (listaVacia()){
            head = nuevo;
        }else{
            nuevo.sig = head;
            head = nuevo;
        }
    }
    public void insertarO(int id,String name,String addres,int age ){
        Nodo nuevo = new Nodo(id,name,addres,age);
        if (listaVacia()){
            head = nuevo;
        }else{
            if(id < head.cliente.id){
                nuevo.sig = head;
                head = nuevo;
            }else{
                Nodo actual = head;
                while((actual.sig != null)&&(id < actual.sig.cliente.id)){
                    actual = actual.sig;
                }
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
            }
        }
    }

    public void presentar(){
        Nodo actual = head;
        while( actual != null ){
            System.out.print("id: "+actual.cliente.id+" edad: "+actual.cliente.age+" dirección: "
                    +actual.cliente.addres+ " nombre: "+actual.cliente.name+ " --> ");
            actual = actual.sig;
        }
    }
     public Nodo buscar(int num) {
        Nodo actual = head;
        while ((actual != null) && (actual.cliente.id != head.cliente.id)) {
            actual = actual.sig;
        }
        return actual;
    }
    public void modificar(int num) {
        Nodo actual = buscar(num);
        if (actual == null) {
            System.out.println("No existe...");
        } else {
            int newNum;
            System.out.println("Ingrese el nuevo valor de la id: ");
            newNum = entrada.nextInt();
            actual.cliente.id = newNum;
        }
    }
    public void presentarI(Nodo X){
        if(X.sig != null){
            presentarI(X.sig);
        }
        System.out.print(X.cliente.id+", ");
    }
    public void eliminar(int num){
        Nodo actual = head;
        if (listaVacia()){
            System.out.println("No hay elementos para eliminar ...");
        } else if(actual.cliente.id == num){
            head = head.sig;
        } else {
            while (actual.sig != null && actual.sig.cliente.id != num){
                actual = actual.sig;
            }
            if(actual.sig == null){
                System.out.println("El elemento no existe");
            }else {
                actual.sig = actual.sig.sig;
            }
        }
    }
}

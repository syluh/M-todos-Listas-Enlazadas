public class Demo01 {
    public static void main(String[] args) {
        MetodosEnlazada myLista = new MetodosEnlazada();
        int opc,id,age,num;
        String name,addres;
        do{
            opc = myLista.menu();
            switch (opc){
                case 1:
                    System.out.println("Ingrese la id del cliente: ");
                    id = myLista.entrada.nextInt();
                    System.out.println("Ingrese el nombre del cliente: ");
                    name = myLista.entrada.next();
                    System.out.println("Ingrese la dirección del cliente: ");
                    addres = myLista.entrada.next();
                    System.out.println("Ingrese la edad del cliente: ");
                    age = myLista.entrada.nextInt();
                    myLista.insertarI(id,name,addres,age);
                    break;
                case 2:
                    System.out.println("Ingrese la id del cliente: ");
                    id = myLista.entrada.nextInt();
                    System.out.println("Ingrese el nombre del cliente: ");
                    name = myLista.entrada.next();
                    System.out.println("Ingrese la dirección del cliente: ");
                    addres = myLista.entrada.next();
                    System.out.println("Ingrese la edad del cliente: ");
                    age = myLista.entrada.nextInt();
                    myLista.insertarF(id,name,addres,age);
                    break;
                case 3:
                    System.out.println("Ingrese la id del cliente: ");
                    id = myLista.entrada.nextInt();
                    System.out.println("Ingrese el nombre del cliente: ");
                    name = myLista.entrada.next();
                    System.out.println("Ingrese la dirección del cliente: ");
                    addres = myLista.entrada.next();
                    System.out.println("Ingrese la edad del cliente: ");
                    age = myLista.entrada.nextInt();
                    myLista.insertarO(id,name,addres,age);
                    break;
                case 4: myLista.presentar();
                    break;
                case 5:
                    System.out.println("Ingrese la id que se quiera modificar: ");
                    id = myLista.entrada.nextInt();
                    myLista.modificar(id);
                    break;
                case 6: myLista.presentarI(myLista.head);
                    break;
                case 7:
                    System.out.println("Ingrese el id a eliminar");
                    num = myLista.entrada.nextInt();
                    myLista.eliminar(num);
                    break;
                default: break;
            }
        }while(opc != 0);
    }
}

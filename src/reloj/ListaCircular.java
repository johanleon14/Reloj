package reloj;

/**
 *
 * @author Johan Leon-160003717
 */
public class ListaCircular {

    private Nodo cabeza;
    private Nodo cola;
    private int tam = 0;

    public void Lista() {
        cabeza = null;
        cola = null;
        tam = 1;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public int getTam() {
        return tam;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    //////////////////AGREGA LOS NUMEROS A UNA LISTA CIRCULAR////////////////
    public void agregarAlFinal(String i, String nombre) {
        tam++;
        Nodo nuevo = new Nodo();
        nuevo.setNumero(tam);
        nuevo.setImg(i);
        nuevo.setNombre(nombre);

        if (esVacia()) {
            cabeza = nuevo;
            cola = nuevo;
            cola.setSgte(cabeza);
        } else {
            cola.setSgte(nuevo);
            nuevo.setSgte(cabeza);
            cola = nuevo;
        }
        

    }

    public void eliminar(int ref) {

        int tamaux = 1;
            
            if (cabeza.getNumero() == ref) {
                if(ref==this.getTam()){
                    cabeza=null;
                    cola=null;
                }else{
                cabeza = cabeza.getSgte();
                cola.setSgte(cabeza);
                }

            } else {
                Nodo aux = null;
                Nodo aux2 = cabeza;

                while (tamaux != ref) {

                    aux = aux2;
                    aux2 = aux2.getSgte();
                    tamaux++;

                }
                if (cola.getNumero() == ref) {
                    cola = aux;
                    aux.setSgte(aux2.getSgte());
                    aux2.setSgte(null);
                } 
                    aux.setSgte(aux2.getSgte());
                    aux2.setSgte(null);
                
            }
            tam--;
            reorganizar();
            
        
    }

    public boolean buscar(int ref) {
        boolean flag = false;
        int tamaux = 0;
        if (cabeza.getNumero() == ref) {
            flag = true;
        } else {
            Nodo aux = cabeza;
            while (tamaux != this.getTam()) {
                if (aux.getNumero() == ref) {
                    flag = true;
                }
                tamaux++;
                aux = aux.getSgte();
            }

        }
        return flag;
    }

    public void reorganizar() {

        int tamaux = 0;

        if (this.getTam() == 1) {
            cabeza.setNumero(1);
            cola.setNumero(1);
        } else {
            Nodo aux = cabeza;
            while (tamaux != this.getTam()) {

                tamaux++;
                aux.setNumero(tamaux);
                aux = aux.getSgte();
            }
        }
    }

    ///////////////////////ORGANIZA LA LISTA CIRCULAR///////////////////////////
    public void listar() {
        if (!esVacia()) {
            int i = 0;

            int tamaux = 0;

            Nodo aux = cabeza;
            while (tamaux != this.getTam()) {
                System.out.print(i + "[ " + aux.getNumero() +aux.getNombre()+ " ]" + " ->  ");
                tamaux++;
                aux = aux.getSgte();
                i++;
            }

        }
    }
}


package semana.pkg5;

/**
 * La siguiente clase representa un arbol binario de busqueda, 
 * en el cual no existen datos repetidos y los datos se encuentran en orden, de manera que, a la izquierda 
 * de cada padre todos los datos son menores y a la derecha todos son mayores. 


public class VEDArbin {
    
    /*
    Cada arbol se compone de varios nodos en donde cada uno puede tener dos hijos y a su vez un nodo puede ser hijo de otro
    Se crea la clase NodoArbol para una mayor comprension del problema.
    */
    private class nodoArbol {
        //Cada nodo tiene un hijo izquierdo, un hijo derecho y un dato asociados
        //Cabe anotar que cada uno de los hijos es a su vez un arbol binario
        private VEDArbin hd;
        private VEDArbin hi;
        private int dato;
        
        //Constructor
        private void nodoArbol(){
            hd = null;
            hi = null;
            dato = 0;
        }

        //Getters y Setters
        public VEDArbin getHd() {
            return hd;
        }

        public VEDArbin getHi() {
            return hi;
        }

        public int getDato() {
            return dato;
        }

        public void setHd(VEDArbin hd) {
            this.hd = hd;
        }

        public void setHi(VEDArbin hi) {
            this.hi = hi;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }        
        
    }
    
    //Todo arbol tiene un nodo inicial que se denomina raiz
    public nodoArbol raiz;
 
    //Constructor
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
 
    //Metodo para saber si un arbol es vacio o no, simplemete se pregunta si el nodo raiz de ese arbol es null
    public boolean esVacio(){
        return (raiz == null);
    }
 
    
    /*
    Metodo creado solo para poder realizar pruebas del metodo 'existe' pedido en el enunciado del taller
    El metodo se encarga de insertar un dato en el arbol de acuerdo a su valor
    Si el arbol esta vacio, el dato sera la raiz del nuevo arbol
    si el dato es menor a la raiz, se inserta como hijo izquiedo, si es mayor se inserta como hijo derecho
    
    */
    
    public void insertar(int a){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = a;
            nuevo.hd = new VEDArbin();
            nuevo.hi = new VEDArbin();
            raiz = nuevo;
        }
        else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
        }
    }
    
    /*
    Este metodo se encarga de verificar si un valor entrado como parametro se encuetra en un arbol
    El metodo funciona buscando el dato inicialmente el la raiz del arbol, si el dato no se encuentra alli
    analiza si el valor es mayor o menor al contenido en la raiz, de ser menor buscar en el hijo izquierdo haciendo una llamada recursiva 
    debijo a que cada hijo de un nodo es a su vez un arbol; e ser mayor el dato buscado a la raiz, se busca en el hijo izquierdo nuevamente con una llamada recursiva
    El metodo finaliza cuando el dato es encontrado o cuando se llega a una hoja del arbol y no se encontro el dato.
    
    */
    public boolean existe(int valor){
        boolean existe;
        if (!esVacio()) {
                if (valor == raiz.dato) {
                existe= true;
                }
                else {
                    if (valor < raiz.dato) {
                        existe =raiz.hi.existe(valor);
                    }
                    else {
                        existe= raiz.hd.existe(valor);
                    }
                }
        }else{
            existe= false;
        }
        return existe;
        
    }
    
     
}

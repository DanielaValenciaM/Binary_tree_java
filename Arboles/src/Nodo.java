

/**
 * La siguiente clase representa un arbol binario de busqueda, 
 * en el cual no existen datos repetidos y los datos se encuentran en orden, de manera que, a la izquierda 
 * de cada padre todos los datos son menores y a la derecha todos son mayores. 

**/
public class Nodo {
    
    /*
    Cada arbol se compone de varios nodos en donde cada uno puede tener dos hijos y a su vez un nodo puede ser hijo de otro
    Se crea la clase NodoArbol para una mayor comprension del problema.
    */

        //Cada nodo tiene un hijo izquierdo, un hijo derecho y un dato asociados
        //Cabe anotar que cada uno de los hijos es a su vez un arbol binario
        private Nodo hd;
        private Nodo hi;
        private int dato;
        
        public Nodo (int nuevoDato) {
        	this.dato = nuevoDato;        	
        }
  
        //Getters y Setters
        public Nodo getHd() {
            return hd;
        }

        public Nodo getHi() {
            return hi;
        }

        public int getDato() {
            return dato;
        }

        public void setHd(Nodo hd) {
            this.hd = hd;
        }

        public void setHi(Nodo hi) {
            this.hi = hi;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }        
         
    //Metodo para saber si un arbol es vacio o no, simplemete se pregunta si el nodo raiz de ese arbol es null
    public boolean esVacio(){
        if (this.hi == null && this.hd == null) {
        	return true;
        } else {
        	return false;
        }
    }

    
    public void insertar(int valor){
    	
    	Nodo nodoHijo= new Nodo(valor);
    	
    	if (valor < this.dato) {
    	  if (hi != null) {
    		  hi.insertar(valor);
    	  }
    	  
    	  else { 
    		  hi = nodoHijo;
    	  }
    	}
    	  else {
    		if (hd != null) {
    			hd.insertar(valor);
    		}
    		  else {
    			  hd = nodoHijo;
    		  }
    	  }
    }

    public boolean existe(int valor){
    	boolean existeIzquierdo = false;
    	boolean existeDerecho = false;
    	
    	if (valor == this.dato) {
    		return true;
    	}
    	else {
    		if (hi!=null) {
    			existeIzquierdo = this.hi.existe(valor);
    		}
        	if (hd!=null) {
        		existeDerecho = this.hd.existe(valor);
        	}
    	}
        boolean resultado = existeIzquierdo || existeDerecho;
    	return resultado;
      }
    
    
    	public int encontrarMayores (int numero) {
    		int totalMayores = 0;
    		
    		if (numero < this.dato) {
    			totalMayores++;
    		}
    	
    		if (this.hi!=null) {
    			totalMayores = totalMayores + hi.encontrarMayores(numero);

    		}
    		if (this.hd!=null) {
    			totalMayores = totalMayores + hd.encontrarMayores(numero);

    		}
        	
        	return totalMayores;
    	}
}
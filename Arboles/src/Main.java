
public class Main {


    public static void main(String[] args) {
        
        Nodo arbolPrueba = new Nodo(11);
        arbolPrueba.insertar(4);
        arbolPrueba.insertar(5);
        arbolPrueba.insertar(2);
        arbolPrueba.insertar(7);
        arbolPrueba.insertar(3);
        arbolPrueba.insertar(1);
        arbolPrueba.insertar(9);
        arbolPrueba.insertar(10);
        arbolPrueba.insertar(8);
        
        
        System.out.println("====================Verificacion funcionamiento metodo=================");
        
        arbolPrueba.recorrerArbol();
        
//        int numero = 7;
//        int totalMayores = arbolPrueba.recorrerArbol(numero);
        
        
//        System.out.println("En total de numeros mayores es: " + totalMayores);
        
    }
    
}

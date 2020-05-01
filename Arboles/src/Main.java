
public class Semana5 {


    public static void main(String[] args) {
        
        Arbol arbolPrueba = new Arbol();
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
        System.out.println("Previamente se tiene un arbol binario cargado con los siguientes datos: 1,2,3,4,5,7,8,9,10");
        System.out.println("Incialmente se verifica existe el valor '6', lo cual es: "+ arbolPrueba.existe(6));
        System.out.println("Seguidamente se verifica existe el valor '10', lo cual es: "+ arbolPrueba.existe(10));
        System.out.println("Asi se comprueba que el metodo de busqueda funciona correctamente");
    }
    
}

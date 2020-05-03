import javax.swing.JOptionPane;

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
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nodo que desea buscar:"));
        int totalMayores = arbolPrueba.encontrarMayores(numero);
        
        System.out.println("En total de numeros mayores es: " + totalMayores);
        
    }
    
}

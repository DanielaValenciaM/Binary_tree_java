import javax.swing.*;
import java.util.*;

public class ArbolBinarioConteo {

	public static void main(String[] args) {
    	
    	//El nodo vacio corresponde a una copia de la clase VEDArbin
    	@SuppressWarnings("unused")
		VEDArbin<Integer> vacio=new VEDArbin<Integer>();
    	
    	//Se le asigna nombre y valor a cada variable que corresponden a un NODO del arbol
    	VEDArbin<Integer> raiz=new VEDArbin<Integer>();
		raiz.agregar(8);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izq=new VEDArbin<Integer>();
		izq.agregar(4);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> der=new VEDArbin<Integer> ();
		der.agregar(28);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqhijo1=new VEDArbin<Integer> ();
		izqhijo1.agregar(19);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqhijo2=new VEDArbin<Integer>();
		izqhijo2.agregar(14);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqnieto1=new VEDArbin<Integer>();
		izqnieto1.agregar(20);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqnieto2=new VEDArbin<Integer>();
		izqnieto2.agregar(7);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> izqbisnieto1=new VEDArbin<Integer>();
		izqbisnieto1.agregar(2);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derhijo1=new VEDArbin<Integer>();
		derhijo1.agregar(13);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derhijo2=new VEDArbin<Integer>();
		derhijo2.agregar(9);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> dernieto1=new VEDArbin<Integer>();
		dernieto1.agregar(24);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derbisnieto1=new VEDArbin<Integer>();
		derbisnieto1.agregar(12);//Se invoca el método agregar para asignarle un valor entero al nodo
		VEDArbin<Integer> derbisnieto2=new VEDArbin<Integer>();
		derbisnieto2.agregar(5);//Se invoca el método agregar para asignarle un valor entero al nodo
		
		System.out.println("                "+raiz.getVal());//Nivel 1 del arbol
		System.out.println("        "+izq.getVal() +"                "+der.getVal());//Nivel 2 del arbol
		System.out.println("   "+izqhijo1.getVal()+"      "+izqhijo2.getVal()+"       "+derhijo1.getVal()+"         "+derhijo2.getVal());//Nivel 3 del arbol
		System.out.println("       "+izqnieto1.getVal()+"      "+izqnieto2.getVal()+"                    "+dernieto1.getVal());//Nivel 4 del arbol
		System.out.println("            "+izqbisnieto1.getVal()+"                    "+derbisnieto1.getVal()+"      "+derbisnieto2.getVal());//Nivel 5 del arbol
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nodo que desea buscar:"));
		VEDArbin<Integer> buscar=new VEDArbin<Integer>();
		if(numero==izqhijo1.val || numero==izqnieto1.val || numero==izqbisnieto1.val || numero==izqnieto1.val || numero==izqnieto2.val || numero==izqhijo2.val || numero==izq.val || numero==derhijo1.val || numero==derbisnieto1.val || numero==derbisnieto2.val || numero==dernieto1.val || numero==derhijo2.val || numero==der.val || numero==raiz.val){
            System.out.println("EL NUMERO " + numero+ " SI ESTÁ CONTENIDO EN EL ARBOL");
        } else {
            System.out.println("EL NUMERO " + numero+ " NO ESTÁ CONTENIDO EN EL ARBOL");
        }
		
		System.out.println("El recorrido del arbol en preorden es: <"+raiz.preorden()+izq.preorden()+izqhijo1.preorden()+izqhijo2.preorden()+izqnieto1.preorden()+izqnieto2.preorden()+izqbisnieto1.preorden()+der.preorden()+derhijo1.preorden()+derhijo2.preorden()+dernieto1.preorden()+derbisnieto1.preorden()+derbisnieto2.preorden()+">");//Se invoca el metodo preorden para obtener los nodos del arbol en preorden
		System.out.println("El recorrido del arbol en inorden es: <"+izqhijo1.inorden(izqhijo1)+izq.inorden(izq)+izqnieto1.inorden(izqnieto1)+izqhijo2.inorden(izqhijo2)+izqbisnieto1.inorden(izqbisnieto1)+izqnieto2.inorden(izqnieto2)+raiz.inorden(raiz)+derhijo1.inorden(derhijo1)+der.inorden(der)+derhijo2.inorden(derhijo2)+derbisnieto1.inorden(derbisnieto1)+dernieto1.inorden(dernieto1)+derbisnieto2.inorden(derbisnieto2)+">");//Se invoca el metodo preorden para obtener los nodos del arbol en inorden
		System.out.println("El recorrido del arbol en postorden es: <"+izqhijo1.postorden()+izqnieto1.postorden()+izqbisnieto1.postorden()+izqnieto2.postorden()+izqhijo2.postorden()+izq.postorden()+derhijo1.postorden()+derbisnieto1.postorden()+derbisnieto2.postorden()+dernieto1.postorden()+derhijo2.postorden()+der.postorden()+raiz.postorden()+">");//Se invoca el metodo preorden para obtener los nodos del arbol en postorden
		
	}
}

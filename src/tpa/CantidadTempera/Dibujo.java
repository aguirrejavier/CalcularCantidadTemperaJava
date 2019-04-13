package tpa.CantidadTempera;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Stack;

public class Dibujo {
	
	private double frente;
	private double profundidad;
	private double areaTotal;
	
	static final double TEMPERA_POR_METRO = 2.5;
	
	public Dibujo(){
		this.frente = 100;
		this.profundidad = 100;
		this.areaTotal = 0;
	}
	
	public void agregarFigura(Figura dibu){
				
		areaTotal += dibu.calcularArea();
	}
	
	public void cantidadDePotes(){
		
		System.out.println("Cantidad de potes de tempera que hay que comprar es : " + Math.ceil(areaTotal/TEMPERA_POR_METRO));
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<>();
		
//		Dibujo dibujo01 = new Dibujo();
//
//		dibujo01.agregarFigura(new Circulo(2));
//		dibujo01.agregarFigura(new Cuadrado(2));
//		dibujo01.agregarFigura(new Rectangulo(3, 3));
//		
//		ArrayList<Figura> listado = new ArrayList<>();
//		
//		listado.add(new Circulo(2));
//		listado.add(new Circulo(4));
//		listado.add(new Cuadrado(5));
//		listado.add(new Rectangulo(4, 5));
//		
//		for (Figura figura : listado) {
//			
//			figura.colorFigura();
//		}
//		
//		dibujo01.cantidadDePotes();
		
		System.out.println(PI);
	    
	}

}

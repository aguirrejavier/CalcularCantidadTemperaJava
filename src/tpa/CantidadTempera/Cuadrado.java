package tpa.CantidadTempera;

public class Cuadrado extends Figura {
	
	private double  lado;
	
	public Cuadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		
		return Math.pow(lado, 2);
	}
	
	@Override
	public void colorFigura(){
		System.out.println("Es un cuadrado");
	}
	
}

package tpa.CantidadTempera;

public class Circulo extends Figura {
	
	private double radio;
	private double jeje;
	
	public Circulo(double radio) {	
		this.radio = radio;
	}

	@Override
	public double calcularArea() {

		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public void colorFigura(){
		System.out.println("Es un circulo");
	}
	
}

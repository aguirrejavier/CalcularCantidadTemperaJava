package tpa.CantidadTempera;

public class Pentagono extends Figura {

	private double apotema;
	private double lado;
	
	
	public Pentagono() {
		this.apotema=0;
		this.lado=0;
	}
	
	public Pentagono(double apotema, double lado) {
		this.apotema=apotema;
		this.lado=lado;
	}
	
	private double perimetro() {
		return this.lado*5;
	}
	
	@Override
	public double calcularArea() {
		return perimetro()*this.apotema/2;
	}
	
}
package tpa.CantidadTempera;

public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	private double calcularPerimetro() {
		return this.base *2 + this.altura*2;
	}
	@Override
	public double calcularArea() {
		
		return base * altura;
	}
	
	@Override
	public void colorFigura(){
		System.out.println("Es un rectangulo");
	}
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	

}

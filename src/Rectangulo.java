
public class Rectangulo {
  
	private PuntoGeometrico v1;
	private PuntoGeometrico v2;
	private PuntoGeometrico v3;
	private PuntoGeometrico v4;
	
	
	public Rectangulo( ) {
	 this.v1 = new PuntoGeometrico();
	 this.v2 = new PuntoGeometrico();
	 this.v3 = new PuntoGeometrico();
	 this.v4 = new PuntoGeometrico();
}
	
	public Rectangulo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
		this.v1.setCoordenadas(x1,y1);
		this.v2.setCoordenadas(x2,y2);
		this.v3.setCoordenadas(x3,y3);
		this.v4.setCoordenadas(x4,y4);
	}
	
	public void desplazarRectangulo(double x, double y) {
		this.v1.dezplazarPunto(x,y);
		this.v2.dezplazarPunto(x, y);
		this.v3.dezplazarPunto(x, y);
		this.v4.dezplazarPunto(x, y);
	}
	
	public double getArea() {
		//Base x Altura
	return (this.v1.distanciaEuclidea(this.v3) * (this.v1.distanciaEuclidea(this.v2)));
	}
	
	public int getComparacion (Rectangulo r1) {
		if (this.getArea() > r1.getArea()) 
			return 1;
		else if (this.getArea() < r1.getArea())
				return -1;
			else if (this.getArea() == r1.getArea())
				return 0;
		
	}
	
	public int asd() {
	return 1;
	}
}

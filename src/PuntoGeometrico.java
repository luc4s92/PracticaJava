
public class PuntoGeometrico {
	private double y;
	private double x;
	
	public PuntoGeometrico() {
		this.y = 0;
		this.x = 0;
	}
	
	public PuntoGeometrico(double coordenadaX, double coordenadaY) {
		this.setCoordenadas(coordenadaX,coordenadaY);
		
}
	
	public void setCoordenadas(double coordenadaX, double coordenadaY) {
		this.x = coordenadaX;
		this.y = coordenadaY;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void dezplazarPunto(double x, double y) {
		this.x += x;
		this.y += x;
	}
	
	
	
	public double distanciaEuclidea(PuntoGeometrico p1) {
		//podria recibir un punto y compararse
		return Math.sqrt( ((this.x - p1.getX())*(this.x - p1.getX())) + ((this.y - p1.getY())*(this.y - p1.getY()))) ;
	}
}

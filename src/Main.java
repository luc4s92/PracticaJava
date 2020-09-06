
public class Main {

	public static void main(String[] args) {
		PuntoGeometrico p1 = new PuntoGeometrico(2,2);
		PuntoGeometrico p2 = new PuntoGeometrico(4,4);
		System.out.println("Coordenada x: "+ p1.getX());
		System.out.println("Coordenada y: "+ p1.getY());
		System.out.println("Distancia Euclidea " + p1.distanciaEuclidea(p2));
	}

}

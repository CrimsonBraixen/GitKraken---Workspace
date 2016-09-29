package punto;

public class Punto3D extends Punto2D{
	private double z;
	
	public Punto3D(){
		super();
		z=0;
	}
	
	public Punto3D(double x, double y, double z){
		super();
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "( "+x+","+y+","+z+")";
	}
	
	public Object clone(Object punto){
		return this.clone(punto);
	}
	
	public double distanciaCon(Object punto){
		return Math.sqrt(Math.pow(x-((Punto3D)punto).x, 2) + Math.pow(y-((Punto3D)punto).y, 2) + Math.pow(z-((Punto3D)punto).z, 2));
	}
	
	@Override
	public double distanciaAlOrigen(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
	
	public void desplazamiento(Object punto){
		x += ((Punto3D)punto).x;
		y += ((Punto3D)punto).y;
		z += ((Punto3D)punto).z;
	}
	
	public boolean equals(Object punto){
		return x == ((Punto3D)punto).x && y == ((Punto3D)punto).y && z == ((Punto3D)punto).z;
	}	
}

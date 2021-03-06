package punto;

public class Punto2D implements Punto{
	protected double x;
	protected double y;
	
	public Punto2D(){
		x=0;
		y=0;
	}
	
	public Punto2D(double x, double y) {			
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "( "+x+","+y+")";
	}
	
	public Object clone(Object punto){
		return this.clone(punto);
	}
	
	public double distanciaCon(Object punto) {
		return Math.sqrt( Math.pow(this.x - ((Punto2D)punto).x, 2) + Math.pow(this.y - ((Punto2D)punto).y, 2));
	}
	
	public double distanciaAlOrigen(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public void desplazamiento(Object punto){
		x += ((Punto2D)punto).x;
		y += ((Punto2D)punto).y;
	}
	
	public boolean equals(Object punto){
		return this.x == ((Punto2D)punto).x && this.y == ((Punto2D)punto).y;
	}
}

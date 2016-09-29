package punto;

public interface Punto {
	
	public Object clone(Object punto);
	public double distanciaCon(Object punto);
	public double distanciaAlOrigen();
	public void desplazamiento(Object punto);
	public boolean equals(Object punto);
	/*
	public double getX();
	public double getY();
	public double getZ();
	public double setX(double x);
	public double setY(double y);
	public double setZ(double z);
	*/
}

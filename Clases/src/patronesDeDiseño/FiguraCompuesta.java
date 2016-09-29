package patronesDeDiseño;

import java.util.LinkedList;
import java.util.List;

public class FiguraCompuesta extends Figura{

	List<Figura> figura;
	
	public FiguraCompuesta(){
		figura = new LinkedList<Figura>();
	}
	
	public double calcularArea(){
		double total=0;
		for(Figura figurita : figura){
			total += figurita.calcularArea();
		}
		return total;
	}
	
	public void add(Figura figurita){
		figura.add(figurita);
	}
	
	public static void main(String[] args){
		Circulo rueda = new Circulo(2);
		Circulo rueda2 = new Circulo(2);
		Rectangulo cuerpo = new Rectangulo(4,2);
		Triangulo punta = new Triangulo(2, 3);
		Circulo rueda3 = new Circulo(2);
		Circulo rueda4 = new Circulo(2);
		Rectangulo cuerpo2 = new Rectangulo(4,2);
		
		FiguraCompuesta locomotora = new FiguraCompuesta();
		FiguraCompuesta vagon = new FiguraCompuesta();
		FiguraCompuesta tren = new FiguraCompuesta();
		vagon.add(rueda);
		vagon.add(rueda2);
		vagon.add(cuerpo);
		locomotora.add(rueda3);
		locomotora.add(rueda4);
		locomotora.add(cuerpo2);
		locomotora.add(punta);
		tren.add(locomotora);
		tren.add(vagon);
		
		double area = tren.calcularArea();
		System.out.println(area);
	}
}

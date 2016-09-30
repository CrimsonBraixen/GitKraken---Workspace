package vagonesDeTren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vagon {
	private List<Especie> animales;
	private int agresividad;
	
	public Vagon(){
		animales=new ArrayList<Especie>();
		agresividad=0;
	}
	
	public void add(Especie animal){
		animales.add(animal);
		calcularAgresividad();
	}

	private void calcularAgresividad() {
		agresividad=Collections.max(animales).getAgresividad()-Collections.min(animales).getAgresividad();
	}
	
	public int getAgresividad(){
		return agresividad;
	}
	
}

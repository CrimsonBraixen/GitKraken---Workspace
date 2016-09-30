package vagonesDeTren;

import java.util.ArrayList;
import java.util.List;

public class Tren {
	private List<Vagon>vagones;
	private int agresividadTotal;
	
	public Tren(){
		vagones=new ArrayList<Vagon>();
		agresividadTotal=0;
	}
	
	public void add(){
		vagones.add(new Vagon());
	}
	
	public void CalcularAgresividadTotal(){
		for(Vagon vagon:vagones){
			agresividadTotal+=vagon.getAgresividad();
		}
	}
	
	public int getAgresividadTotal(){
		return agresividadTotal;
	}
}

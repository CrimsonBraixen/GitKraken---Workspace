package vagonesDeTren;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class VagonesMinimos {

	private Especie[] especies;
	private int agresividadMaxima;
	
	public VagonesMinimos(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		especies = new Especie[sc.nextInt()];
		agresividadMaxima = sc.nextInt();
		sc.useDelimiter(" ");
		for(int i=0; i<especies.length; i++){
			especies[i] = new Especie(sc.next(), sc.nextInt(), sc.nextInt());
		}
		sc.close();
	}
	
	private void ordenarEspeciesSegunAgresividad(){
		Arrays.sort(especies);
	}
	
	public void calcularVagonesMinimos(){
		int flag=0;
		Tren tren = new Tren();
		ordenarEspeciesSegunAgresividad();
		Vagon vagon1 = new Vagon();
		vagon1.add(especies[0]);
		tren.add(vagon1);
		for(int i=1; i<especies.length; i++){
			for(Vagon vagon: tren.getVagones()){
				if(especies[i].getAgresividad() > vagon.getAgresividadMaxima()){
					if(especies[i].getAgresividad() - vagon.getAgresividadMinima() < agresividadMaxima - tren.calcularAgresividadTotal()){
						vagon.add(especies[i]);
						flag=1;
					}
				}
				else{
					if(especies[i].getAgresividad() < vagon.getAgresividadMinima()){
						if(vagon.getAgresividadMaxima() - especies[i].getAgresividad() < agresividadMaxima - tren.calcularAgresividadTotal()){
							vagon.add(especies[i]);
							flag=1;
						}
					}
					else{
						vagon.add(especies[i]);
						flag=1;
					}
				}
			}
			if(flag==0){
				Vagon vagon2 = new Vagon();
				vagon2.add(especies[i]);
				tren.add(vagon2);
			}
		}
	}
}

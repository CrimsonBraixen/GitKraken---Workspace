package acortandoCaminos;

import java.util.ArrayList;

public class PuntoDeBifurcacion implements Comparable<PuntoDeBifurcacion> {
	//nodo.
	private int numero;
	private int peso;
	private ArrayList<PuntoDeBifurcacion> adyacentes;
	
		public PuntoDeBifurcacion(int numero, int peso){
			this.numero=numero;
			this.peso=peso;
			adyacentes=new ArrayList<>();
		}
		
		public PuntoDeBifurcacion(int numero){
			this.numero=numero;
			adyacentes=new ArrayList<>();
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public ArrayList<PuntoDeBifurcacion> getAdyacentes() {
			return adyacentes;
		}

		public void setAdyacentes(ArrayList<PuntoDeBifurcacion> adyacentes) {
			this.adyacentes = adyacentes;
		}
		
		public void agregarAdyacente(PuntoDeBifurcacion adyacente){
			adyacentes.add(adyacente);
		}

		@Override
		public int compareTo(PuntoDeBifurcacion arg0) {
			if(peso>arg0.peso){
				return 1;
			}
			if(peso<arg0.peso){
				return -1;
			}
			
			return 0;
		}


}

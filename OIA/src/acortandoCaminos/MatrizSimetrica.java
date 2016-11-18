package acortandoCaminos;

import java.util.ArrayList;

public class MatrizSimetrica {

	private ArrayList<Integer> matrizSimetrica;
	private int ordenMatriz;
	private int cantidadDeNodos;
	
	public MatrizSimetrica(int cantidadDeNodos) {
		this.cantidadDeNodos=cantidadDeNodos;
		this.ordenMatriz=(cantidadDeNodos*(cantidadDeNodos-1))/2;
		matrizSimetrica=new ArrayList<>();
		inicializarMatrizSimetrica();
	}
	
	private void inicializarMatrizSimetrica() {
		for(int i=0;i<ordenMatriz;i++){
			matrizSimetrica.add(Integer.MAX_VALUE);
		}
		
	}

	public void setValor(int i, int j,int valor){
		matrizSimetrica.set((int) (i*cantidadDeNodos+j-(Math.pow(i,2)+3*i+2)/2),valor);
	}
	
	public int getValor(int i,int j){
		return matrizSimetrica.get((int) (i*cantidadDeNodos+j-(Math.pow(i,2)+3*i+2)/2));
	}

}

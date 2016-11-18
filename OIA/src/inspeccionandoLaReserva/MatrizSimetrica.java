package inspeccionandoLaReserva;

public class MatrizSimetrica {
	private int ordenMatriz;
	private boolean [] matrizSimetrica;
	public MatrizSimetrica(int ordenMatriz){
		this.ordenMatriz=ordenMatriz;
		matrizSimetrica=new boolean[(ordenMatriz*(ordenMatriz-1))/2];
	}
	
	public void setValor(int i, int j, boolean valor){
		matrizSimetrica[(int) (i*ordenMatriz+j-(Math.pow(i,2)+3*i+2)/2)]=valor;
	}
	
	public boolean getValor(int i, int j){
		return matrizSimetrica[(int) (i*ordenMatriz+j-(Math.pow(i,2)+3*i+2)/2)];
	}

	public void inicialiarEnFalse() {
		for(int i=0;i<matrizSimetrica.length;i++){
			matrizSimetrica[i]=false;
		}
		
	}

}

package algoritmos;

public class Selección {
	
	public static void main(String[] args){
		int[] vec = {0,0,0};
		int posmin, aux=0;
		for(int i=0;i<vec.length;i++){
			posmin = i;
			for(int j=0;j<vec.length;j++){
				if(vec[j] < vec[posmin]){
					aux = vec[j];
					vec[j] = vec[posmin];
					vec[posmin] = aux;
				}
			}
		}
	}
}

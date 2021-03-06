package inspeccionandoLaReserva;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerarFatiga {

	private int cantidadDeNodos;
	private int cantidadDeAristas;
//	private boolean[][]matrizDeAdyacencia;
	private MatrizSimetrica matrizDeAdyacencia;
	
	public GenerarFatiga(int cantidadDeNodos, int cantidadDeAristas){
		this.cantidadDeNodos = cantidadDeNodos;
		this.cantidadDeAristas = 0;
//		matrizDeAdyacencia = new boolean[cantidadDeNodos][cantidadDeNodos];
		matrizDeAdyacencia = new MatrizSimetrica(cantidadDeNodos);
		double porcentajeDeAdyacencia = (double)(cantidadDeAristas)/((cantidadDeNodos*(cantidadDeNodos-1))/2);
		Random random = new Random();
		for(int i=0; i<cantidadDeNodos-1; i++){
			for(int j=i+1; j<cantidadDeNodos; j++){
				double numeroRandom=random.nextDouble();
				if(numeroRandom<porcentajeDeAdyacencia){
					matrizDeAdyacencia.setValor(i, j, true);
					this.cantidadDeAristas++;
				}
				else{
					matrizDeAdyacencia.setValor(i, j, false);
				}
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(cantidadDeNodos+" ");
		pw.println(cantidadDeAristas);
		for(int i=0; i<cantidadDeNodos-1; i++){
			for(int j=i+1; j<cantidadDeNodos; j++){
				if(matrizDeAdyacencia.getValor(i, j)){
					pw.println(i+" "+j);
				}
			}
		}
		pw.close();
	}

	public static void main(String []args) throws IOException{
		GenerarFatiga gf = new GenerarFatiga(100000, 1000000);
		gf.aArchivo("IN/inInspeccionandoLaReserva/casoFatiga.in");
	}
}

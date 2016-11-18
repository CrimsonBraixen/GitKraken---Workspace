package inspeccionandoLaReserva;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Reserva {
	private int cantidadDeCaminos;
	//private boolean [][]matrizDeAdyacenciaSalida;
	private MatrizSimetrica matrizDeAdyacenciaSalida;
	private MatrizSimetrica matrizDeAdyacenciaEntrada;
	private int cantidadDeNodos;
	private int cantidadDeAristas;
	
	public Reserva(String path) throws IOException{
		Scanner scanner = new Scanner(new File(path));
		cantidadDeNodos = scanner.nextInt();
		cantidadDeAristas = scanner.nextInt();
		cantidadDeCaminos = 0;
		//matrizDeAdyacenciaSalida = new boolean[cantidadDeNodos][cantidadDeNodos];
		matrizDeAdyacenciaSalida=new MatrizSimetrica(cantidadDeNodos);
		matrizDeAdyacenciaEntrada=new MatrizSimetrica(cantidadDeNodos);
		matrizDeAdyacenciaSalida.inicialiarEnFalse();
		for(int i=0; i<cantidadDeAristas; i++){
			int valorInicial=scanner.nextInt()-1;
			int valorFinal=scanner.nextInt()-1;
			matrizDeAdyacenciaSalida.setValor(valorInicial,valorFinal, true);
			
		}
		scanner.close();
	}
	
	public void obtenerCantidadDeCaminos(){
		int nodoInicial = obtenerNodoInicial();
		int nodoFinal = obtenerNodoFinal();
		buscarEnProfundidad(nodoInicial, nodoFinal);
	}

	private void buscarEnProfundidad(int nodoInicial, int nodoFinal) {
		Stack<Integer> pila = new Stack<>();
		pila.add(nodoInicial);
		while(!pila.isEmpty()){
			int nodoActual = pila.pop();
			if(nodoActual == nodoFinal){
				cantidadDeCaminos++;
			}
			else{
				ArrayList<Integer> adyacentes = obtenerAdyacentes(nodoActual);
				pila.addAll(adyacentes);
			}
		}
	}

	private ArrayList<Integer> obtenerAdyacentes(int nodoActual) {
		ArrayList<Integer> adyacentes = new ArrayList<>();
		for(int i=0; i<cantidadDeNodos; i++){
			if((nodoActual<i&&matrizDeAdyacenciaSalida.getValor(nodoActual, i))||(nodoActual>i&&matrizDeAdyacenciaSalida.getValor(i,nodoActual))){
				adyacentes.add(i);
			}
		}
		return adyacentes;
	}

	private int obtenerNodoInicial() {
		boolean flag=false;
		for(int i=0; i<cantidadDeNodos-1; i++){
			for(int j=i+1; j<cantidadDeNodos; j++){
				if(matrizDeAdyacenciaEntrada.getValor(j, i)){
					flag = true;
				}
			}
			if(!flag){
				return i;
			}
			flag = false;
		}
		return -1;
	}

	private int obtenerNodoFinal() {
		boolean flag=false;
		for(int i=0; i<cantidadDeNodos-1; i++){
			for(int j=i+1; j<cantidadDeNodos; j++){
				if(matrizDeAdyacenciaSalida.getValor(i, j)){
					flag = true;
				}
			}
			if(!flag){
				return i;
			}
			flag = false;
		}
		return -1;
	}

	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(cantidadDeCaminos);
		pw.close();
	}

	public int getCantidadDeCaminos() {
		return cantidadDeCaminos;
	}

	public void setCantidadDeCaminos(int cantidadDeCaminos) {
		this.cantidadDeCaminos = cantidadDeCaminos;
	}
}

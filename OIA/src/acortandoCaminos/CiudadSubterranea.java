package acortandoCaminos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CiudadSubterranea {
	//grafo.
	private ArrayList<Galeria> galeriasAbiertas;
	private ArrayList<Galeria> galeriasObstruidas;
	private ArrayList<PuntoDeBifurcacion> nodos;
	private MatrizSimetrica matriz;
	private int cantidadDeNodos;
	private int caminoMasCorto;
	private ArrayList<Galeria> obstaculosDestruidos;
	private ArrayList<PuntoDeBifurcacion> recorridos;
	private ArrayList<Galeria> galeriaObstruidaUsada;
	public CiudadSubterranea(String path) throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader(new File(path)));
		cantidadDeNodos=scanner.nextInt();
		int cantidadDeGaleriasAbiertas=scanner.nextInt();
		int cantidadDeGaleriasObstruidas=scanner.nextInt();
		galeriasAbiertas=new ArrayList<>();
		galeriasObstruidas=new ArrayList<>();
		galeriaObstruidaUsada=new ArrayList<>();
		nodos=new ArrayList<>();
		matriz = new MatrizSimetrica(cantidadDeNodos);
		for(int i=0;i<cantidadDeNodos;i++){
			nodos.add(new PuntoDeBifurcacion(i));
		}
		
		for(int i=0;i<cantidadDeGaleriasAbiertas;i++){
			int nodoInicial=scanner.nextInt()-1;
			int nodoFinal=scanner.nextInt()-1;
			int distancia=scanner.nextInt();
			if(!nodos.get(nodoInicial).getAdyacentes().contains(nodos.get(nodoFinal))){
				nodos.get(nodoInicial).agregarAdyacente(nodos.get(nodoFinal));
				nodos.get(nodoFinal).agregarAdyacente(nodos.get(nodoInicial));				
			}
			
			galeriasAbiertas.add(new Galeria(nodos.get(nodoInicial),nodos.get(nodoFinal),distancia,false));
			
			if(nodoInicial<nodoFinal&&matriz.getValor(nodoInicial, nodoFinal)>distancia){
				matriz.setValor(nodoInicial, nodoFinal, distancia);
			}
			else if(nodoInicial>nodoFinal&&matriz.getValor(nodoFinal, nodoInicial)>distancia){
				matriz.setValor(nodoFinal, nodoInicial, distancia);
			}

		}
		
		for(int i=0;i<cantidadDeGaleriasObstruidas;i++){
			int nodoInicial=scanner.nextInt()-1;
			int nodoFinal=scanner.nextInt()-1;
			int distancia=scanner.nextInt();
			if(!nodos.get(nodoInicial).getAdyacentes().contains(nodos.get(nodoFinal))){
				nodos.get(nodoInicial).agregarAdyacente(nodos.get(nodoFinal));
				nodos.get(nodoFinal).agregarAdyacente(nodos.get(nodoInicial));				
			}
			
			if(nodoInicial>nodoFinal){
				int aux=nodoFinal;
				nodoFinal=nodoInicial;
				nodoInicial=aux;
			}
			
			
			Galeria galeria = new Galeria(nodos.get(nodoInicial),nodos.get(nodoFinal),distancia,true);
			galeriasObstruidas.add(galeria);
			
			if(matriz.getValor(nodoInicial, nodoFinal)>distancia){
				matriz.setValor(nodoInicial, nodoFinal, distancia);
				galeriaObstruidaUsada.add(galeria);
			}
			

		}
		scanner.close();
	}
	
	public void encontrarCaminoMasCorto(){
	
		do{
			recorridos = dijkstra();
			encontrarObstruidas();
			if(obstaculosDestruidos.size()>2){
				sacarAlgo();
			}
		}while(obstaculosDestruidos.size()>2);

	}

	private void sacarAlgo() {
		for(Galeria galeria :galeriaObstruidaUsada){
			matriz.setValor(galeria.getPuntoInicial().getNumero(), galeria.getPuntoFinal().getNumero(), 10000);
			if(galeriasAbiertas.contains(galeria)){
				matriz.setValor(galeria.getPuntoInicial().getNumero(), galeria.getPuntoFinal().getNumero(), devolverValorEnGaleriasAbiertas(galeria));
			}
			
		}
		galeriaObstruidaUsada=new ArrayList<>();
		
	}

	private int devolverValorEnGaleriasAbiertas(Galeria galeria) {
		int peso=Integer.MAX_VALUE;
		
		for(Galeria galeriaAbierta:galeriasAbiertas){
			if(galeria.equals(galeriaAbierta)&&galeriaAbierta.getPeso()<peso){
				peso=galeriaAbierta.getPeso();
			}
			
		}
		return peso;
	}

	private void encontrarObstruidas() {
		int i=recorridos.size()-1;
		obstaculosDestruidos=new ArrayList<>();
		while(recorridos.get(i)!=null){
			Galeria aristaActual= new Galeria(recorridos.get(i),new PuntoDeBifurcacion(i));
			if(galeriaObstruidaUsada.contains(aristaActual)){
				obstaculosDestruidos.add(aristaActual);
			}
			i=recorridos.get(i).getNumero();
		}
		
		
	}

	private ArrayList<PuntoDeBifurcacion> dijkstra() {
		ArrayList<Integer> distancia=new ArrayList<>();
		ArrayList<PuntoDeBifurcacion> padre = new ArrayList<>();
		ArrayList<Boolean> estado = new ArrayList<>();
		
		for(int i = 0;i<cantidadDeNodos;i++){
			distancia.add(Integer.MAX_VALUE);
			padre.add(null);
			estado.add(false);
		}
		
		PriorityQueue<PuntoDeBifurcacion> cola = new PriorityQueue<>();
		PuntoDeBifurcacion primerNodo=nodos.get(0);
		distancia.set(0,0);
		primerNodo.setPeso(0);
		cola.add(primerNodo);
		
		while(!cola.isEmpty()){
			PuntoDeBifurcacion puntoActual = cola.poll();
			estado.set(puntoActual.getNumero(), true);
			for(PuntoDeBifurcacion adyacente : puntoActual.getAdyacentes()){
				int peso=adyacente.getNumero()>puntoActual.getNumero()?matriz.getValor(puntoActual.getNumero(),adyacente.getNumero()):matriz.getValor(adyacente.getNumero(),puntoActual.getNumero());
				if(!estado.get(adyacente.getNumero())&& puntoActual.getPeso()+peso<distancia.get(adyacente.getNumero())){
					adyacente.setPeso(puntoActual.getPeso()+peso);
					distancia.set(adyacente.getNumero(),puntoActual.getPeso()+peso);
					padre.set(adyacente.getNumero(),puntoActual);
					cola.add(adyacente);
				}
			}
		}
		
		caminoMasCorto=distancia.get(distancia.size()-1);
		return padre;
		
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		if(obstaculosDestruidos.size()==0){
			pw.print("1" + " ");
		}
		else if(obstaculosDestruidos.size()==1){
			pw.print("2" + " ");
		}
		else if(obstaculosDestruidos.size()==2){
			pw.print("3" + " ");
		}
		else{
			pw.print("4" + " " + obstaculosDestruidos.size() + " ");
		}
		
		pw.print(caminoMasCorto);
		
		pw.close();
	}

}

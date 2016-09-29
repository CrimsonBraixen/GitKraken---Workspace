package tp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	
	public Polinomio(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		
		grado = sc.nextInt();
		coeficientes = new double[grado+1];
		for(int i=0; i<=grado; i++){
			coeficientes[i] = sc.nextDouble();
		}
	}
	
	public double evaluarMSucesivas(double x){
	long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado];
		for(int i=0; i<grado; i++){
			double potencia=1;
			for(int j=0; j<grado-i; j++){
				potencia*=x;
			}
			resultado += potencia * coeficientes[i];
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double evaluarRecursiva(double x){
		long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado];
		for(int i=0; i<grado; i++){
			resultado += potencia(x, grado-i) * coeficientes[i];
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double potencia(double x, int i){
		if(i==0)
			return 1;
		return x*potencia(x, i-1);
	}
	
	public double evaluarRecursivaPar(double x){
		long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado];
		for(int i=0; i<grado; i++){
			resultado += potenciaPar(x, grado-i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double potenciaPar(double x, int i){
		if(i==1)
			return 1;
		if(i%2 == 0)
			return potenciaPar(x*x, i/2);
		else
			return x*potenciaPar(x, i-1);
	}
	
	public double evaluarProgDinamica(double x){
		long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado], potencia=1;
		for(int i=grado-1; i>=0; i--){
			potencia*=x;
			resultado += potencia * coeficientes[i];
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double evaluarMejorada(double x){
		long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado], potencia=1;
		for(int i=grado-1; i>=0; i--){
			potencia*=x;
			if(coeficientes[i] != 0){
				resultado += potencia * coeficientes[i];
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double evaluarPow(double x){
		long t1 = System.currentTimeMillis();
		double resultado = coeficientes[grado];
		for(int i=0; i<grado; i++){
			resultado += Math.pow(x, grado-i) * coeficientes[i];
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
	public double evaluarHorner(double x){
		long t1 = System.currentTimeMillis();
		double resultado = 1;
		for(int i=0; i<grado; i++){
			resultado += x * coeficientes[i] + coeficientes[i+1];
		}
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		return resultado;
	}
	
}

package tp3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeneradorDePolinomios {

	public static void generarPolinomio(){
		FileWriter fichero = null;
		PrintWriter pw = null;
	
		try
		{
			fichero = new FileWriter("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10000.in");
			pw = new PrintWriter(fichero);
			
			pw.println(10000);
			for(int i=0; i<=10000; i++){
				pw.println(2);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if (null != fichero)
					fichero.close();
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		generarPolinomio();
	}
}

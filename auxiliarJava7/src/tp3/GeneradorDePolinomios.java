package tp3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeneradorDePolinomios {

	public static void generarPolinomio(){
		FileWriter fichero = null;
		PrintWriter pw = null;
	
		try
		{
			fichero = new FileWriter("Z:\\unNombre\\grado12000.in");
			pw = new PrintWriter(fichero);
			
			pw.println(12000);
			for(int i=0; i<=12000; i++){
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

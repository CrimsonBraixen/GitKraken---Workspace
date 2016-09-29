package generador;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeneradorDeCasosDePrueba {
    public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("D://prueba.txt");
            pw = new PrintWriter(fichero);

            pw.println("1000 100");
            pw.println("10 100");
            pw.println("1000");

            for (int i = 10; i <= 1000; i+=10){
                for(int j = 10; j <= 100; j+=10){
                    pw.println(i + " " + j);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

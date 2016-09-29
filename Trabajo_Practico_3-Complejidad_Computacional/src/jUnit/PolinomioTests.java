package jUnit;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import tp3.Polinomio;

public class PolinomioTests {

	@Test
	public void pruebaPolinomioGrado4mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarMSucesivas(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarRecursiva(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarRecursivaPar(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarProgDinamica(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarMejorada(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarPow(2));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarHorner(2));
	}

	@Test
	public void pruebaPolinomioGrado10mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarMSucesivas(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarRecursiva(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarRecursivaPar(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarProgDinamica(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarMejorada(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarPow(2));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarHorner(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(1));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarRecursiva(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarRecursivaPar(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarProgDinamica(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarMejorada(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarPow(2));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("F:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\Trabajo_Practico_3-Complejidad_Computacional\\Lote de Pruebas\\IN\\grado100.in");
		Assert.assertTrue(202 == p.evaluarHorner(2));
	}
}

package jUnit;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import tp3.Polinomio;

public class PolinomioTests {
	/*
	@Test
	public void pruebaPolinomioGrado4mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarMSucesivas(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarMSucesivas(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado50mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado50.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado100mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.7654321));
	}

	@Test
	public void pruebaPolinomioGrado250mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado250.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado500mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado500.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado750mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado750.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado1000mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGradomSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado10000mSucesivas() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(202 == p.evaluarMSucesivas(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado4EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado8000.in");
		Assert.assertTrue(73.0 == p.evaluarRecursiva(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarRecursiva(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado100EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(202 == p.evaluarRecursiva(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarRecursiva(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarRecursiva() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(202 == p.evaluarRecursiva(0.123456));
	}

	@Test
	public void pruebaPolinomioGrado4EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(73.0 == p.evaluarRecursivaPar(0.7654321));
	}

	@Test
	public void pruebaPolinomioGrado10EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarRecursivaPar(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(202 == p.evaluarRecursivaPar(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarRecursivaPar(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarRecursivaPar() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(202 == p.evaluarRecursivaPar(0.123456));
	} 
	
	@Test
	public void pruebaPolinomioGrado4EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(73.0 == p.evaluarProgDinamica(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(2050 == p.evaluarProgDinamica(0.7654321));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(202 == p.evaluarProgDinamica(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarProgDinamica(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarProgDinamica() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(202 == p.evaluarProgDinamica(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(73.0 == p.evaluarMejorada(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarMejorada(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(202 == p.evaluarMejorada(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarMejorada(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarMejorada() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(202 == p.evaluarMejorada(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarPow(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(73.0 == p.evaluarPow(0.7654321));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(73.0 == p.evaluarPow(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(73.0 == p.evaluarPow(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarPow() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10000.in");
		Assert.assertTrue(73.0 == p.evaluarPow(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado4EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado4.in");
		Assert.assertTrue(73.0 == p.evaluarHorner(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado10.in");
		Assert.assertTrue(2050 == p.evaluarHorner(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado100EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado100.in");
		Assert.assertTrue(202 == p.evaluarHorner(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado1000EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado1000.in");
		Assert.assertTrue(202 == p.evaluarHorner(0.123456));
	}
	
	@Test
	public void pruebaPolinomioGrado10000EvaluarHorner() throws FileNotFoundException{
		Polinomio p = new Polinomio("Z:\\unNombre\\grado12000.in");
		Assert.assertTrue(202 == p.evaluarHorner(0.123456));
	}
	*/
}

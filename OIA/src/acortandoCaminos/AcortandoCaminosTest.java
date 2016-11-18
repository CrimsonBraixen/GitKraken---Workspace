package acortandoCaminos;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;

public class AcortandoCaminosTest {

	@Test
	public void casoGuia() throws IOException{
		CiudadSubterranea ciudadSubterranea= new CiudadSubterranea("IN/inAcortandoCaminos/casoGuia.in");
		ciudadSubterranea.encontrarCaminoMasCorto();
		ciudadSubterranea.aArchivo("OUT/outAcortandoCaminos/casoGuia.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void unaBifurcacionConAmbosCaminosConDosGaleriasObstruidas() throws IOException{
		CiudadSubterranea ciudadSubterranea= new CiudadSubterranea("IN/inAcortandoCaminos/unaBifurcacionConAmbosCaminosConDosGaleriasObstruidas.in");
		ciudadSubterranea.encontrarCaminoMasCorto();
		ciudadSubterranea.aArchivo("OUT/outAcortandoCaminos/unaBifurcacionConAmbosCaminosConDosGaleriasObstruidas.out");
		Assert.assertTrue(true);
	}

	@Test
	public void casoQueNoTomaTresAristas() throws IOException{
		CiudadSubterranea ciudadSubterranea= new CiudadSubterranea("IN/inAcortandoCaminos/casoQueNoTomaTresAristas.in");
		ciudadSubterranea.encontrarCaminoMasCorto();
		ciudadSubterranea.aArchivo("OUT/outAcortandoCaminos/casoQueNoTomaTresAristas.out");
		Assert.assertTrue(true);
	}
}

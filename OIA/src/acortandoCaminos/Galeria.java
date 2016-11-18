package acortandoCaminos;

public class Galeria {
	//arista
	
	private PuntoDeBifurcacion puntoInicial;
	public PuntoDeBifurcacion getPuntoInicial() {
		return puntoInicial;
	}
	public void setPuntoInicial(PuntoDeBifurcacion puntoInicial) {
		this.puntoInicial = puntoInicial;
	}
	public PuntoDeBifurcacion getPuntoFinal() {
		return puntoFinal;
	}
	public void setPuntoFinal(PuntoDeBifurcacion puntoFinal) {
		this.puntoFinal = puntoFinal;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isObstruida() {
		return obstruida;
	}
	public void setObstruida(boolean obstruida) {
		this.obstruida = obstruida;
	}
	private PuntoDeBifurcacion puntoFinal;
	private int peso;
	private boolean obstruida;

	public Galeria(PuntoDeBifurcacion puntoInicial, PuntoDeBifurcacion puntoFinal, int peso,boolean obstruida){
		this.puntoInicial=puntoInicial;
		this.puntoFinal=puntoFinal;
		this.peso=peso;
		this.obstruida=obstruida;
		
	}
	public Galeria(PuntoDeBifurcacion puntoInicial, PuntoDeBifurcacion puntoFinal) {
		this.puntoInicial=puntoInicial;
		this.puntoFinal=puntoFinal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + puntoFinal.getNumero();
		result = prime * result + puntoInicial.getNumero();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Galeria comparador = ((Galeria)obj);
		return comparador.puntoFinal.getNumero()==puntoFinal.getNumero()&&comparador.puntoInicial.getNumero()==puntoInicial.getNumero();
	}
	
	
	
}

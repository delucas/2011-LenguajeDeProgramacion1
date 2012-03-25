
public class Peleador {
	
	private int PuntosDeAtaque = 0;
	private int PuntosDefensa =0;
	boolean muerto = false;
	public int valor;
	
	public Peleador(int Ataque, int Defensa ){
		this.PuntosDeAtaque = Ataque;
		this.PuntosDefensa = Defensa;
		this.valor = this.PuntosDeAtaque;
	}
	
	public int getAtaque (){
		return this.PuntosDeAtaque;
	}
	
	public int getDefensa (){
		return this.PuntosDefensa;
	}
	
	public boolean getMuerto () {
		if (this.PuntosDefensa >1){
			this.muerto = false;
		}
		else if (this.PuntosDefensa <=0){
			this.muerto = true;
		}
		return this.muerto;
		
	}
	
}

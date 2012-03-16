public class JuegoDeRol {

	private boolean enJuego;
	private Jugador mago;
	private Jugador arquero; 
	private boolean ganoMago;
	private boolean ganoArquero;
	
	
	
	public JuegoDeRol(){
		
		Jugador mago = new Jugador(500, 30, 100);
		Jugador arquero = new Jugador(600, 40, 60);
	}
	
	public boolean estadoDeJuego(){
		if((this.mago.estadoVida() > 0)&&(this.arquero.estadoVida()> 0)){
		}
		return enJuego;
	}
	
	public void ataqueMago(){
		if((this.mago.estadoVida() > 0)&&(this.arquero.estadoVida()> 0)){
			this.mago.ataque();
		}
		
	}
	
	public void ataqueArquero(){
		if((this.mago.estadoVida() > 0)&&(this.arquero.estadoVida()> 0)){
			this.arquero.ataque();
		}
		
	}
	
	public boolean estadoPelea(){
		if(this.mago.estadoDefensa() == 0){
			return ganoArquero;
		}else if(this.arquero.estadoDefensa() == 0){
			return ganoMago;
		}else{
			return enJuego;
		}
	}
	
}

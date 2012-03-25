public class Set {

	private int puntajeSaque;
	private int puntajeRecepcion;
	private String estadoDelJuego = "En proceso";
	
	public String definirEstadoDelJuego(){
	
		String ganador = null;
		if((this.puntajeRecepcion >= 4) && (this.puntajeRecepcion - this.puntajeSaque >= 2)){
			estadoDelJuego = "Finalizado el Set";
			ganador = "gana recepcion";
		}else if ((this.puntajeSaque >= 4) && (this.puntajeSaque - this.puntajeRecepcion >= 2)){
			estadoDelJuego = "Finalizado el Set";
			ganador = "gana saque";
		}else if (this.puntajeRecepcion == 4 && this.puntajeSaque == 4){
			estadoDelJuego = "Deuce";
		}else { estadoDelJuego = "En juego"; }
		return ganador;	
	}
	
		public void anotaSaque(){
		if(estadoDelJuego == "En proceso"){
			this.puntajeSaque = this.puntajeSaque + 1;
		}
		}
		public void anotaRecepcion(){
			if(estadoDelJuego == "En proceso"){
				this.puntajeRecepcion = this.puntajeRecepcion + 1;
			}
		}
		public int conocerPuntajeRecepcion(){
			return this.puntajeRecepcion;
		}
		
		public int conocerPuntajeSaque(){
			return this.puntajeSaque;
		}
	}
	

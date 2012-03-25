public class Tennis {

	private int puntoJugador1;
	private int puntoJugador2;
	private int setJugador1;
	private int setJugador2;
	private int gameJugador1;
	private int gameJugador2;
	private int deuce;
	private int ventajaJugador1;
	private int ventajaJugador2;
	
	public Tennis(){
		this.puntoJugador1 = 0;
		this.puntoJugador2 = 0;
		this.setJugador1 = 0;
		this.setJugador2 = 0;
		this.gameJugador1 = 0;
		this.gameJugador2 = 0;
	}

	public void anotarPunto(){
		
		int tanto = (int) (Math.random()* 2)+ 1;
		
		if (tanto == 1 && puntoJugador1 == 0) {
			puntoJugador1 = 15;
		} else if (tanto == 1 && puntoJugador1 == 15){
			puntoJugador1 = 30;
		} else if (tanto == 1 && puntoJugador1 == 30){
			puntoJugador1 = 40;
		} else if (tanto == 1 && puntoJugador1 == 40 && puntoJugador2 == 40){
			puntoJugador1 = this.deuce;
		} else if (tanto == 1 && puntoJugador1 == this.deuce && puntoJugador2 == this.deuce){
			puntoJugador1 = this.ventajaJugador1;
		} else if (tanto == 1 && puntoJugador1 == this.ventajaJugador1){
			puntoJugador1 = this.setJugador1;
			this.gameJugador1 ++;
			this.setJugador1 = 0;
			this.setJugador2 = 0;
		}
		
		if (tanto == 2 && puntoJugador2 == 0) {
			puntoJugador2 = 15;
		} else if (tanto == 2 && puntoJugador2 == 15){
			puntoJugador2 = 30;
		} else if (tanto == 2 && puntoJugador2 == 30){
			puntoJugador2 = 40;
		} else if (tanto == 2 && puntoJugador2 == 40 && puntoJugador1 == 40){
			puntoJugador2 = this.deuce;
		} else if (tanto == 2 && puntoJugador2 == this.deuce && puntoJugador1 == this.deuce){
			puntoJugador2 = this.ventajaJugador2;
		} else if (tanto == 2 && puntoJugador2 == this.ventajaJugador2){
			puntoJugador2 = this.setJugador2;
			this.gameJugador2 ++;
			this.setJugador1 = 0;
			this.setJugador2 = 0;
		}
	}
	
		
		public int getPuntaje1(){
			return this.puntoJugador1;
		}
	
		public int getPuntaje2(){
			return this.puntoJugador2;
		}
	
		public int getGame1(){
			return this.gameJugador1;
		}	
		
		public int getGame2(){
			return this.gameJugador2;
		}
		
		public EstadoPartido getEstadoPartido(){
			
			if(this.gameJugador1 == 3){
				return EstadoPartido.GanoJugadorUno;
			}else if(this.gameJugador2 == 3){
				return EstadoPartido.GanoJugadorDos;
			}else{
				return EstadoPartido.EnJuego;
			}
		}
	

}


public enum EstadoPartido {
	GanoJugadorUno,
	GanoJugadorDos,
	EnJuego;
}

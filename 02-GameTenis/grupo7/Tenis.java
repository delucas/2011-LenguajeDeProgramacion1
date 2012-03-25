
public class Tenis {
	
	/**
	 * contiene el jugadorque participa en el partido
	 */
	private Jugador jugador1 , jugador2 ;
	
	/**
	 * contiene el estado del partido 
	 */
	private boolean partidoEnCurso = false ;
	
	/**
	 * contiene el jugador que esta golpeara la bola
	 */
	private JugadorQueGolpea jugadorQueGolpea = JugadorQueGolpea.JUGADOR2 ;   //inicializo
	
	/**
	 * crea el partido con sus jugadores
	 */
	public Tenis (  ){  //se decide crear aca los jugadores para que desde fuera no se pueda manipular los puntos
		this.jugador1 = new Jugador() ;
		this.jugador2 = new Jugador() ;
	} //fin constructor
	
	/**
	 * inicia el partido. Produce error si se intenta iniciar un partido ya iniciado o ya finalizado
	 */
	public void iniciarPartido (){ 
		
		if ( this.partidoEnCurso || (this.jugador1.getSetsGanados() + this.jugador2.getSetsGanados() == 5 ) ){
			Error partidoNoIniciado = new Error ( " el partido ya fue iniciado " );
			throw partidoNoIniciado;
		}
		this.partidoEnCurso = true ; 
	}
	
	/**
	 * determina quien golpeara la bola en el proximo golpe
	 */
	private void determinarJugadorQueGolpea (){
		
		if ( this.jugadorQueGolpea == JugadorQueGolpea.JUGADOR2 ){
			this.jugadorQueGolpea = JugadorQueGolpea.JUGADOR1 ;
		} else{
			this.jugadorQueGolpea = JugadorQueGolpea.JUGADOR2 ;
		}
		
	} // fin metodo
	
	
	/**
	 * determina si el jugador anoto punto o se le fue devuelta la bola y anota puntaje en caso de anotar
	 * @param resultadoDelGolpe contiene numero referido al golpe
	 * @param jugadorAnota contiene si el jugador anota o no
	 * @return si el jugador anoto o no
	 */
	private boolean resolverJugada ( int resultadoDelGolpe , boolean jugadorAnota ){
		
		if ( 1 < resultadoDelGolpe  ){
			jugadorAnota = true ;
			
			if ( this.jugadorQueGolpea == JugadorQueGolpea.JUGADOR1 ){
				this.jugador1.anotarPunto();
			} else {
				this.jugador2.anotarPunto();
			}
			
		} //fin if
		
		return jugadorAnota ;
	} //fin metodo
	
	
	/**
	 * revisa la situacion del juego con respecto al puntaje de los jugadores
	 */
	private void resolverSituacionDelJuego (){
		//decido si alguien gana el set
		if ( this.jugador1.getPuntosGanados()>= 4 && this.jugador2.getPuntosGanados() <=this.jugador1.getPuntosGanados() - 2 ){
			this.jugador1.anotarSet();
			this.jugador1.reiniciarPuntos();
			this.jugador2.reiniciarPuntos();
		} else {
			if ( this.jugador2.getPuntosGanados()>= 4 && this.jugador1.getPuntosGanados() <=this.jugador2.getPuntosGanados() - 2 ){
				this.jugador2.anotarSet();
				this.jugador1.reiniciarPuntos();
				this.jugador2.reiniciarPuntos();
			}	
		  } 
		
		//decido si termino el partido ( el mejor de 5 )
		if ( this.jugador1.getSetsGanados() + this.jugador2.getSetsGanados() == 5 ){
			this.partidoEnCurso = false ;
		}
		
	} //fin metodo
	
	/**
	 * inicia una jugada la cual termina cuando un jugador anota
	 */
	public void iniciarJugada (){ //   (0-1 devuelve pelota, 1.5 - 4 es punto)
		int resultadoDelGolpe;
		boolean jugadorAnota = false ;
		
		if  ( this.partidoEnCurso ){
			while ( !jugadorAnota ){
			
				this.determinarJugadorQueGolpea ();
				resultadoDelGolpe = (int) ( Math.random() * 5 ) ; //golpea
					
				jugadorAnota = this.resolverJugada( resultadoDelGolpe , jugadorAnota );
			}//fin while
		} 
	
		this.resolverSituacionDelJuego ();
		
	} //fin metodo
	
	/**
	 * informa el resultado del partido
	 * @return el resultado del partido
	 */
	public String obtenerResultado (){ 
		
		if ( !this.partidoEnCurso ) {
			
			if ( this.jugador1.getSetsGanados() > this.jugador2.getSetsGanados() ){
				return "Ganó jugador 1" ;
			} else {
				return "Ganó jugador 2";
			}
		
		} else {
			return "el partido aun no ha terminado";
		}
	} //fin metodo
	
} //fin clase


public class SetDeTenis {
	
	private EstadoDelSet estado;
	private int aleatorio;
	private JugadorDeTenis primerJugador;
	private JugadorDeTenis segundoJugador;
	private String mensaje = "El juego está en curso.";
	
	/**	
	 * @pre: se han creado dos jugadores de tenis.
	 * @post: se crea un set de tenis en el que participan los dos jugadores de tenis previamente creados.
	 */		
	public SetDeTenis(JugadorDeTenis primerJugador, JugadorDeTenis segundoJugador){
		if(primerJugador.getSetsGanados()== 3 || segundoJugador.getSetsGanados() == 3){
			Error partidoFinalizado = new Error("El partido ya ha finalizado y no pueden seguir jugándose nuevos sets. Ha ganado el jugador con mayor número de sets ganados.");
			throw partidoFinalizado;
		}
		else{
			this.setEstadoDelSet(EstadoDelSet.INICIADO);
			this.setPrimerJugador(primerJugador);
			this.setSegundoJugador(segundoJugador);		
			primerJugador.asignarPuntaje(0);
			segundoJugador.asignarPuntaje(0);
		}		
	}
	
	/**
	 * @pre: se ha iniciado un set de tenis con dos jugadores asociados a él.
	 * @post: uno de los jugadores saca y comienza el juego.
	 */
	public String saque(){			
		
		if(this.getEstadoDelSet() != EstadoDelSet.FINALIZADO){
			
			this.aleatorio = (int)(Math.random()*100)+1;
			
			if (this.aleatorio > 50){
				this.primerJugador.asignarPuntaje(this.primerJugador.getPuntaje() + 1);					
			}else{				
				this.segundoJugador.asignarPuntaje(this.segundoJugador.getPuntaje() + 1);
			}				
			this.establecerEstadoDelSet(primerJugador, segundoJugador);		
			
		}else{				
			Error noPuedeSacar = new Error("El set ha finalizado. Inicie uno nuevo para continuar jugando.");
			throw noPuedeSacar;				
		}		
		return this.mensaje;
	}
	
	private void establecerEstadoDelSet(JugadorDeTenis primerJugador, JugadorDeTenis segundoJugador){
		
		if(primerJugador.getPuntaje()>=4 && segundoJugador.getPuntaje()<= primerJugador.getPuntaje()-2){
			this.setEstadoDelSet(EstadoDelSet.FINALIZADO);
			primerJugador.asignarSetsGanados(primerJugador.getSetsGanados()+1);
			this.primerJugador.setGame();
			this.setMensaje("El set ha finalizado. Ha ganado el primer jugador que ha ingresado.");			
		}
		
		else if(segundoJugador.getPuntaje()>=4 && primerJugador.getPuntaje()<= segundoJugador.getPuntaje()-2){
			this.setEstadoDelSet(EstadoDelSet.FINALIZADO);
			segundoJugador.asignarSetsGanados(segundoJugador.getSetsGanados()+1);	
			this.segundoJugador.setGame();
			this.setMensaje("El set ha finalizado. Ha ganado el segundo jugador que ha ingresado.");			
		}
		
		else if(primerJugador.getPuntaje()>4 && segundoJugador.getPuntaje()== primerJugador.getPuntaje()-1){
			this.setEstadoDelSet(EstadoDelSet.VENTAJAJUGADOR1);		
			this.setMensaje("Tiene ventaja el primer jugador que ha ingresado.");
		}
		
		else if(segundoJugador.getPuntaje()>4 && primerJugador.getPuntaje()== segundoJugador.getPuntaje()-1){
			this.setEstadoDelSet(EstadoDelSet.VENTAJAJUGADOR2);
			this.setMensaje("Tiene ventaja el segundo jugador que ha ingresado.");
		}
		
		else if(primerJugador.getPuntaje() >=4 && primerJugador.getPuntaje() == segundoJugador.getPuntaje()){
			this.setEstadoDelSet(EstadoDelSet.DEUCE);
			this.setMensaje("Los jugadores están empatados.");
		}						
	}
	
	private void setEstadoDelSet(EstadoDelSet estado){
		this.estado = estado;
	}
	
	public EstadoDelSet getEstadoDelSet(){
		return this.estado;
	}

	private void setPrimerJugador(JugadorDeTenis primerJugador) {
		this.primerJugador = primerJugador;
	}

	private void setSegundoJugador(JugadorDeTenis segundoJugador) {
		this.segundoJugador = segundoJugador;
	}

	private void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}

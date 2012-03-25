
public class JugadorDeTenis {
	
	private int puntaje;
	private PuntajeDeTenis puntajeDeTenis;
	private int setsGanados;
	
	public JugadorDeTenis(){
		this.setPuntaje(0);
	}
	
	/**
	 * @pre: se ha creado un jugador de tenis.
	 * @post: se asigna al jugador de tenis un puntaje en su forma aritmética (puntaje) y en su forma reglamentaria (puntajeDeTenis).
	 */		
	public void asignarPuntaje(int puntaje){
		this.setPuntaje(puntaje);
		this.setPuntajeDeTenis();
	}
	
	/**
	 * @pre: un jugador de tenis ha ganado un set.
	 * @post: se le asigna al jugador de tenis un set ganado.
	 */
	public void asignarSetsGanados(int setsGanados){
		this.setSetsGanados(setsGanados);
	}
	
	
	private void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	/**
	 * @pre: un jugador de tenis ha ganado al menos un punto.
	 * @post: informa el número de puntos aritméticos ganados.
	 */
	public int getPuntaje() {
		return puntaje;
	}
	
	private void setPuntajeDeTenis() {
		if(this.puntaje == 0){
			this.puntajeDeTenis = PuntajeDeTenis.CERO;
		}
		else if(this.puntaje == 1){
			this.puntajeDeTenis = PuntajeDeTenis.QUINCE;
		}
		else if(this.puntaje == 2){
			this.puntajeDeTenis = PuntajeDeTenis.TREINTA;
			
		}else{
			this.puntajeDeTenis = PuntajeDeTenis.CUARENTA;
		}
				
	}
	
	/**
	 * @pre: un jugador de tenis ha ganado al menos un punto.
	 * @post: informa el número de puntos reglamentarios ganados.
	 */
	public PuntajeDeTenis getPuntajeDeTenis() {
		return puntajeDeTenis;
	}	

	private void setSetsGanados(int setsGanados) {
		this.setsGanados = setsGanados;
	}

	/**
	 * @pre: un jugador de tenis ha ganado al menos un set.
	 * @post: informa el número de sets ganados.
	 */
	public int getSetsGanados() {
		return setsGanados;
	}

	/**
	 * @pre: un jugador de tenis ha ganado un set.
	 * @post: se le asigna el game al jugador que ha ganado el set.
	 */
	public void setGame(){
		this.puntajeDeTenis = PuntajeDeTenis.GAME;
	}
	
}

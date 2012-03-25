
public class Jugador {   // 1 = 15 , 2 = 30 , 3 = 40
	
	/**
	 * contiene cantidad de sets ganados por el jugador
	 */
	private int setsGanados = 0 ;
	
	/**
	 * contiene cantidad de puntos del game obtenidos por el jugador
	 */
	private int puntosGanados = 0 ;   
	
	/**
	 * anota puntaje en el game del jugador
	 */
	public void anotarPunto (){
		this.puntosGanados ++ ;
	}
	
	/**
	 * anotaun set ganado del jugador
	 */
	public void anotarSet (){
		this.setsGanados ++ ;
	}
	
	/**
	 * consulta cantidad de sets ganados por el jugador
	 * @return cantidad de sets ganados
	 */
	public int getSetsGanados (){
		return this.setsGanados ;
	}
	
	/**
	 * consulta puntos ganados por el jugador
	 * @return puntos ganados por el jugador
	 */
	public int getPuntosGanados (){
		return this.puntosGanados;
	}
	
	/**
	 * reinicia cantidad de puntos al iniciar nuevo game
	 */
	public void reiniciarPuntos (){
		this.puntosGanados = 0 ;
	}
	
} //fin clase

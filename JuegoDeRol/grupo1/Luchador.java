/**
 * 
 * @author matías mariani y kevin recke
 *
 */
public class Luchador {
	
	/**
	 * @param vida contiene la vida del luchador
	 */
	private int vida = 1000;
	
	/**
	 * @param tieneTalisman determina si el luchador tiene un talisman
	 */
	private boolean tieneTalisman ;
	
	/**
	 * devuelve si el luchador contiene talisman o no
	 * @return <b>true</b> si contiene talisman y <b>false</b> si no
	 */
	public boolean getTieneTalisman (){
		return this.tieneTalisman;
	}
	
	/**
	 * crea el luchador 
	 * @param tieneTalisman contiene si el luchador posee talisman o no
	 */
	public Luchador ( boolean tieneTalisman){
		this.tieneTalisman = tieneTalisman;
	}
	
	/**
	 * marca golpe hacia el luchador golpeado
	 * @param luchadorGolpeado contiene el luchador que fue golpeado
	 */
	public void golpearLuchador(Luchador luchadorGolpeado) {

		if (!this.estaMuerto()) {
			luchadorGolpeado.recibirGolpe( this );
		}
	}// fin metodo

	/**
	 * reduce la vida del luchador golpeado
	 * @param atacante contiene el luchador que produjo el golpe
	 */
	private void reducirVida ( Luchador atacante ){
		if (!this.estaMuerto()) {
			if ( !atacante.getTieneTalisman() ){
				this.vida = this.vida - (int) (Math.random() * 100 + 1);
			} else{
				this.vida = this.vida - 2 * (int) (Math.random() * 100 + 1);
			}
		}
	}// fin metodo
	
	/**
	 * recibe el golpe otorgado al luchador
	 * @param atacante contiene el luchador que envio el golpe
	 */
	private void recibirGolpe( Luchador atacante) {
		this.reducirVida( atacante );
	}// fin metodo

	/**
	 * determina si el luchador esta vivo o muerto
	 * @return <b>true</b> si esta muerto <b>false</b> si no
	 */
	public boolean estaMuerto() {
		if (this.vida <= 0) {
			return true;
		} else {
			return false;
		}
	} // fin metodo
	

} // fin clase


public class Jugador {

	private Puntaje p = Puntaje.CERO;
	
	public Puntaje getPuntaje(){
		return p;
	}
	
	public void setPuntaje(Puntaje p) {
		this.p = p;
	}
	
	public void sumarPuntaje(){
		if(this.p == Puntaje.CERO) {
			this.p = Puntaje.QUINCE;
		 }
		else if(this.p == Puntaje.QUINCE){
			this.p = Puntaje.TREINTA;
		}
		else if(this.p == Puntaje.TREINTA){
			this.p = Puntaje.CUARENTA;
		}
		else if(this.p == Puntaje.CUARENTA){
			this.p = Puntaje.VENTAJA;
		}
	}

	public String ganar() {
		return "Gané!";
	}
}
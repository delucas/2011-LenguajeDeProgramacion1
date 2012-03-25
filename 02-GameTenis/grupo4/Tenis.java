
public class Tenis {
	private int setSaque=0;
	private int setRecepcion=0;
	private int puntosSaque=0;
	private int puntosRecepcion=0;
	//private Puntuacion
	
	
	public Puntuacion anotarPuntoSaque(){
		this.puntosSaque++;
		if(this.puntosSaque==1){
			return Puntuacion.QUINCE;
		}else{
			if (this.puntosSaque==2){
				return Puntuacion.TREINTA;
			}else{
				if (this.puntosSaque==3){
					return Puntuacion.CUARENTA;
				}else{
					if((this.puntosSaque==4) && (this.puntosRecepcion<=2)){
						return Puntuacion.TERMINA_SET;
					}else{
						if((this.puntosSaque==4) && (this.puntosRecepcion==3)){
							return Puntuacion.VENTAJA;
						}else{
							if ((this.puntosSaque>4)&&((this.puntosSaque-this.puntosRecepcion)==2)){
								this.setSaque++;
								return Puntuacion.TERMINA_SET;
							}
						}
					}
				}
			}
		}
		return Puntuacion.EMPATE;
	}
	public Puntuacion AnotarPuntoRecepcion(){
		this.puntosRecepcion++;
		return Puntuacion.EMPATE;
	}
}

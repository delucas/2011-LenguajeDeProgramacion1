
public class Set {

/**
 * pre: los puntajes SAQUE y RECEPTOR empiezan con valor igual a cero
 * post: se modela una clase que simule un game (llamado aquí SET) 
 */
	
	private int saque = 0;
	private int receptor = 0;

/**
 *  post: suma un punto para el SAQUE
 */
	
	public void anotarSaque(){
		if((saque < 4 && receptor < 4 && !(saque == 3 && receptor == 3)) 
				|| (saque >= 3 && receptor >= 3 && (saque < receptor + 2) && (receptor < saque + 2))){
			saque ++;
		}
	}
	
/**
 *  post: suma un punto para el RECEPTOR
 */
	
	public void anotarReceptor(){
		if((saque < 4 && receptor < 4 && !(saque == 3 && receptor == 3)) 
				|| (saque >= 3 && receptor >= 3 && (saque < receptor + 2) && (receptor < saque + 2))){
			receptor ++;
		}
	}
	
/**
 * post: devuelve los resultados actuales del SET
 * 
 */
	
	public String marcador(){
		String marcador = "SAQUE: 0 // RECEPTOR: 0";
		if(saque == 1 && receptor == 0){
			marcador = "SAQUE: 15 // RECEPTOR: 0";
		}
		else if(saque == 2 && receptor == 0){
			marcador = "SAQUE: 30 // RECEPTOR: 0";
		}
		else if(saque == 3 && receptor == 0){
			marcador = "SAQUE: 40 // RECEPTOR: 0";
		}
		else if(saque == 0 && receptor == 1){
			marcador = "SAQUE: 0 // RECEPTOR: 15";
		}
		else if(saque == 0 && receptor == 2){
			marcador = "SAQUE: 0 // RECEPTOR: 30";
		}
		else if(saque == 0 && receptor == 3){
			marcador = "SAQUE: 0 // RECEPTOR: 40";
		}
		else if(saque == 1 && receptor == 1){
			marcador = "SAQUE: 15 // RECEPTOR: 15";
		}
		else if(saque == 2 && receptor == 1){
			marcador = "SAQUE: 30 // RECEPTOR: 15";
		}
		else if(saque == 3 && receptor == 1){
			marcador = "SAQUE: 40 // RECEPTOR: 15";
		}
		else if(saque == 2 && receptor == 2){
			marcador = "SAQUE: 30 // RECEPTOR: 30";
		}
		else if(saque == 3 && receptor == 2){
			marcador = "SAQUE: 40 // RECEPTOR: 30";
		}
		else if(saque == 1 && receptor == 2){
			marcador = "SAQUE: 15 // RECEPTOR: 30";
		}
		else if(saque == 1 && receptor == 3){
			marcador = "SAQUE: 15 // RECEPTOR: 40";
		}
		else if(saque == 2 && receptor == 3){
			marcador = "SAQUE: 30 // RECEPTOR: 40";
		}
		else if(saque >= 3 && receptor >= 3 && saque == receptor){
			marcador = "DEUCE";
		}
		else if(saque >= 3 && receptor >= 3 && saque == receptor + 1){
			marcador = "VENTAJA SAQUE";
		}
		else if(saque >= 3 && receptor >= 3 && receptor == saque + 1){
			marcador = "VENTAJA RECEPTOR";
		}
		else if(saque == 4 && receptor < 3){
			marcador = "SET PARA SAQUE";
		}
		else if(saque < 3 && receptor == 4){
			marcador = "SET PARA RECEPTOR";
		}
		else if(saque >= 3 && receptor >= 3 && saque > receptor + 1){
			marcador = "SET PARA SAQUE";
		}
		else if(saque >= 3 && receptor >= 3 && receptor > saque + 1){
			marcador = "SET PARA RECEPTOR";
		}
		return marcador;
	}

/**
 * post: devuelve un valor VERDADERO o FALSO sobre la finalización del Set disputado
 */
	
	public boolean setFinalizado(){
		if(!((saque < 4 && receptor < 4 && !(saque == 3 && receptor == 3)) 
				|| (saque >= 3 && receptor >= 3 && (saque < receptor + 2) && (receptor < saque + 2)))){
			return true;
		}else{
			return false;
		}
	}
/**
 *  post: devuelve la cantidad de veces que el SAQUE anoto
 */
	public int getVecesQueSaqueAnoto(){
		return saque;
	}

/**
 * post: devuelve la cantidad de veces que el RECEPTOR anoto
 */
	
	public int getVecesQueReceptorAnoto(){
		return receptor;
	}
}
public class Partido {
	
	private Set set1;
	private Set set2;
	private Set set3;
	private Set set4;
	private Set set5;
	private String ganador;
	private int contadorSaque;
	private int contadorRecepcion;
	
	Partido(){	
		this.set1 = new Set();	
		this.set2 = new Set();
		this.set3 = new Set();
		this.set4 = new Set();
		this.set5 = new Set();
	}
	
	public void puntajePartido(){
		if (this.set1.definirEstadoDelJuego() == "gana saque"){ 
			contadorSaque =+ 1;
			
		}else if(this.set1.definirEstadoDelJuego() == "gana recepcion"){
			contadorRecepcion =+ 1;
		}
		
		if (this.set2.definirEstadoDelJuego() == "gana saque"){ 
			contadorSaque =+ 1;
			
		}else if(this.set2.definirEstadoDelJuego() == "gana recepcion"){
			contadorRecepcion =+ 1;
		}
		
		if (this.set3.definirEstadoDelJuego() == "gana saque"){ 
			contadorSaque =+ 1;
			
		}else if(this.set3.definirEstadoDelJuego() == "gana recepcion"){
			contadorRecepcion =+ 1;
		}
		if (this.set4.definirEstadoDelJuego() == "gana saque"){ 
			contadorSaque =+ 1;
			
		}else if(this.set4.definirEstadoDelJuego() == "gana recepcion"){
			contadorRecepcion =+ 1;
		}
		if (this.set5.definirEstadoDelJuego() == "gana saque"){ 
			contadorSaque =+ 1;
			
		}else if(this.set5.definirEstadoDelJuego() == "gana recepcion"){
			contadorRecepcion =+ 1;
		}
		
		
		
	}
	
	
	
	public String resultadoPartido(){
		if (this.contadorSaque >= 3){
			this.ganador = "gano el que saca";
		}else if (this.contadorRecepcion >= 3){
			this.ganador = "gano el receptor";
			
		}
		
		
		return ganador;
	}
	
	
	

}

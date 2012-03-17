public class Personaje {
	
	private int vida = 100;
	private int danio;
	private String nombre;
	private int vendas = 3;
	private int berserker = 3;
	private int armadura = 100;
	
	
	public Personaje(int danio, String nombre){
		nombre = this.nombre;
		danio = this.danio;
		
	}
	
	public String atacar(Personaje otroPersonaje){
		if(otroPersonaje.vida > 0){
			if(otroPersonaje.armadura > 0){
		 otroPersonaje.armadura = otroPersonaje.armadura - (this.danio);
		 }
				else if (otroPersonaje.armadura == 0){otroPersonaje.vida = otroPersonaje.vida - (this.danio);}
		
		
		}return this.nombre + " ha atacado a " + otroPersonaje.nombre;
	
				
	}

	public String curarse(){
		if (this.vida > 100){
			return "Tienes bastante vida disponible";
		}
		else if (this.vida < 75 ^ this.vendas >= 1){
			this.vida = this.vida + 25;
			this.vendas = this.vendas - 1;
		}
		return this.nombre + " se ha curado, tiene " + this.vida + " de vida y solo le queda " + this.vendas + " disponibles ";
	
	}
	
	public String rendirse(Personaje otroPersonaje) {
		return this.nombre + " se ha rendido, " + otroPersonaje.nombre + "ha ganado la pelea";
    }
	
	public String finalizar(Personaje otroPersonaje){
		if (otroPersonaje.vida < 10){
			otroPersonaje.vida = 0;
		}
		return this.nombre + " ha finalizado a " + otroPersonaje.nombre;
	}
	
	public String enfurecerse(){
		if (this.vida > 30 ^ this.berserker >= 1){
		this.danio = this.danio + (this.danio/2);	
		}
			else if (this.vida <=30){

		}
		return this.nombre + "se ha enfurecido";
	}
	
	
}

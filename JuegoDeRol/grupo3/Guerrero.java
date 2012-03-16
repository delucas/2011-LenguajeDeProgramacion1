enum Armas {
	MAZO, ESPADA, DAGA, VARA
}
public class Guerrero {
	private String nombreGuerrero;
	private Armas arma;

	private int vida=100;
	
	public Guerrero (String nombre, Armas armaGuerrero){
		this.nombreGuerrero = nombre;
		this.arma = armaGuerrero;

	}
	
	public void golpear(Guerrero guerreroAGolpear){
		if(this.vida>0){
			guerreroAGolpear.vida = guerreroAGolpear.vida - (int)(Math.random()*10)+1; 			
		}
		
		
	}
	public int getVida(){
		return this.vida;
	}

}

public class Guerrero {

	private int vida = 100;

	public Guerrero() {

	}

	public void golpear(Guerrero guerreroAGolpear) {

		if (this.vida > 0) {
			if (guerreroAGolpear.getVida() >= 0) {
				guerreroAGolpear.vida = guerreroAGolpear.vida
						- (int) (Math.random() * 20) + 1;
			}
			if(guerreroAGolpear.getVida()<=0){
				guerreroAGolpear.vida = 0;
			}
		}

	}

	public int getVida() {
		return this.vida;
	}

	
}

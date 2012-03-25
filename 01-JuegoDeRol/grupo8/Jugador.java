public class Jugador {
		private int vida;
		private int defensa;
		private int ataqueMaximo;
		
		
		Jugador(int vida, int defensa, int ataqueMaximo){
		this.vida = vida;
		this.defensa = defensa;
		this.ataqueMaximo = ataqueMaximo;
	
		}
		
		public int ataque(){
			return (int) (Math.random()*200)+1;
		}
		
		public int estadoVida(){
			return this.vida;
		}
		
		public int estadoDefensa(){
			return this.defensa;
		}
		
}

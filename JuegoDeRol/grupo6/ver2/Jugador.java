enum Tipo {

	DEMONIO, GUERRERO, HADA;
}

public class Jugador {

	private String nombre;
	private int ataque;
	private int defensa;
	private Tipo tipo;
	private int vida = 2000;

	public Jugador(String nombre, int ataque, int defensa, Tipo tipo) {

		this.ataque = ataque;
		this.defensa = defensa;
		this.nombre = nombre;
		this.tipo = tipo;

		

			if (tipo == Tipo.GUERRERO) {

				this.ataque = this.ataque + 500;

			}

			if (tipo == Tipo.DEMONIO) {

				this.ataque = this.ataque + 250;

				this.defensa = this.defensa + 250;

			}

			if (tipo == Tipo.HADA) {

				this.defensa = this.defensa + 500;

			}
		

	}

	public int getVida() {
		return vida;
	}

	public String getNombre() {
		return nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setVida(int vida) {

		this.vida = vida;

	}

}

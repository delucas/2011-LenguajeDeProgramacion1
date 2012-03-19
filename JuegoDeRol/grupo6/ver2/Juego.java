public class Juego {

	private Jugador j1;
	private Jugador j2;
	private Jugador j3;
	private int vidaAtaca;
	private int vidaRecibe;
	private String anuncio;

	public Juego(Jugador j1, Jugador j2, Jugador j3) {

		this.j1 = j1;
		this.j2 = j2;
		this.j1 = j3;
		this.vidaAtaca = 2000;
		this.vidaRecibe = 2000;

	}

	public String jugar(Jugador ataca, Jugador recibe) {

		if (this.j1 == ataca || this.j2 == ataca || this.j3 == ataca) {

			this.j1 = recibe;
			this.j2 = recibe;
			this.j3 = recibe;

		}

		if (ataca.getAtaque() > recibe.getDefensa() && this.vidaAtaca > 0
				&& this.vidaRecibe > 0) {

			this.vidaRecibe = this.vidaRecibe
					- (ataca.getAtaque() - recibe.getDefensa());

			this.anuncio = "la vida del receptor es de" + " " + this.vidaRecibe;

		}

		if (ataca.getAtaque() == recibe.getDefensa() && this.vidaAtaca > 0
				&& this.vidaRecibe > 0) {

			this.vidaRecibe = this.vidaRecibe - 50;

			this.anuncio = "la vida del receptor es de" + " " + this.vidaRecibe;

		}

		if (ataca.getAtaque() < recibe.getDefensa() && this.vidaAtaca > 0
				&& this.vidaRecibe > 0) {

			this.vidaAtaca = this.vidaAtaca
					- (recibe.getDefensa()- ataca.getAtaque());

			this.anuncio = "la vida del atacante es de" + " " + this.vidaAtaca;

		}

		if (this.vidaAtaca <= 0 || this.vidaRecibe <= 0) {

			this.anuncio = "finalizo la pelea";

		}

		return this.anuncio;

	}

}

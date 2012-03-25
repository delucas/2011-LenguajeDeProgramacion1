public class Game {

	private String estado;
	private int puntoSaque = 0;
	private int puntoRecepcion = 0;
	private int setSaque = 0;
	private int setRecepcion = 0;

	public String anotarPuntoSaque() {

		if (this.setSaque >= 3 || this.setRecepcion >= 3) {

			Error error = new Error("los sets deben ser menore o iguales a 3");

			throw error;

		}

		if (this.puntoSaque == 0) {

			this.puntoSaque = 15;

			this.estado = "15";

		} else if (this.puntoSaque == 15) {

			this.puntoSaque = 30;

			this.estado = "30";

		} else if (this.puntoSaque == 30) {

			this.puntoSaque = 40;

			this.estado = "40";

		} else if (this.puntoSaque == 40 && this.puntoRecepcion == 40) {

			this.puntoSaque = 45;

			this.estado = "ventaja saque";

		} else if (this.puntoSaque == 45 && this.puntoRecepcion == 40) {

			this.puntoRecepcion = 0;
			this.puntoSaque = 0;
			this.setSaque = this.setSaque + 1;
			this.estado = "gano Saque," + " " + this.setSaque + " " + "a" + " "
					+ this.setRecepcion;
			if (this.setSaque == 3 && this.setRecepcion != 3) {

				this.estado = "termino el partido, gano el saque" + " "
						+ this.setSaque + " " + "a" + " " + this.setRecepcion;
			}

		}

		else if (this.puntoSaque == 40 && this.puntoRecepcion == 45) {

			this.puntoSaque = 40;
			this.puntoRecepcion = 40;

			this.estado = "deuce";

		} else if (this.puntoSaque == 40 && this.puntoRecepcion < 40) {

			this.setSaque = this.setSaque + 1;
			this.puntoRecepcion = 0;
			this.puntoSaque = 0;
			this.estado = "gano saque," + " " + this.setSaque + " " + "a" + " "
					+ this.setRecepcion;

			if (this.setSaque == 3 && this.setRecepcion != 3) {

				this.estado = "termino el partido, gano el saque" + " "
						+ this.setSaque + " " + "a" + " " + this.setRecepcion;
			}
		}

		return this.estado;
	}

	public String anotarPuntoRecepcion() {

		if (this.setSaque >= 3 || this.setRecepcion >= 3) {

			Error error = new Error("los sets deben ser menore o iguales a 3");

			throw error;

		}

		if (this.puntoRecepcion == 0) {

			this.puntoRecepcion = 15;

			this.estado = "15";

		} else if (this.puntoRecepcion == 15) {

			this.puntoRecepcion = 30;

			this.estado = "30";

		} else if (this.puntoRecepcion == 30) {

			this.puntoRecepcion = 40;

			this.estado = "40";

		} else if (this.puntoSaque == 40 && this.puntoRecepcion == 40) {

			this.puntoRecepcion = 45;

			this.estado = "ventaja recepcion";

		} else if (this.puntoRecepcion == 45 && this.puntoSaque == 40) {

			this.setRecepcion = this.setRecepcion + 1;
			this.puntoRecepcion = 0;
			this.puntoSaque = 0;
			this.estado = "gano recepcion," + " " + this.setRecepcion + " "
					+ "a" + " " + this.setSaque;

			if (this.setRecepcion == 3 && this.setSaque != 3) {

				this.estado = "termino el partido, gano el receptor" + " "
						+ this.setRecepcion + " " + "a" + " " + this.setSaque;
			}

		}

		else if (this.puntoRecepcion == 40 && this.puntoSaque == 45) {

			this.puntoRecepcion = 40;
			this.puntoSaque = 40;

			this.estado = "deuce";

		} else if (this.puntoRecepcion == 40 && this.puntoSaque < 40) {

			this.setRecepcion = this.setRecepcion + 1;
			this.puntoRecepcion = 0;
			this.puntoSaque = 0;
			this.estado = "gano recepcion," + " " + this.setRecepcion + " "
					+ "a" + " " + this.setSaque;

			if (this.setRecepcion == 3 && this.setSaque != 3) {

				this.estado = "termino el partido, gano el receptor" + " "
						+ this.setRecepcion + " " + "a" + " " + this.setSaque;
			}
		}

		return this.estado;

	}

}
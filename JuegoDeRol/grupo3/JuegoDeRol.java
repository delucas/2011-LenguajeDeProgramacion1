public class JuegoDeRol {

	public String combate(Guerrero golpeador, Guerrero golpeado) {
		String tipoDeGolpe = "hit";
		golpeador.golpear(golpeado);
		if ((int) (Math.random() * 20) + 1 > 13
				&& (int) (Math.random() * 20) + 1 <= 20) {
			return tipoDeGolpe = "critical";

		}
		return tipoDeGolpe;
	}

}

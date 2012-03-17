
public class Luchador {
	
	private Raza raza;
	private Estado estado;
	
	public Luchador(Raza raza){		
		this.setEstado(Estado.VIVO);
		this.setRaza(raza);	
	}


	private void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}
		
}

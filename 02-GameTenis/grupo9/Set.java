
public class Set {
	

	private Jugador j1;
	private Jugador j2;

	
	public Set (Jugador j1, Jugador j2) {
		this.j1 = j1;
		this.j2 = j2;
	}
	
	public void jugada() {
		double punto = Math.random();

		if (punto < 0.5 && !(j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.CUARENTA)){
			j1.sumarPuntaje();
		}
		else if(punto >= 0.5 && punto < 1  && !(j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.CUARENTA)) {
			j2.sumarPuntaje();
		}
		else if(punto < 0.5 && (j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() != Puntaje.CUARENTA)){
			j1.ganar();
		}
		else if(punto >= 0.5 && punto < 1 && (j2.getPuntaje() == Puntaje.CUARENTA && j1.getPuntaje() != Puntaje.CUARENTA)){
			j2.ganar();
		}
		else if(punto < 0.5 && (j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.CUARENTA)){
			j1.sumarPuntaje();
		}
		else if(punto >= 0.5 && punto < 1 && (j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.CUARENTA)){
			j2.sumarPuntaje();
		}	
		else if(punto < 0.5 && (j1.getPuntaje() == Puntaje.VENTAJA && j2.getPuntaje() == Puntaje.CUARENTA)){
			j1.ganar();
		}
		else if(punto >= 0.5 && punto < 1 && (j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.VENTAJA)){
			j2.ganar();
		}
		else if(punto < 0.5 && (j1.getPuntaje() == Puntaje.CUARENTA && j2.getPuntaje() == Puntaje.VENTAJA)){
			j2.setPuntaje(Puntaje.CUARENTA);
		}
		else if(punto >= 0.5 && punto < 1 && (j1.getPuntaje() == Puntaje.VENTAJA && j2.getPuntaje() == Puntaje.CUARENTA)){
			j1.setPuntaje(Puntaje.VENTAJA);
		}
	
	}
	
}
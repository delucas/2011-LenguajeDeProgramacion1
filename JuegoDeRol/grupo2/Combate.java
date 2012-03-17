
public class Combate {
	
	private Terreno terreno;
	private Resultado resultado;
	
	public Combate(Terreno terreno){
		this.setTerreno(terreno);
		this.setResultado(Resultado.EMPATE);
	}
	
	public void iniciarCombate(Luchador luchador1, Luchador luchador2){
		if(this.getTerreno() == Terreno.MONTAÑA || luchador1.getRaza() == luchador2.getRaza()){
			this.setResultado(Resultado.EMPATE);
			luchador1.setEstado(Estado.HERIDO);
			luchador2.setEstado(Estado.HERIDO);
		}
		
		else if(this.getTerreno() == Terreno.LLANURA && luchador1.getRaza() == Raza.HUMANO && luchador2.getRaza() == Raza.ORCO || 
				this.getTerreno() == Terreno.LLANURA && luchador1.getRaza() == Raza.HUMANO && luchador2.getRaza() == Raza.ELFO){
					this.setResultado(Resultado.VICTORIAJUGADOR1);
					luchador2.setEstado(Estado.MUERTO);
		}
		
		else if(this.getTerreno() == Terreno.LLANURA && luchador2.getRaza() == Raza.HUMANO && luchador1.getRaza() == Raza.ORCO || 
				this.getTerreno() == Terreno.LLANURA && luchador2.getRaza() == Raza.HUMANO && luchador1.getRaza() == Raza.ELFO){
					this.setResultado(Resultado.VICTORIAJUGADOR2);
					luchador1.setEstado(Estado.MUERTO);
		}
		
		else if(this.getTerreno() == Terreno.MESETA && luchador1.getRaza() == Raza.ORCO && luchador2.getRaza() == Raza.HUMANO || 
				this.getTerreno() == Terreno.MESETA && luchador1.getRaza() == Raza.ORCO && luchador2.getRaza() == Raza.ELFO){
					this.setResultado(Resultado.VICTORIAJUGADOR1);
					luchador2.setEstado(Estado.MUERTO);
		}
		
		else if(this.getTerreno() == Terreno.MESETA && luchador2.getRaza() == Raza.ORCO && luchador1.getRaza() == Raza.HUMANO || 
				this.getTerreno() == Terreno.MESETA && luchador2.getRaza() == Raza.ORCO && luchador1.getRaza() == Raza.ELFO){
					this.setResultado(Resultado.VICTORIAJUGADOR2);
					luchador1.setEstado(Estado.MUERTO);
		}
		
		else if(this.getTerreno() == Terreno.BOSQUE && luchador1.getRaza() == Raza.ELFO && luchador1.getRaza() == Raza.HUMANO || 
				this.getTerreno() == Terreno.BOSQUE && luchador1.getRaza() == Raza.ELFO && luchador1.getRaza() == Raza.ORCO){
					this.setResultado(Resultado.VICTORIAJUGADOR1);
					luchador2.setEstado(Estado.MUERTO);
		}
		
		else if(this.getTerreno() == Terreno.BOSQUE && luchador2.getRaza() == Raza.ELFO && luchador1.getRaza() == Raza.HUMANO || 
				this.getTerreno() == Terreno.BOSQUE && luchador2.getRaza() == Raza.ELFO && luchador1.getRaza() == Raza.ORCO){
					this.setResultado(Resultado.VICTORIAJUGADOR2);
					luchador1.setEstado(Estado.MUERTO);
		}
	}

	
	public Terreno getTerreno() {
		return terreno;
	}
	
	private void setTerreno(Terreno terreno){
		this.terreno = terreno;
	}
	
	public Resultado getResultado(){
		return this.resultado;
	}
	
	private void setResultado(Resultado resultado){
		this.resultado = resultado;
	}

}

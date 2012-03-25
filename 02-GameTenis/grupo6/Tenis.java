public class Tenis
{
	int setTotal;
	int setJugador1;
	int setJugador2;
	String puntosJugador1;
	String puntosJugador2;
	String sacador ;
	String Ganador;
	int puntoTieBreak1;
	int puntoTieBreak2;
	 
	public Tenis ()
	{
		this.seteo();
	}
	private void seteo()
	{
		this.setTotal = 0;
		this.setJugador1 = 0;
		this.setJugador2 = 0;
		this.puntosJugador1= "0";
		this.puntosJugador2= "0";
		this.puntoTieBreak1 = 0;
		this.puntoTieBreak2 = 0;
		this.Ganador = "Ninguno";
		this.sacador = "Saca jugador1";	
	}
	
	public void jugar()
	{
		int num = (int) (Math.random()*100)+1;
		int resto = num%2;	
		
		if (this.Ganador != "Ninguno" && (this.puntosJugador1 == "0" || this.puntosJugador2 =="0"))
		{
			Error Puntos = new Error ("El partido ya finalizo");
			throw Puntos;	
		}
		if (resto == 0)
		{
			if(this.setJugador1 != 4 || this.setJugador2 != 4)
			{
				this.anotarPuntoJugador1();
			}
			else if (this.setJugador1 == 4 && this.setJugador2 == 4)
			{
				this.TieBreakJugador1();
			}
		}
		
		else if (resto == 1)
		{
			if(this.setJugador1 != 4 || this.setJugador2 != 4)
			{
				this.anotarPuntoJugador2();
			}
			else if (this.setJugador1 == 4 && this.setJugador2 == 4)
			{
				this.TieBreakJugador2();
			}
		}
		
		
	}
	
	
	private void anotarPuntoJugador1()
	{
		if (this.puntosJugador1  == "0")
		{
			this.puntosJugador1 = "15";
		}
		
		else if (this.puntosJugador1  == "15")
		{
			this.puntosJugador1 = "30";
		}
		
		else if (this.puntosJugador1  == "30" && this.puntosJugador2 != "40")
		{
			this.puntosJugador1 = "40";
		}
		
		else if ((this.puntosJugador1 == "30" && this.puntosJugador2 == "40") || (this.puntosJugador2 == "Ventaja jugador2"))
		{
			this.puntosJugador1 = "Deuce";
			this.puntosJugador2 = "Deuce";
		}	
		else if (this.puntosJugador1 == "Deuce")
		{
			this.puntosJugador1 = "Ventaja jugador1";
			this.puntosJugador2 = "Deuce";
		}
		
		
			
		else if (this.puntosJugador1 == "Ventaja jugador1" || this.puntosJugador1 == "40")
		{
			this.puntosJugador1 = "0";	
			this.puntosJugador2 = "0";
			this.setJugador1 ++;
			this.setTotal++;
			if ( this.setJugador1 >= 3 && (this.setJugador1 - this.setJugador2) >= 2 )
			{
				this.Ganador = "Ganó el jugador 1";		
			}
			if (this.sacador == "Saca jugador1")
			{
				this.sacador = "Saca jugador2";
			}
			else if (this.sacador == "Saca jugador2")
			{
				this.sacador = "Saca jugador1";
			}	
		}
	}	
			
	
	private void anotarPuntoJugador2()
	{
	
		if (this.puntosJugador2  == "0")
		{
			this.puntosJugador2 = "15";

		}
		
		else if (this.puntosJugador2  == "15")
		{
			this.puntosJugador2 = "30";
		}
		else if (this.puntosJugador2 == "30" && this.puntosJugador1 != "40")
		{
			this.puntosJugador2 = "40";
		}

		else if (this.puntosJugador2  == "30" && this.puntosJugador1 != "40")
		{
			this.puntosJugador1 = "40";
		}
		
		else if ((this.puntosJugador2 == "30" && this.puntosJugador1 == "40") || (this.puntosJugador1 == "Ventaja jugador1"))
		{
			this.puntosJugador2 = "Deuce";
			this.puntosJugador1 = "Deuce";
		}	
		else if (this.puntosJugador2 == "Deuce")
		{
			this.puntosJugador2 = "Ventaja jugador2";
			this.puntosJugador1 = "Deuce";
		}
		
		else if (this.puntosJugador2 == "Ventaja jugador2" || this.puntosJugador2 == "40")
		{
			this.puntosJugador2 = "0";
			this.puntosJugador1 = "0";	
			this.setJugador2 ++;
			this.setTotal ++;
			
			if (this.setJugador2 >= 3 && (this.setJugador2 - this.setJugador1) >= 2 )
			{
				this.Ganador = "Ganó el jugador 2";			
			}
			
			if (this.sacador == "Saca jugador1")
			{
				this.sacador = "Saca jugador2";
			}
			else if (this.sacador == "Saca jugador2")
			{
				this.sacador = "Saca jugador1";
			}
		}
	}

	
	private void TieBreakJugador1()
	{
		
		if (this.puntoTieBreak1 < 7 )
		{
			this.puntoTieBreak1++;
		}
		else if ((this.puntoTieBreak1 - this.puntoTieBreak2) >= 2 && (this.puntoTieBreak1 >= 7))
		{
			this.setJugador1++;
			this.Ganador = "Ganó el jugador1";
		}

		
	}	
	private void TieBreakJugador2()
	{
		if (this.puntoTieBreak2 < 7 )
		{
			this.puntoTieBreak2++;
		}		
		else if ((this.puntoTieBreak2 - this.puntoTieBreak1) >= 2 && (this.puntoTieBreak2 >= 7))
		{
			this.setJugador2++;
			this.Ganador = "Ganó el jugador1";
		}		
	}
	
	


	
	public int getPuntoTieBreak1()
	{
		return this.puntoTieBreak1;
	}
	public int getPuntoTieBreak2()
	{
		return this.puntoTieBreak2;
	}
	public int getSetTotal() {
		return setTotal;
	}
	public int getSetJugador1() {
		return setJugador1;
	}
	public int getSetJugador2() {
		return setJugador2;
	}
	public String getPuntosJugador1() {
		return puntosJugador1;
	}
	public String getPuntosJugador2() {
		return puntosJugador2;
	}
	public String getSacador() {
		return sacador;
	}
	public String getGanador() {
		return Ganador;
	}	
	
	
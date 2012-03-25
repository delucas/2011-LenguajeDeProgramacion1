
public class Fight {


	private Peleador p1;
	private Peleador p2;
	private int defensap1 = 1;
	private int defensap2 = 1;
	private boolean muerto;
	private int critico = 0;
	

	public void atacar (Peleador atacante, Peleador defensor) {
		this.p1 = atacante;
		this.p2 = defensor;
		this.critico =  ((int) (Math.random() * 4)+1 );
		if (this.critico >= 1){
			if ((this.defensap2 >0 ) || (this.defensap1 >0 )){
			
			this.defensap2 = this.p2.getDefensa()- this.p1.getAtaque();			
		
			}
			
		}
		else if (this.critico < 1){
			if ((this.defensap2 >0 ) || (this.defensap1 >0 )){
				
				this.defensap2 = this.p2.getDefensa()- (this.p1.getAtaque()*2);			
			
				}
		}
	}
	
	public boolean getEstadoplayer1 (){
		if (this.defensap1 > 0){
			this.muerto = false ;
		}
		else if (this.defensap1 <= 0){
			this.muerto = true;
		}
		return this.muerto;
	}
	
	public boolean getEstadoplayer2 (){
		if (this.defensap2 > 0){
			this.muerto = false ;
		}
		else if (this.defensap2 <= 0){
			this.muerto = true;
		}
		return this.muerto;
	}
	
}


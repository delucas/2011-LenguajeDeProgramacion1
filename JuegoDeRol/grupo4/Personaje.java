enum Rol{ESPADACHIN, HECHIZERO}

public class Personaje {
	int vida;
	int escudo;
	int espejo;
	Rol usuario;
/**
 * pre: usuario comprende los valores ESPADACHIN y HECHIZERO.
 * post: inicializa un personaje con el rol indicado, teniendo valores de vida y defensa, siendo
 * esta ultima escudo para el ESPADACHIN y espejo para el HECHIZERO.
 */
	Personaje(Rol usuario){
		this.usuario = usuario;
		if(usuario == Rol.ESPADACHIN){
			vida = 300;
			escudo = 100;
		}else if(usuario == Rol.HECHIZERO){
			vida = 200;
			espejo = 200;
		}
	}
/**
 *  pre: otro comprende al personaje al que se quiere atacar.
 *	post: modifica los valores de vida y defensa del personaje atacado.
 */
	
	void atacar(Personaje otro){
		int daño = (int)(Math.random() * 100) + 1;
		if(otro.vida > 0){
			if(otro.usuario == Rol.ESPADACHIN && otro.vida > 0){
				if(otro.escudo > 0){
					otro.escudo = otro.escudo - daño;
				}else{
					otro.escudo = 0;
					otro.vida = otro.vida - daño;
				}
			}
			else if(otro.usuario == Rol.HECHIZERO && otro.vida > 0){
				if(otro.espejo > 0){
					otro.espejo = otro.espejo - daño;
				}else{
					otro.espejo = 0;
					otro.vida = otro.vida - daño;
				}
			}
		}else{
			otro.vida = 0;
		}
	}
/**
 * post: devuelve la informacion actual del personaje.
 */
	void getStatus(){
		if(vida > 0){
			if(usuario == Rol.ESPADACHIN){
				System.out.print("Rol: ESPADACHIN" + " " + "Vida: " + vida + " " + "Escudo: " + escudo);
			}else if(usuario == Rol.HECHIZERO){
				System.out.print("Rol: HECHIZERO"+ " " + "Vida: " + vida + " " + "Espejo: " + espejo);
			}
			}else{
				System.out.print("Ya haz acabado con tu oponente");
			}
		}
	}

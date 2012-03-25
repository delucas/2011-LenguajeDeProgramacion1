public class Personajes 
{
 int ataque;
 int salud;
 boolean GolpePersonaje1 = false;
 boolean GolpePersonaje2 = false;
 String Vida;
 public Personajes (int Ataque, int Salud)
 {
  this.ataque = Ataque;
  this.salud = Salud;
  this.Vida = "Esta vivo";
 }
 void GolpeaPersonaje1 (Batalla batalla, Personajes personaje1,
Personajes personaje2)
 {
  if (personaje2.salud > 0)
  {
   this.GolpePersonaje1 = true;
  batalla.pelear(personaje1, personaje2);
  }
 }
 void GolpeaPersonaje2 (Batalla batalla, Personajes personaje1,
Personajes personaje2)
 {
  if  (personaje1.salud > 0)
  {
   this.GolpePersonaje2 = true;
  batalla.pelear(personaje1, personaje2);
  }
 }
 public int getSalud()
 {
  return this.salud;
 }
 public int getAtaque()
 {
  return this.ataque;
 }
 public String Vida()
 {
  return this.Vida;
 }
}

public class Batalla
{
 int golpe = 0 ;
 public void pelear (Personajes personaje1, Personajes personaje2)
 { 
  if (personaje1.GolpePersonaje1 == true)
  { 
   if(this.golpe >= 0 && this.golpe < 4)
   {
    personaje2.salud =personaje2.saludpersonaje1.ataque;
    this.golpe ++;
   }
   else if (this.golpe == 4)
   {
    personaje2.salud = personaje2.salud -
(personaje1.ataque*2);
    this.golpe = 1;
   } 
   personaje1.GolpePersonaje1 = false; 
  }
  else if (personaje2.GolpePersonaje2 == true)
  {
   if(this.golpe >= 0 && this.golpe < 4)
   {
    personaje1.salud =personaje1.saludpersonaje2.ataque;
    this.golpe ++;
   }
   else if (this.golpe == 4)
   {
    personaje1.salud = personaje1.salud -
(personaje2.ataque*2);
    this.golpe = 1;
   }
   personaje2.GolpePersonaje2 = false;
  }
  else if (personaje1.salud <= 0)
  {
   personaje1.Vida = "Esta muerto";
  }
  else if (personaje2.salud <= 0)
  {
   personaje2.Vida = "Esta muerto";
  }
 }
 int getGolpe()

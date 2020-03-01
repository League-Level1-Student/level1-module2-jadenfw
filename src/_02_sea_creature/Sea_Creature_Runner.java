package _02_sea_creature;

public class Sea_Creature_Runner {

	public static void main(String[] args) 
	{
		SeaCreature sponge = new SeaCreature("spongebob");
		SeaCreature pat = new SeaCreature("Patrick");
		SeaCreature squid = new SeaCreature("Squidward");
		
		sponge.getName();
		sponge.eat();
		sponge.laugh();
		
		pat.getName();
		pat.eat();
		pat.laugh();
		
		squid.getName();
		squid.eat();
		squid.laugh();
	}
	
}

package _03_smurf;

public class smurf_runner {
public static void main(String[] args) 
{		
	Smurf handy = new Smurf("Handy Smurf", "white", "boy");
	Smurf papa = new Smurf("Papa Smurf", "red", "boy");
	Smurf surfet = new Smurf("Smurfette", "white", "girl");
	
	
	System.out.println(handy.getName());
	handy.eat();
	
	System.out.println(papa.getName());
	papa.eat();
	
	System.out.println(surfet.getName());
	surfet.eat();
	
	
	
	
}
}

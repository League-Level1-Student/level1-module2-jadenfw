package _04_tea_maker;

public class tea_runner {
public static void main(String[] args) 
{
	TeaBag bag = new TeaBag("green");
	System.out.println(bag.getFlavor());
	
	Kettle kettel = new Kettle();
	
	kettel.getWater();
	kettel.boil();
	
	Cup cup = new Cup();
	cup.makeTea(bag, kettel.getWater());
}
	
	
}

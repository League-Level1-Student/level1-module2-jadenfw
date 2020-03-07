package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
    public String welcome(String name, boolean isWoman, boolean isKnighted) 
    {
    this.name = name;
    this.isWoman = isWoman;
    this.isKnighted = isKnighted;
    if(isWoman == true)
    {
	return "Hello Ms. Austen";
    }
    else if(isKnighted == true)
    {
    	return "Hello Sir Isaac Newton";
    }
    else 
    {
	return "Hello Mr. Orwell";
    }
}
}
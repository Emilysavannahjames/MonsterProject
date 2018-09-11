package Model;

public class MarshmallowMonster
{
	//---declaration section---
	
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	//--------------------------
	
	public MarshmallowMonster()
	{
		//default constructor
		//generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
		
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount= arms;
	}
	
	public String toString()
	{
		String description = "This monster is named " + name
								+ " and it has " + legCount + " legs..."
								+ " it has "+ eyeCount + " eyes, " 
								+ " its favorite scary thing to say is: "
								+ "RAWR!";
		return description;
	}
}

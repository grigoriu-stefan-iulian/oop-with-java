public class Bird extends Animal{
	
	// The constructor initializes all objects
	
	public Bird(){
		
		super();
		
		setSound("Tweet");
		
		// We set the Flies interface polymorphically
		// This sets the behavior as a non-flying Animal
		
		flyingType = new ItFlies();
		
	}
	
}
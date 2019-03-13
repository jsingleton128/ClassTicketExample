package ticket;
//Superclass for all tickets
public abstract class Ticket {//You cannot instantiate abstract classes
	//fields
	public int number;
	
	//constructors
	public Ticket(int number) {
		//set the value of field to the argument passed to the constructor
		this.number = number;
		
	}
	
	//methods
	public abstract double getPrice(); //Abstract methods do not have implementation
							//therefore the subclass is required to implement the method
	
	//implement printing the object as a string by overriding toString method
	//of the Object class
	@Override
	public String toString() {
		return "Number: " + this.number + ", Price: " + this.getPrice();
	}
}

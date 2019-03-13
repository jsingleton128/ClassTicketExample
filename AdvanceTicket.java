package ticket;

public class AdvanceTicket extends Ticket {
	public int number;
	private int daysInAdvance;
	
	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
	}
				
	
	@Override
	public double getPrice() {
		if(this.daysInAdvance >= 10) {
			return 30.00;	
		}
		else {
			return 40.00;
		}
		
	}
	
}

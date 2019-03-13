package ticket;

public class StudentAdvanceTicket extends AdvanceTicket {
	private int number;
	private int daysInAdvance;

	public StudentAdvanceTicket(int number, int daysInAdvance) {
		super(number, daysInAdvance);
		
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() / 2;	
		}
	

}


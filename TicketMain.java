package ticket;

public class TicketMain {

	public static void main(String[] args) {
		//Ticket t = new Ticket(100); Error: cannot instantiate abstract classes
		
		WalkupTicket wt1 = new WalkupTicket(101); //is a relationship (polymorphism)
		
		
	//get ticket price
		System.out.println(wt1.getPrice());
		System.out.println(wt1.toString());
		
		
		Ticket[] t = {new WalkupTicket(102), new AdvanceTicket(103, 15), new AdvanceTicket(104, 7),
						new WalkupTicket(105), new AdvanceTicket(106, 42),  new StudentAdvanceTicket(107, 4)};
		
		for (int i = 0; i < t.length; i++) {
			//System.out.println(t[i].getClass());
			System.out.println(t[i].getClass().toString().substring(13) + " " + t[i].toString());
			
		}
		
		
	}

}

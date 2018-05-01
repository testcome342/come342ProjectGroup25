
public class AdminStaff extends StaffMember {

	public AdminStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super(staffNo, staffName, staffStartDate, staffEmailAddress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void type() {
		System.out.println("Calisma pozisyonu Admin");
		
	}
	
	
	}



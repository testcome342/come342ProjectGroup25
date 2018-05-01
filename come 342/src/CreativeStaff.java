import java.util.ArrayList;

public class CreativeStaff extends StaffMember {

	public CreativeStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super(staffNo, staffName, staffStartDate, staffEmailAddress);
		
	}
	
	public void AddNewStaff() {
		
		ArrayList <String> staff = new ArrayList <String> ();	
		staff.add(" 3,Hanefi Mercan,10.12.2018,hmercan@gmail.com");
		
		System.out.println (" Eklenen Creative personel  "+staff.get(0));
		
	}
public void assignStaffContact() {
		
		ArrayList <String> staffContact = new ArrayList <String> ();

		staffContact.add("Kazim Dagdelen 5322249268");

		System.out.println (staffContact.get(0));

		
	}


	@Override
	public void type() {
		System.out.println("Calisanin pozisyonu Graphic Designer");
		
	}
	
	
	
}

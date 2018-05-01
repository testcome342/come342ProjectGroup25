
public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Cınar mobilya","istanbul pendik","hasancnr08@cinarmobilya.com","İbrahim Çınar","ibrahimcinar@gmail.com",1);
		
		
		System.out.println("companyname: "+c1.getCompanyName());
		System.out.println("companyAddress: "+c1.getCompanyAddress());
		System.out.println("companyEmail: "+c1.getCompanyEmail());
		System.out.println("conctactName: "+c1.getContactName());
		System.out.println("contactEmail: "+c1.getContactEmail());
		System.out.println("id: "+c1.getId());
				
		
		c1.getClientCampaigns();
		c1.addNewCampaign();
		
		StaffMember s1 = new CreativeStaff(1,"Hasan","15.11.2018","hasancnr08@gmail.com");	
		StaffMember s2 = new AdminStaff(2,"Onur Dagdelen","20.12.2018","onurdagdelen@gmail.com");
		
		
		((CreativeStaff) s1).assignStaffContact();
		s1.getStaffDetails();
		((CreativeStaff) s1).AddNewStaff();
		s1.type();
		
		
	
		
		
		
		
	
		
		
		
		
		
		
				
		
		
	}
		
	
		
}

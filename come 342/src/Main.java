import controller.Campaign;

public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Çınar Mobilya","Pendik / İstanbul ","support@cinarmobilya.com","Hasan Çınar","hasancnr08@gmail.com",1);
		Campaign k1= new Campaign("%25 İndirim","27 Nisan Cuma","29 Nisan Pazar","Geçerli",500,1200);
		
		System.out.println("Company Name: "+c1.getCompanyName());
		System.out.println("Company Address: "+c1.getCompanyAddress());
		System.out.println("Company Email: "+c1.getCompanyEmail());
		System.out.println("Conctact Name: "+c1.getContactName());
		System.out.println("Contact Email: "+c1.getContactEmail());
		System.out.println("id: "+c1.getId());
		
		
		System.out.println("Campaign Title: "+k1.getCampaignTitle());
		System.out.println("Campaign StartDate: "+k1.getCampaignStartDate());
		System.out.println("Campaign FinishDate: "+k1.getCampaignFinishDate());
		System.out.println("Campaign  Currentstate: "+k1.getCurrentState());
		System.out.println("Campaign  Estimated Cost: "+k1.getEstimatedCost() );
		System.out.println("Campaign Budget: "+k1.getCampaignBudget());
		
		k1.createCampaign();
		
		
		

		
		c1.getClientCampaigns();
		c1.addNewCampaign();
		
		
		
		
	
		
		
		
		StaffMember s1 = new CreativeStaff(1,"Hasan","15.11.2018","hasancnr08@gmail.com");	
		
		((CreativeStaff) s1).assignStaffContact();
		s1.getStaffDetails();
		((CreativeStaff) s1).AddNewStaff();
		s1.type();
		
		StaffMember s2 = new AdminStaff(2,"Hanefi Mercan","20.12.2015","hmercan@gmail.com");
		
		
		
		((AdminStaff)s2).type();
	
	
		
		
		
		
	
		
		
		
		
		
		
				
		
		
	}
		
	
		
}

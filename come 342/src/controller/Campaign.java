package controller;

public class Campaign {

	public String campaignTitle, campaignStartDate, campaignFinishDate,currentState ;
	public int estimatedCost, campaignBudget;
	
	
	
	
	
	public void createCampaign() {
			
				
		}
public Campaign(String alinancampaignTitle,String alinancampaignStartDate,String alinancampaignFinishDate,String alinancurrentState,int alinanestimatedCost,int alinancampaignBudget) {
		
		setCampaignTitle(alinancampaignTitle);
		setCampaignStartDate(alinancampaignStartDate);
		setCampaignFinishDate(alinancampaignFinishDate);
		setCurrentState(alinancurrentState);
		setEstimatedCost(alinanestimatedCost);
		setCampaignBudget(alinancampaignBudget);
		
			
	}
	

	
	
	public String getCampaignTitle() {
		return campaignTitle;
	}
	public void setCampaignTitle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}
	public String getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}
	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	public int getCampaignBudget() {
		return campaignBudget;
	}
	public void setCampaignBudget(int campaignBudget) {
		this.campaignBudget = campaignBudget;
	}
	
	



	

}
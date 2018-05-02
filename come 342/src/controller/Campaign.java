package controller;

public class Campaign {

	public String campaignTitle, campaignStartDate, campaignFinishDate,currentState ;
	int estimatedCost, campaignBudget;
	
	
	
	public Campaign (String title,String campaignStartDate,String campaignFinishDate , String currentState, int estimatedCost,int campaignBudget) 
	{
		this.campaignTitle=title;
		this.campaignStartDate=campaignStartDate;
		this.campaignFinishDate=campaignFinishDate;
		this.currentState=currentState;
		this.estimatedCost=estimatedCost;
		this.campaignBudget=campaignBudget;
		
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
package treasureHunt;

public class TreasureHuntSimulator {
	private TreasureQuest[] quests;
	private int currentQuestIndex;
	
	public TreasureHuntSimulator(int numberOfQuests) {  
		quests = new TreasureQuest[numberOfQuests];
		currentQuestIndex=0; 
	}
	public void addQuest(TreasureQuest treasureQuest) {
		if (currentQuestIndex<quests.length) {
			quests[currentQuestIndex]= treasureQuest;
			currentQuestIndex++ ;
		}
	}
	public void startExpedition() {
		for (TreasureQuest quest : quests){
			quest.getLocation().displayLocation();
			TreasureQuest.displayQuestDetails(quest);
			TreasureHunter.inquire("What were you doing near the treasure?", quest.getHunter());
			System.out.println("Quest Expedition Completed.");
			System.out.println(" ");
			System.out.println("--------------------- New Quest -------------------");
			System.out.println(" ");
		}
		
	
	}

}

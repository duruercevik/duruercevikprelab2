package treasureHunt;

public class TreasureQuest {
	private TreasureLocation location;
	private TreasureHunter hunter;
	private Explorer explorer;
	
	public TreasureQuest(TreasureLocation location) {
		this.location=location;
	
	}
	public Explorer getExplorer() {
        return explorer;
    }
	public TreasureHunter getHunter() {
        return hunter;
    }

	public static void displayQuestDetails(TreasureQuest treasureQuest) {

		System.out.println("Quest Details:");
		System.out.println("Treasure Location:"+ treasureQuest.getLocation().getLocation() ) ;
		System.out.println("Explorer Name:"+ treasureQuest.getExplorer().getName());
		System.out.println("Treasure Hunter Name:"+ treasureQuest.getHunter().getName());
		
		
		
		
		
		
		
		
	}
	public TreasureLocation getLocation() {
		return location;
	}
	public void setLocation(TreasureLocation location) {
		this.location = location;
	}
	public void setHunter(TreasureHunter hunter) {
		this.hunter = hunter;
	}
	public void setExplorer(Explorer explorer) {
		this.explorer = explorer;
	}

}

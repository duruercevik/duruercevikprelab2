package treasureHunt;

public class TreasureLocation {
	private String location;
	private String[] clues;
	private int numOfClues;
	private static final int MAX_CLUES=5;
	
	public TreasureLocation(String location) {
		this.location=location;
		clues=new String [MAX_CLUES];
	}
	public void addClue(String clue) {
		if (numOfClues < MAX_CLUES) {  
            clues[numOfClues] = clue;  
            numOfClues+=1;              
        } else {
            System.out.println("Clue limit reached for this location.");
        }
		
	}
	public void displayLocation() {
		System.out.println("Treasure Location: " + location);

        if (numOfClues != 0) {
            System.out.println("Clues:");
            for (int i = 0; i < numOfClues; ++i) {
                System.out.println(clues[i]);
            }
        }
		
	}
	public String getLocation() {
		return location;
	}
	public String[] getClues() {
		return clues;
	}
	public int getNumOfClues() {
		return numOfClues;
	}
	public static int getMaxClues() {
		return MAX_CLUES;
	}

}

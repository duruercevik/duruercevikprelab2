package treasureHunt;
import java.util.Random;

public class TreasureHunter {
	private String name;
	private String excuse;
	private final static Random RAND= new Random(2024);
	
	public TreasureHunter(String name, String excuse) {
		this.name=name;
		this.excuse=excuse;
	
	}	
	
	public static void inquire(String question, TreasureHunter treasureHunter) {
		System.out.println("Explorer:"+question);
		System.out.println("Treasure Hunter "+treasureHunter.name+"'s response:"+treasureHunter.excuse);
		boolean response= RAND.nextBoolean();
		if (response==true) {
			System.out.println("Treasure Hunter "+ treasureHunter.name+ "is innocent.");
		}else {
			System.out.println("Treasure Hunter "+ treasureHunter.name+ "is guilty.");
		}
		
		
		
	}
	public String getName() {
		return name;
	}

	public String getExcuse() {
		return excuse;
	}
	

}

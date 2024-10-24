package adventure;
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted on the course website, and (3) any study notes handwritten by myself.
I have not used, accessed, or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME, AND STUDENT ID
SIGNATURE: <Duru Erçevik, 0086602>
********************************************************************************/

import treasureHunt.*;

public class Main {

    public static void main(String[] args) {
        // Create a treasure hunt simulator with a fixed number of quests
        TreasureHuntSimulator simulator = new TreasureHuntSimulator(3);

        Explorer e1 = new Explorer("Indiana Jones", 101);
        Explorer e2 = new Explorer("Lara Croft", 102);
        Explorer e3 = new Explorer("Nathan Drake", 103);

        // Create and add locations to the simulator
        TreasureLocation location1 = new TreasureLocation("Skull Island");
        TreasureLocation location2 = new TreasureLocation("Temple of Doom");
        TreasureLocation location3 = new TreasureLocation("Lost City of Atlantis");
        TreasureLocation location4 = new TreasureLocation("Forbidden Forest");

        location1.addClue("Ancient Map");
        location1.addClue("Golden Idol");

        location2.addClue("Broken Amulet");
        location2.addClue("Stone Key");

        location3.addClue("Waterlogged Chest");
        location3.addClue("Coral Necklace");
        location3.addClue("Ancient Scroll");
        location3.addClue("Mysterious Statue");
        location3.addClue("Rusty Sword");
        location3.addClue("Sealed Bottle");

        // Add treasure hunters to the quests
        TreasureHunter hunter1 = new TreasureHunter("Blackbeard", "I was looking for my ship.");
        TreasureHunter hunter2 = new TreasureHunter("Calypso", "I was collecting herbs.");
        TreasureHunter hunter3 = new TreasureHunter("Captain Hook", "I lost my hook.");

        // Create and add quests to the simulator
        TreasureQuest quest1 = new TreasureQuest(location1);
        TreasureQuest quest2 = new TreasureQuest(location2);
        TreasureQuest quest3 = new TreasureQuest(location3);
        TreasureQuest quest4 = new TreasureQuest(location4);

        quest1.setHunter(hunter3);
        quest2.setHunter(hunter2);
        quest3.setHunter(hunter1);

        quest1.setExplorer(e1);
        quest2.setExplorer(e2);
        quest3.setExplorer(e3);

        // Add quests to the simulator
        simulator.addQuest(quest1);
        simulator.addQuest(quest2);
        simulator.addQuest(quest3);
        simulator.addQuest(quest4);

        // Start the expedition
        simulator.startExpedition(); 
    } 
}
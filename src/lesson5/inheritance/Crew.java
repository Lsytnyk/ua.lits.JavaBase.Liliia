package lesson5.inheritance;

import lesson5.inheritance.Mission;

public class Crew extends Mission {

        int crewSize;

        public Crew(String mission, String captain, String launchSite, boolean isHumanCrew, int crewSize){
        super(mission, captain, launchSite, isHumanCrew);
        this.crewSize = crewSize;
        }

        public void crewSoze(int[] pilot){
            System.out.println("Crew size: " + crewSize);
        }

}

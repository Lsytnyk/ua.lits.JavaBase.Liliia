package lesson5.inheritance;

public class Mission extends SpaseX{
    public boolean isHumanCrew = false;

    public Mission(String mission, String captain, String launchSite, boolean isHumanCrew){
        super(mission, captain, launchSite);
        this.isHumanCrew = isHumanCrew;
    }

    public void isCrew(){
        if(isHumanCrew = false){
            System.out.println("This mission will be completed by autopilot");
        }
        else {
            System.out.println("This mission will be operated by captain " + captain);
        }
    }
}

package lesson5.inheritance;

public class SpaseX {
    String captain;
    String launchSite;
    String mission;

    public  SpaseX(){

    }

    public SpaseX(String captain, String launchSite, String mission){
        this.captain = captain;
        this.launchSite = launchSite;
        this.mission = mission;
    }

    public String  getMission(){
        return mission;
    }


}

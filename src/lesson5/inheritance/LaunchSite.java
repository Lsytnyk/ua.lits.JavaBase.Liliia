package lesson5.inheritance;

public class LaunchSite extends SpaseX{
    String launchDescription;

    public  LaunchSite(String mission, String captain, String launchSite, String launchDescription){
        super(mission, captain, launchSite);
        this.launchDescription = launchDescription;
    }
}


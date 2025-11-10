package Facade;

public class BugTracker {
    public boolean isActiveS;
    public boolean isActive() {
    return isActiveS;
    }

    public void startTracking() {
        System.out.println("Starting tracking.");
        isActiveS = true;
    }
    public void stopTracking() {
        System.out.println("Stopping tracking.");
        isActiveS = false;
    }

}

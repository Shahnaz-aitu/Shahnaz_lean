package Facade;

public class DeveloperF {
    public void DeveloperWork(BugTracker bugTracker) {
        if (bugTracker.isActiveS){
            System.out.println("Developer is already active.");
        }
        else {
            System.out.println("Developer is already deactivated.");
        }
    }
}

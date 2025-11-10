package Facade;

import Decorator.Developer;

public class WorkFlow {
    Job job=new Job();
    DeveloperF developer=new DeveloperF();
    BugTracker bugTracker=new BugTracker();

    public void solveProblem(){
        job.doJob();
        bugTracker.startTracking();
        developer.DeveloperWork(bugTracker);

    }


}

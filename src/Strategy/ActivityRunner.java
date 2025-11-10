package Strategy;

public class ActivityRunner {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void runActivity() {
        activity.activity();
    }
}

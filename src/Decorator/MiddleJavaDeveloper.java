package Decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator{
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String operate() {
        return "Middle Java Developer.";
    }
    @Override
    public String makeJob() {
        return super.makeJob() + operate();
    }
}

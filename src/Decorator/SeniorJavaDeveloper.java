package Decorator;

import java.text.MessageFormat;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String getDescription() {
        return "Senior Java Developer";
    }
    @Override
    public String makeJob(){
        return super.makeJob() + getDescription();
    }
}

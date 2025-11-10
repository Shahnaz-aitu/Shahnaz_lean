package Decorator;

public class DecorRunner {
    public static void main(String[] args) {
        DeveloperDecorator dev=new SeniorJavaDeveloper(new MiddleJavaDeveloper(new JavaDeveloper()));
        System.out.println(dev.makeJob());
    }
}

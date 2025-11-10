import Bridge.Black;
import Bridge.*;
import Builder.*;
import Builder1.cosmetics;
import Factory.*;
import AbstractFactory.*;
import Decorator.*;
import Facade.*;
import Adapt.*;
import Strategy.*;
import Observer.*;
import Singleton.*;
import Visitor.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //AbstractFactory caller
        Coffee coffee=new ItalyCoffee();
        Hot hotCoffee=coffee.makeHotCoffee();
        hotCoffee.makeHot();
        //Adapter caller
        Adaptee adapt= new Adaptee();
        Animal lion=new Adapter(adapt);
        System.out.println(lion.getInfo());
        //Bridge caller
        Bread bread=new Black(new Jem());
        bread.getBread();
        //Builder caller
        ConcreteBuilder car=new ConcreteBuilder();
        Director director=new Director();
        director.car1(car);
        //Builder1
        cosmetics dd=new cosmetics.Builder()
                .setCosmetica("kushon")
                .setPrice(345)
                .build();

        //Decorator caller
        DeveloperDecorator dev=new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(dev.makeJob());
        //Facade caller
        WorkFlow work=new WorkFlow();
        work.solveProblem();
        //Factory
        LipstickFactory lipstickFactory=new LipstickFactory();
        lipstickFactory.createCosmetic();
        //Strategy
        ActivityRunner run=new ActivityRunner();
        run.setActivity(new Picnic());
        run.runActivity();
        //Observer
        JavaDeveloperJobSite jobSite=new JavaDeveloperJobSite();
        Observer observer1=new Subscriber("Shahnaz");
        jobSite.addObserver(observer1);
        jobSite.addVacancy("Java developer");
        //Singleton
        ProgramLogger.getInstance().addLoggerInfo("First log");
        ProgramLogger.getInstance().addLoggerInfo("Second log");
        ProgramLogger.getInstance().showLog();
        //Visitor
        Drive carV=new Bus();
        carV.accept(new Pay());
    }
}

package Visitor;

public class Car implements Drive{
    @Override
    public void accept(Visitor visitor){
        visitor.sitCar(this);
        System.out.println("Car");
    }
}

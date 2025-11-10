package Visitor;

public class Pay implements Visitor{
    @Override
    public void sitCar(Car car){
        System.out.print("pay for sit");
    }
    @Override
    public void sitBus(Bus bus){
        System.out.print("pay for sit");
    }
}

package Visitor;

public class Bus implements Drive{
    @Override
    public void accept(Visitor visitor) {
        visitor.sitBus(this);
        System.out.print(" Bus");
    }
}

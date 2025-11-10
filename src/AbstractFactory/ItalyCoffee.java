package AbstractFactory;

public class ItalyCoffee implements Coffee {
    @Override
    public Cold makeColdCoffee() {
        return new ItalyColdCoffee();
    }
    @Override
    public Hot makeHotCoffee() {
        return new ItalyHotCoffee();
    }
}

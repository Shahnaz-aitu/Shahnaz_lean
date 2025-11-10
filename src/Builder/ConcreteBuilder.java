package Builder;

public class ConcreteBuilder implements Builder {

@Override
    public void setModel(String model) {
       System.out.println("Model is: " + model);
}
@Override
    public void setColor(String color) {
    System.out.println("Color is: " + color);
}
@Override
    public Car build() {
    return null;
}
}

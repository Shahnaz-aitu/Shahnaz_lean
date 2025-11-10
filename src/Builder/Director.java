package Builder;

public class Director {
    public Car car1(Builder builder){
        builder.setModel("BMV");
        builder.setColor("red");
        return builder.build();
    }
    public Car car2(Builder builder){
        builder.setModel("Mercedes");
        builder.setColor("blue");
        return builder.build();
    }

}
